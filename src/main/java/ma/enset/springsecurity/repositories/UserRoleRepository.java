package ma.enset.springsecurity.repositories;

import ma.enset.springsecurity.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
