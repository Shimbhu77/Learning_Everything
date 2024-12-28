package com.shimbhu.chapter7.bi.without_mapped_by.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "person_bi_chapter7_without_mapped_by")
public class BiPerson7WithoutMappedBy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private int personId;
    private String name;
    private String city;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "person_company_mapping_chapter7"
    )
    private List<BiCompany7WithoutMappedBy> companies;
}
