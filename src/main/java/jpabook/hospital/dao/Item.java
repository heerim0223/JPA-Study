package jpabook.hospital.dao;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Entity
@Table(name = "items")
public class Item {
    @Id @GeneratedValue
    @Column(name = "item_id")
    private Integer id;

    @Column(name = "label")
    private String label;

    @Column(name = "category")
    private String category;

    @Column(name = "unit_name")
    private String unitName;

    @Column(name = "low_normal")
    private BigDecimal lowNormal;

    @Column(name = "high_normal")
    private BigDecimal highNormal;
}
