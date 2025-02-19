package pe.edu.cibertec.app_services_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.app_services_demo.entity.Vehicle;
import pe.edu.cibertec.app_services_demo.repository.VehicleRepository;

@Controller
public class VehicleController {

    @Autowired
    VehicleRepository vehicleRepository;

    @GetMapping("/")
    public String getVehicles(Model model){

        Iterable<Vehicle> vehicles = vehicleRepository.findAll();
        model.addAttribute("vehicles", vehicles);
        return "vehicles";

    }

}
