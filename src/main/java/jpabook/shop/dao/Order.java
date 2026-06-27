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
@Table(name = "orders")
public class Order {
    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "coupon_usage_id")
    private CouponUsage couponUsage;

    @Column(name = "status")
    private String status;

    @Column(name = "original_price")
    private Integer originalPrice;

    @Column(name = "discount_amount")
    private Integer discountAmount;

    @Column(name = "point_used")
    private Integer pointUsed;

    @Column(name = "total_price")
    private Integer totalPrice;

    @Column(name = "delivery_address")
    private String deliveryAddress;

    @Column(name = "order_at")
    private LocalDateTime orderedAt;

    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;

    @OneToMany(targetEntity = OrderItem.class, mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<>();

    @OneToMany(targetEntity = Payment.class, mappedBy = "order")
    private List<Payment> orders = new ArrayList<>();

    @OneToMany(targetEntity = CouponUsage.class, mappedBy = "order")
    private List<CouponUsage> couponUsages = new ArrayList<>();
}
