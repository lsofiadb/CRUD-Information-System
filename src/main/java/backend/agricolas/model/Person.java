package backend.agricolas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "person")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    @ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER) @JoinColumn(name = "role_id")
    private Role role;
    @OneToOne(mappedBy = "person")
    private Location location;
    @OneToMany(mappedBy = "person")
    private List <ShoppingCart> shoppingCarts;
}
