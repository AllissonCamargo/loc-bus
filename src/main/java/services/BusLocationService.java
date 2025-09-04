package services;


import DTO.BusDTO;
import DTO.RouteDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BusLocationService {
    private final WebClient webClient;

    public BusLocationService() {
        this.webClient = WebClient.builder().baseUrl("url da api").build();
    }

    public List<BusDTO> getAllBuses() {


        return webClient.get().uri("/buses")
                .retrieve()
                .bodyToFlux(BusDTO.class)
                .collectList()
                .block();
    }

    public List<BusDTO> getActiveBuses() {
        return getAllBuses().stream().filter(BusDTO::isActive).collect(Collectors.toList());
    }

    public List<RouteDTO> getRoutes() {
        return webClient.get()
                .uri("/routes")
                .retrieve()
                .bodyToFlux(RouteDTO.class)
                .collectList()
                .block();
    }






}
