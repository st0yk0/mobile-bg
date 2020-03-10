package bg.mobile.users.entities;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import static bg.mobile.constants.Constants.UUID_SIZE;

@Data
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy = "uuid2")
    @Column(name="id", length = UUID_SIZE)
    private String id;

    @Column(nullable = false , unique = true)
    private String username;

    @ToString.Exclude
    @Column(nullable = false)
    private String password;

    @Column(name="first_name" , nullable = false)
    private String firstName;

    @Column(name="last_name" , nullable = false)
    private String lastName;
}
