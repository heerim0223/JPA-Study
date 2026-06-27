package jpabook.shop.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "review_images")
public class ReviewImage {
    @Id @GeneratedValue
    @Column(name = "review_image_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "review_id")
    private Review review;

    @Column(name = "url")
    private String url;

    @Column(name = "sort_order")
    private Integer sortOrder;
}
