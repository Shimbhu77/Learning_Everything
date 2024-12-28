package com.shimbhu.chapter5.bi.mapped_by.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "person_bi_mapped_by_chapter5")
public class BiPerson5MappedBy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private int personId;
    private String name;
    private String city;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "person_aadhar_id",
            referencedColumnName = "aadhar_id"
    )
    private BiAadhar5MappedBy aadhar;
}
