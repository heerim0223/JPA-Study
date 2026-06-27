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
@Table(name = "stock_receipts")
public class StockReceipt {
    @Id @GeneratedValue
    @Column(name = "receipt_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sku_id")
    private SkuOptionValue skuOptionValue;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "unit_cost")
    private Integer unitCost;

    @Column(name = "received_at")
    private LocalDateTime receivedAt;

    @Column(name = "note", nullable = true)
    @Lob
    private String note;
}
