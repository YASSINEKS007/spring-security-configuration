package ma.enset.springsecurity.web;

import lombok.AllArgsConstructor;
import ma.enset.springsecurity.services.MyService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
public class AppUserRestController {
    private MyService myService;


}
