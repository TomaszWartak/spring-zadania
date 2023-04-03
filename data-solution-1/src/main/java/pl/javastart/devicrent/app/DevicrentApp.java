package pl.javastart.devicrent.app;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DevicrentApp {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("devicrentPU");
        emFactory.close();
    }
}
