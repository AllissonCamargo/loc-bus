package controllers;

import DTO.BusLineDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.BusLineService;

import java.util.List;

@RestController
@RequestMapping("/lines")
public class BusLineController {

    @Autowired
    private BusLineService busLineService;


    @GetMapping
    public List<BusLineDTO> findAll() {
        return busLineService.findAll();
    }
}
