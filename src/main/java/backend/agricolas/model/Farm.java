package backend.agricolas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "farm")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Farm {
    @Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "url_image")
    private String url_image;
    @Column(name = "land_area")
    private double land_area;
    @OneToOne @JoinColumn(name = "location_id")
    private Location location;
    /*
    @OneToMany(mappedBy = "farm")
    private List<ShoppingCart> shoppingCarts;
    @OneToMany(mappedBy = "farm")
    private List<Inventory> inventories;
     */
}
