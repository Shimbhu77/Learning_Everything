package com.shimbhu.chapter5.uni.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "aadhar_uni_chapter5")
public class UniAadhar5 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aadhar_id")
    private int aadharId;

    @Column(name = "aadhar_number")
    private String aadharNumber;

}
