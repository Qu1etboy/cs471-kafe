package ku.cs.kafe.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import ku.cs.kafe.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, UUID> {

}
