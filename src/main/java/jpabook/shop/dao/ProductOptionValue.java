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
@Table(name = "product_option_value")
public class ProductOptionValue {
    @Id @GeneratedValue
    @Column(name = "product_option_value_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "option_group_id")
    private ProductOptionGroup productOptionGroup;

    @Column(name = "value")
    private String value;

    @Column(name = "sort_order")
    private Integer sortOrder;

    @OneToMany(targetEntity = SkuOptionValue.class, mappedBy = "productOptionValue")
    private List<SkuOptionValue> skuOptionValues = new ArrayList<>();
}
