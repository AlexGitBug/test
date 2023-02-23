package entity;

import entity.enums.Brand;
import entity.enums.Color;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "product", schema = "public")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "catalog_id")
    private int catalogId;
    @Column(unique = true)
    private Brand brand;
    @Column(unique = true)
    private String model;
    @Column()
    private LocalDate dateOfRelease;
    @Column
    private int price;
    @Enumerated(EnumType.STRING)
    private Color color;
}
