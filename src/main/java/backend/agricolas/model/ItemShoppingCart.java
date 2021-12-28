package backend.agricolas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "item_shopping_cart")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemShoppingCart {
    @Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "quantity")
    private Long quantity;
    @Column(name = "subtotal_price")
    private double subtotal_price;
    @ManyToOne @JoinColumn(name = "shopping_cart_id")
    private ShoppingCart shoppingCart;
    @ManyToOne @JoinColumn(name = "inventory_id")
    private Inventory inventory;
}
