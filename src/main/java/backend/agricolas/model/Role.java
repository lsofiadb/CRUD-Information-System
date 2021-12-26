package backend.agricolas.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Role")
@Data
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @OneToMany(mappedBy = "role")
    private List<Person> personList;
}
