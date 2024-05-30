package dev.xin.VehicleServiceChecker.vehicle;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    //field injectction with @Autowired is not reocommended
    private VehicleService vehicleService;

    public VehicleController (VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    @PostMapping
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.saveVehicle(vehicle);
    }

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @GetMapping("/{id}")
    public Optional<Vehicle> getVehicleById(@PathVariable String id) {
        return vehicleService.getVehicleById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteVehicle(@PathVariable String id) {
        vehicleService.deleteVehicle(id);
    }
}
