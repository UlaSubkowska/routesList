package com.test.gradleMysql.routes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {

    @Autowired
    private RouteRepository routeRepository;

    @PostMapping(path="/routes")
    public String addRoute (@RequestBody Route route) {
        routeRepository.save(route);
        return "Rout saved successfully";
    }

    @GetMapping("/routes")
    public Iterable<Route> getRoutes() {
        return routeRepository.findAll();
    }
}
