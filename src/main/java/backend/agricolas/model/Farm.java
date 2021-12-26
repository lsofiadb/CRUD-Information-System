package backend.agricolas.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "farm")
@Data
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
}
