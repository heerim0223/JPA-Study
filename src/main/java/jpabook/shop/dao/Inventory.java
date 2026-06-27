package jpabook.shop.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "inventories")
public class Inventory {
    @Id @GeneratedValue
    @Column(name = "inventory_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sku_id")
    private SkuOptionValue skuOptionValue;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "safety_stock")
    private Integer safetyStock;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Version
    private Long version;
}
