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
@Table(name = "point_accounts")
public class PointAccount {
    @Id @GeneratedValue
    @Column(name = "point_account_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "balance")
    private Integer balance;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
