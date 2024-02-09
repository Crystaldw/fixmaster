package de.telran.fixmaster.repository;

import de.telran.fixmaster.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
