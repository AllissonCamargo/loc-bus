package com.locbusapp.locbus.services;


import com.locbusapp.locbus.DTO.BusDTO;
import com.locbusapp.locbus.DTO.RouteDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class BusLocationService {

    private final List<BusDTO> buses = new ArrayList<>();
    private final Random random = new Random();

    public BusLocationService() {
        // Mock inicial dos ônibus
        buses.add(new BusDTO(1L, "ABC-1234", -23.5505, -46.6333, true));  // ônibus ativo
        buses.add(new BusDTO(2L, "DEF-5678", -23.5600, -46.6400, false)); // ônibus inativo
        buses.add(new BusDTO(3L, "GHI-9012", -23.5450, -46.6200, true));  // ônibus ativo
    }

    // Simula deslocamento dos ônibus ativos
    private void simulateMovement() {
        for (BusDTO bus : buses) {
            if (bus.isActive()) {
                double latChange = (random.nextDouble() - 0.5) * 0.001;
                double lonChange = (random.nextDouble() - 0.5) * 0.001;
                bus.setLatitude(bus.getLatitude() + latChange);
                bus.setLongitude(bus.getLongitude() + lonChange);
            }
        }
    }
    public List<BusDTO> getAllBuses() {
        simulateMovement();
        return new ArrayList<>(buses);
    }


    public List<BusDTO> getActiveBuses() {
        simulateMovement();
        return buses.stream().filter(BusDTO::isActive).toList();
    }

    public List<RouteDTO> getRoutes() {
        List<RouteDTO> routes = new ArrayList<>();
        routes.add(new RouteDTO("101", "Terminal Central - Bairro X"));
        routes.add(new RouteDTO("102", "Terminal Sul - Bairro Y"));
        return routes;
    }
}

//@Service
//public class BusLocationService {
//    private final WebClient webClient;
//
//    public BusLocationService() {
//        this.webClient = WebClient.builder().baseUrl("url da api").build();
//    }
//
//    public List<BusDTO> getAllBuses() {
//
//
//        return webClient.get().uri("/buses")
//                .retrieve()
//                .bodyToFlux(BusDTO.class)
//                .collectList()
//                .block();
//    }
//
//    public List<BusDTO> getActiveBuses() {
//        return getAllBuses().stream().filter(BusDTO::isActive).collect(Collectors.toList());
//    }
//
//    public List<RouteDTO> getRoutes() {
//        return webClient.get()
//                .uri("/routes")
//                .retrieve()
//                .bodyToFlux(RouteDTO.class)
//                .collectList()
//                .block();
//    }
//
//}
