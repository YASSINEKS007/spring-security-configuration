package ma.enset.springsecurity.services;

import ma.enset.springsecurity.entities.AppUser;
import ma.enset.springsecurity.entities.UserRole;

import java.util.List;

public interface MyService {
    AppUser save(AppUser user);
    AppUser findAppUserById(Long id);
    AppUser findAppUserByUsername(String username);
    AppUser updateAppUser(Long id, AppUser user);
    void deleteAppUserById(Long id);
    List<AppUser> findAllAppUsers();

    UserRole saveUserRole(UserRole userRole);
    UserRole findUserRoleById(Long id);
    void deleteUserRole(Long id);

}
