package pl.javastart.devicrent2.dao;

import org.springframework.stereotype.Repository;
import pl.javastart.devicrent2.model.Device;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class DeviceDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Device save(Device device) {
        entityManager.persist(device);
        return device;
    }

    public Device read(Long id) {
        return entityManager.find(Device.class, id);
    }

    @Transactional
    public Device update(Device device) {
        return entityManager.merge(device);
    }

    @Transactional
    public void delete(Device device) {
        Device attachedDevice = read(device.getId());
        entityManager.remove(attachedDevice);
    }
}
