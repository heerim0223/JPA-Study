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
@Table(name = "coupons")
public class Coupon {
    @Id @GeneratedValue
    @Column(name = "coupon_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "discount_type")
    private String discountType;

    @Column(name = "discount_value")
    private Integer discountValue;

    @Column(name = "min_order_price")
    private Integer minOrderPrice;

    @Column(name = "max_discount", nullable = true)
    private Integer maxDiscount;

    @Column(name = "valid_from")
    private LocalDateTime validFrom;

    @Column(name = "valid_until")
    private LocalDateTime validUntil;

    @Column(name = "total_quantity", nullable = true)
    private Integer totalQuantity;

    @Column(name = "issued_count")
    private Integer issuedCount;

    @Column(name = "status")
    private String status;

    @OneToMany(targetEntity = MemberCoupon.class, mappedBy = "coupon")
    private List<MemberCoupon> memberCoupons = new ArrayList<>();
}
