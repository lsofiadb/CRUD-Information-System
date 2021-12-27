package backend.agricolas.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id @Column(name = "code")
    private Long code;
    @Column(name = "name")
    private String name;
    @Column(name = "category")
    private String category;
    @OneToMany(mappedBy = "product")
    private List<Inventory> inventories;
}
