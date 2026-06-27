package jpabook.shop.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_images")
public class ProductImage {
    @Id @GeneratedValue
    @Column(name = "product_image_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "url")
    private String url;

    @Column(name = "is_thumbnail")
    private Boolean isThumbnail;

    @Column(name = "sort_order")
    private Integer sortOrder;
}
