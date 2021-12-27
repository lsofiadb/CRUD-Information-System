package backend.agricolas.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "inventory")
@Data
public class Inventory {
    @Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "stock")
    private Long stock;
    @Column(name = "price")
    private double price;
    @Column(name = "url_image")
    private String url_image;
    @ManyToOne @JoinColumn(name = "farm_id")
    private Farm farm;
    @ManyToOne @JoinColumn(name = "product_code")
    private Product product;
    @OneToMany(mappedBy = "inventory")
    private List<ItemShoppingCart> itemShoppingCarts;
}
