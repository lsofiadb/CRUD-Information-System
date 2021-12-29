package backend.agricolas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "location")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    @Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "department")
    private String department;
    @Column(name = "municipality")
    private String municipality;
    @Column(name = "address")
    private String address;
    @Column(name = "details")
    private String details;
    @OneToOne @JoinColumn(name = "person_cc")
    private Person person;
    /*
    @OneToOne(mappedBy = "location")
    private Farm farm;
     */
}
