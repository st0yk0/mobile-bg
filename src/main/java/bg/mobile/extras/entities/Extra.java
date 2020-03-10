package bg.mobile.extras.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import static bg.mobile.constants.Constants.UUID_SIZE;

@Data
@Entity
@Table(name="extras")
public class Extra {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy = "uuid2")
    @Column(name="id", length = UUID_SIZE)
    private String id;

    @Column(nullable = false , unique = true)
    private String name;
}
