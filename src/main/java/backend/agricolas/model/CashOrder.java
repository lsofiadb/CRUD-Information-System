package backend.agricolas.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cash_order")
@Data
public class CashOrder {

    @Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date") //@CreationTimestamp
    private Date date;
    @Column(name = "total_price")
    private double total_price;
    @ManyToOne @JoinColumn(name = "farm_id")
    private Farm farm;
    @ManyToOne @JoinColumn(name = "person_cc")
    private Person person;

}
