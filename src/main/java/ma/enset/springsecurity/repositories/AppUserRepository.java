package ma.enset.springsecurity.repositories;

import ma.enset.springsecurity.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
    Boolean existsByUsername(String username);

}
