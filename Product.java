package com.system.Fashionhive.entity;


import jakarta.persistence.*;
import lombok.*;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
//image 
public class Product {

    @Id
    @SequenceGenerator(name = "Fashionhive_product_seq_gen", sequenceName = "Fashionhive_product_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "Fashionhive_product_seq_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false,name = "product_name")
    private String product_name;

    @Column(nullable = false,name = "product_price")
    private double product_price;

    @Column(nullable = false,name = "product_quantity")
    private double product_quantity;

    @Column(nullable = false,name = "product_description")
    private String product_description;

    @Column(nullable = false,name = "product_size")
    private String product_size;

    @Column(nullable = false,name = "product_color")
    private String product_color;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_category",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_categoryId"))
    private Category product_category;

    @Column(name = "product_image",nullable = false)
    private String product_image;

    @Transient
    private String product_imageBase64;
}
