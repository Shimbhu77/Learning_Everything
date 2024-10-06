package com.shimbhu.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name="natural_gems")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class NaturalGems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gems_id")
    private Integer gemsId;

    @Column(name = "natural_gems_name")
    private String naturalGemsName;

    private String description;
    private String city;
    private String state;

    // using this to give our specified column name in the table
    @Column(name = "why_famous")
    private String whyFamous;

    // using for not creating this column to table
    @Transient
    private String country;

    // using this for specifying the date pattern which we want to store
    @Temporal(TemporalType.TIMESTAMP)
    private Date effTs;
}
