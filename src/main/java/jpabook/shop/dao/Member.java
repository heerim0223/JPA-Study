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
@Table(name = "members")
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "phone", nullable = true)
    private String phone;

    @Column(name = "role")
    private String role;

    @Column(name = "status")
    private String status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // duplex
    @OneToMany(targetEntity = MemberAddress.class, mappedBy = "member")
    private List<MemberAddress> memberAddresses = new ArrayList<>();

    @OneToMany(targetEntity = MemberCoupon.class, mappedBy = "member")
    private List<MemberCoupon> memberCoupons = new ArrayList<>();

    @OneToMany(targetEntity = Seller.class, mappedBy = "member")
    private List<Seller> sellers = new ArrayList<>();

    @OneToMany(targetEntity = Cart.class, mappedBy = "member")
    private List<Cart> carts = new ArrayList<>();

    @OneToMany(targetEntity = Order.class, mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

    @OneToMany(targetEntity = PointAccount.class, mappedBy = "member")
    private List<PointAccount> pointAccounts = new ArrayList<>();

    @OneToMany(targetEntity = PointLog.class, mappedBy = "member")
    private List<PointLog> pointLogs = new ArrayList<>();

    @OneToMany(targetEntity = Review.class, mappedBy = "member")
    private List<Review> reviews = new ArrayList<>();

    @OneToMany(targetEntity = Qna.class, mappedBy = "member")
    private List<Qna> qnas = new ArrayList<>();
}