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
@Table(name = "sellers")
public class Seller {
    @Id @GeneratedValue
    @Column(name = "seller_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "shop_name")
    private String shopName;

    @Column(name = "business_no")
    private String businessNo;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "account_no", nullable = true)
    private String accountNo;

    @Column(name = "status")
    private String status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @OneToMany(targetEntity = Product.class, mappedBy = "seller")
    private List<Product> products = new ArrayList<>();

    @OneToMany(targetEntity = OrderItem.class, mappedBy = "seller")
    private List<OrderItem> orderItems = new ArrayList<>();

    @OneToMany(targetEntity = Qna.class, mappedBy = "seller")
    private List<Qna> qnas = new ArrayList<>();

    @OneToMany(targetEntity = QnaAnswer.class, mappedBy = "seller")
    private List<QnaAnswer> qnaAnswers = new ArrayList<>();
}
