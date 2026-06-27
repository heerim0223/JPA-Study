package jpabook.shop.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_option_group")
public class ProductOptionGroup {
    @Id @GeneratedValue
    @Column(name = "option_group_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "name")
    private String name;

    @Column(name = "sort_order")
    private Integer sortOrder;

    @OneToMany(targetEntity = ProductOptionValue.class, mappedBy = "productOptionGroup")
    private List<ProductOptionValue> productOptionValues = new ArrayList<>();
}
