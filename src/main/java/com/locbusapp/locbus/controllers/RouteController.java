package com.locbusapp.locbus.controllers;


import com.locbusapp.locbus.DTO.RouteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.locbusapp.locbus.services.BusLocationService;

import java.util.List;

@RestController
@RequestMapping("/routes")
public class RouteController {

    @Autowired
    private BusLocationService busLocationService;


    @GetMapping
    public List<RouteDTO> getAllRoutes() {
        return busLocationService.getRoutes();
    }
}
