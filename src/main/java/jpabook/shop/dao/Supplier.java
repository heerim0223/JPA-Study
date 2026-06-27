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
@Table(name = "suppliers")
public class Supplier {
    @Id @GeneratedValue
    @Column(name = "supplier_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "contact_name", nullable = true)
    private String contactName;

    @Column(name = "contact_phone", nullable = true)
    private String contactPhone;

    @Column(name = "contact_email", nullable = true)
    private String contactEmail;

    @Column(name = "address", nullable = true)
    @Lob
    private String address;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @OneToMany(targetEntity = StockReceipt.class, mappedBy = "supplier")
    private List<StockReceipt> stockReceipts = new ArrayList<>();
}
