package learning.Spring.Security.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

//@Entity
//@Table(name = "Person_info")
@Data
public class PersonEntity {

    private String firstName;

    private String lastName;
}
