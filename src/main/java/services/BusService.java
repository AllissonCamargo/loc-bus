package services;

import DTO.BusDTO;
import entities.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.BusRepository;

import java.util.List;

public class BusService {

    @Autowired
    private BusRepository busRepository;

    public List<BusDTO> findAll() {
        List<Bus> result = busRepository.findAll();
        return result.stream().map(x -> new BusDTO(x)).toList();
    }
}
