package com.shimbhu;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tourist_gems")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer placeId;

    private String placeName;
    private String description;
    private String city;
    private String state;
}
