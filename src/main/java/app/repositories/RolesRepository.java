package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import app.entities.Roles;

public interface RolesRepository extends JpaRepository<Roles, Integer> {
}
