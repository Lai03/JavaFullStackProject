package dev.xin.VehicleServiceChecker.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
    //field injectction with @Autowired is not reocommended
    private VehicleRepository vehicleRepository;

    public VehicleService (VehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Optional<Vehicle> getVehicleById(String id) {
        return vehicleRepository.findById(id);
    }

    public void deleteVehicle(String id) {
        vehicleRepository.deleteById(id);
    }
}
