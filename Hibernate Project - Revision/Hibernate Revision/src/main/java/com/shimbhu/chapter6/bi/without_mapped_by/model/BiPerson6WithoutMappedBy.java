package com.shimbhu.chapter6.bi.without_mapped_by.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "person_bi_chapter6_without_mapped_by")
public class BiPerson6WithoutMappedBy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private int personId;
    private String name;
    private String city;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "person_car_map_chapter6_without_mapped_by", // Mapping table name
            joinColumns = @JoinColumn(name = "person_id"), // Foreign key to Person
            inverseJoinColumns = @JoinColumn(name = "car_id") // Foreign key to Car
    )
    private List<BiCar6WithoutMappedBy> cars;
}
