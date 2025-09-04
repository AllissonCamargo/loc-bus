package controllers;


import DTO.RouteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.BusLocationService;

import java.util.List;

@RestController
@RequestMapping("/routes")
public class RouteController {

    @Autowired
    private BusLocationService busLocationService;

    public List<RouteDTO> getAllRoutes() {
        return busLocationService.getRoutes();
    }
}
