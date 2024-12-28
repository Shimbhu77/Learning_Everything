package com.shimbhu.chapter5.bi.not_mapped_by.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "aadhar_bi_without_mapped_by_chapter5")
public class BiAadhar5WithoutMappedBy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aadhar_id")
    private int aadharId;

    @Column(name = "aadhar_number")
    private String aadharNumber;

    // this column won't be created because we are using mapped by on this column
    @OneToOne(cascade = CascadeType.ALL)
    private BiPerson5WithoutMappedBy person;

}
