package ku.cs.kafe.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import ku.cs.kafe.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, UUID> {

}
