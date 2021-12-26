package backend.agricolas.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "person")
@Data
public class Person {
    @Id @Column(name = "cc")
    private Long cc;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "cellphone")
    private Long cellphone;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @ManyToOne @JoinColumn(name = "role_id")
    private Role role;
    @OneToOne(mappedBy = "person")
    private Location location;
}
