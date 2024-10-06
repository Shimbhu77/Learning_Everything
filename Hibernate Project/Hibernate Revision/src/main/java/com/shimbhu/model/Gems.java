package com.shimbhu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tourist_gems")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Gems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer placeId;

    private String placeName;
    private String description;
    private String city;
    private String state;
}
