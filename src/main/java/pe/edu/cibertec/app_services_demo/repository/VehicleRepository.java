package pe.edu.cibertec.app_services_demo.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.cibertec.app_services_demo.entity.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
}
