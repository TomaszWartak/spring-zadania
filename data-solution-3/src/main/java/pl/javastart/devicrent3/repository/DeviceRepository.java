package pl.javastart.devicrent3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javastart.devicrent3.model.Device;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}