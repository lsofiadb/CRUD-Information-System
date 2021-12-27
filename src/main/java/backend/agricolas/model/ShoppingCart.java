package backend.agricolas.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "shopping_cart")
@Data
public class ShoppingCart {
    @Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date") @CreationTimestamp
    private Date date;
    @Column(name = "total_price")
    private double total_price;
    @ManyToOne @JoinColumn(name = "farm_id")
    private Farm farm;
    @ManyToOne @JoinColumn(name = "person_cc")
    private Person person;
    @OneToMany(mappedBy = "shoppingCart")
    private List<ItemShoppingCart> itemShoppingCarts;

}
