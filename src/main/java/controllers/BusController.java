package controllers;


import DTO.BusDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.BusService;

import java.util.List;

@RestController
@RequestMapping(value = "/buses")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping
    public List<BusDTO> findAll() {
        return busService.findAll();
    }

}
