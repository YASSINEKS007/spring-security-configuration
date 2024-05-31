package ma.enset.springsecurity.services;

import lombok.AllArgsConstructor;
import ma.enset.springsecurity.entities.AppUser;
import ma.enset.springsecurity.entities.UserRole;
import ma.enset.springsecurity.repositories.AppUserRepository;
import ma.enset.springsecurity.repositories.UserRoleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class MyServiceImpl implements MyService{
    private AppUserRepository appUserRepository;
    private UserRoleRepository userRoleRepository;
    @Override
    public AppUser save(AppUser user) {
        return appUserRepository.save(user);
    }

    @Override
    public AppUser findAppUserById(Long id) {
        return appUserRepository.findById(id).orElse(null);
    }

    @Override
    public AppUser findAppUserByUsername(String username) {
        return appUserRepository.findByUsername(username);
    }

    @Override
    public AppUser updateAppUser(Long id, AppUser user) {
        AppUser appUser = findAppUserById(id);
        appUser.setUsername(user.getUsername());
        appUser.setPassword(user.getPassword());
        return appUserRepository.save(appUser);
    }

    @Override
    public void deleteAppUserById(Long id) {
        appUserRepository.deleteById(id);
    }

    @Override
    public List<AppUser> findAllAppUsers() {
        return appUserRepository.findAll();
    }

    @Override
    public UserRole saveUserRole(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    @Override
    public UserRole findUserRoleById(Long id) {
        return userRoleRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUserRole(Long id) {
        userRoleRepository.deleteById(id);
    }
}
