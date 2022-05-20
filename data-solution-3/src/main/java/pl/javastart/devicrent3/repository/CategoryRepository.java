package pl.javastart.devicrent3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javastart.devicrent3.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}