package com.locbusapp.locbus.controllers;

import com.locbusapp.locbus.DTO.BusDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.locbusapp.locbus.services.BusLocationService;

import java.util.List;

@RestController
@RequestMapping("/buses")
public class BusController {

    @Autowired
    private BusLocationService busLocationService;

    @GetMapping
    public List<BusDTO> getAllBuses() {
        return busLocationService.getAllBuses();
    }

    @GetMapping("/active")
    public List<BusDTO> getActiveBuses() {
        return busLocationService.getActiveBuses();
    }


}
