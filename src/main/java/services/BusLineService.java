package services;

import DTO.BusLineDTO;
import entities.BusLine;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.BusLineRepository;
import repositories.BusRepository;

import java.util.List;

public class BusLineService {

    @Autowired
    private BusLineRepository busLineRepository;

    public List<BusLineDTO> findAll() {
        List<BusLine> result = busLineRepository.findAll();
        return result.stream().map(x -> new BusLineDTO(x)).toList();
    }
}
