package jpabook.hospital.dao;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "diagnoses_icd")
public class DiagnoseIcd {
    @Id @GeneratedValue
    @Column(name = "diagnosis_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "hadm_id")
    private Admission admission;

    @Column(name = "seq_num")
    private Integer seqNum;

    @Column(name = "icd_code")
    private String icdCode;

    @Column(name = "icd_version")
    private Integer icdVersion;

    @Column(name = "is_icu")
    private Boolean isIcu;
}
