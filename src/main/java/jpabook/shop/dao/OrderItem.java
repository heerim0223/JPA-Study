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
@Table(name = "order_items")
public class OrderItem {
    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "sku_id")
    private SkuOptionValue skuOptionValue;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "unit_price")
    private Integer unitPrice;

    @Column(name = "status")
    private String status;

    @OneToMany(targetEntity = CouponUsage.class, mappedBy = "orderItem")
    private List<CouponUsage> couponUsages = new ArrayList<>();

    @OneToMany(targetEntity = Shipment.class, mappedBy = "orderItem")
    private List<Shipment> shipments = new ArrayList<>();

    @OneToMany(targetEntity = Review.class, mappedBy = "orderItem")
    private List<Review> reviews = new ArrayList<>();
}
