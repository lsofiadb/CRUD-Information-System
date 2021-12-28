package backend.agricolas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
