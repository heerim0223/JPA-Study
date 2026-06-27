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
@Table(name = "inventory_logs")
public class InventoryLog {
    @Id @GeneratedValue
    @Column(name = "log_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sku_id")
    private SkuOptionValue skuOptionValue;

    @Column(name = "change_type")
    private String changeType;

    @Column(name = "quantity_diff")
    private Integer quantityDiff;

    @Column(name = "ref_id", nullable = true)
    private Long refId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
