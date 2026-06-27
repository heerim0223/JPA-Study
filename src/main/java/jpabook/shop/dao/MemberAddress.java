package jpabook.shop.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "member_address")
public class MemberAddress {
    @Id @GeneratedValue
    @Column(name = "address_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "alias", nullable = true)
    private String alias;

    @Column(name = "recipient")
    private String recipient;

    @Column(name = "phone")
    private String phone;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "address")
    private String address;

    @Column(name = "address_detail", nullable = true)
    private String addressDetail;

    @Column(name = "is_default")
    private Boolean isDefault;
}
