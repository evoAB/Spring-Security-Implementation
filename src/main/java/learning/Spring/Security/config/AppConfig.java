package learning.Spring.Security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

//@Contfigration: it is use to create Bean
@Configuration
public class AppConfig {

//    @Bean : it is use to make object of method which will store
//    in IOC container so that we can use it using @Autowired

//    UserDetailsService : interface will be fetched when user tries login
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user = User.builder().username("abc").password(passwordEncoder().encode("ab")).roles("PERSON").build();
        UserDetails user1 = User.builder().username("xyz").password(passwordEncoder().encode("xy")).roles("ADMIN").build();
        return new InMemoryUserDetailsManager(user, user1);
    }

//    PasswordEncoder : it encodes pass to make it secure

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
