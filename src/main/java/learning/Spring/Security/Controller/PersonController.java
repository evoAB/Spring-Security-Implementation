package learning.Spring.Security.Controller;

import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
//@RequestMapping("/person")
public class PersonController {

    @GetMapping("/home")
    public String home(){
        return "Welcome to Home";
    }

    @GetMapping("/office")
    public String office(){
        return "Welcome to office";
    }

    @GetMapping("/getUser")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
