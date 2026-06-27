package jpabook.shop.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id @GeneratedValue
    @Column(name = "product_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "name")
    private String name;

    @Column(name = "description", nullable = true)
    @Lob
    private String description;

    @Column(name = "base_price")
    private Integer basePrice;

    @Column(name = "status")
    private String status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;
    @OneToMany(targetEntity = ProductSku.class, mappedBy = "product")
    private List<ProductSku> productSkus = new ArrayList<>();

    @OneToMany(targetEntity = ProductImage.class, mappedBy = "product")
    private List<ProductImage> productImages = new ArrayList<>();

    @OneToMany(targetEntity = ProductOptionGroup.class, mappedBy = "product")
    private List<ProductOptionGroup> productOptionGroup = new ArrayList<>();

    @OneToMany(targetEntity = Review.class, mappedBy = "product")
    private List<Review> reviews = new ArrayList<>();

    @OneToMany(targetEntity = Qna.class, mappedBy = "product")
    private List<Qna> qnas = new ArrayList<>();
}
