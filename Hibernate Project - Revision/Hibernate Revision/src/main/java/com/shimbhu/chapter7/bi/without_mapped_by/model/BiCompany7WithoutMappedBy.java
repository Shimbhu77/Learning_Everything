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
@Table(name = "company_bi_chapter7_without_mapped_by")
public class BiCompany7WithoutMappedBy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private int companyId;

    @Column(name = "company_name")
    private String companyName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "company_person_mapping_chapter7"
    )
    private List<BiPerson7WithoutMappedBy> persons;

}
