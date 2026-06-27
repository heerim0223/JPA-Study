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
@Table(name = "product_skus")
public class ProductSku {
    @Id @GeneratedValue
    @Column(name = "sku_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "sku_code")
    private String skuCode;

    @Column(name = "additional_price")
    private Integer additionalPrice;

    @Column(name = "status")
    private String status;

    @OneToMany(targetEntity = SkuOptionValue.class, mappedBy = "productSku")
    private List<SkuOptionValue> skuOptionValues = new ArrayList<>();

    @OneToMany(targetEntity = Inventory.class, mappedBy = "productSku")
    private List<Inventory> inventories = new ArrayList<>();

    @OneToMany(targetEntity = InventoryLog.class, mappedBy = "productSku")
    private List<InventoryLog> inventoryLogs = new ArrayList<>();

    @OneToMany(targetEntity = StockReceipt.class, mappedBy = "productSku")
    private List<StockReceipt> stockReceipt = new ArrayList<>();

    @OneToMany(targetEntity = CartItem.class, mappedBy = "productSku")
    private List<CartItem> cartItems = new ArrayList<>();

    @OneToMany(targetEntity = OrderItem.class, mappedBy = "productSku")
    private List<OrderItem> orderItem = new ArrayList<>();
}
