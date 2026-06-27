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
@Table(name = "coupon_usages")
public class CouponUsage {
    @Id @GeneratedValue
    @Column(name = "coupon_usage_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_coupon_id")
    private MemberCoupon memberCoupon;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "discount_amount")
    private Integer discountAmount;

    @Column(name = "used_at")
    private LocalDateTime usedAt;
}
