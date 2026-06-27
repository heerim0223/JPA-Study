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
@Table(name = "qna_answers")
public class QnaAnswer {
    @Id @GeneratedValue
    @Column(name = "answer_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "qna_id")
    private Qna qna;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    @Column(name = "content", nullable = true)
    private String content;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;
}
