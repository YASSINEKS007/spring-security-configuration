package ma.enset.springsecurity.entities;

import lombok.Data;

import java.util.List;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private List<String> roles;
}
