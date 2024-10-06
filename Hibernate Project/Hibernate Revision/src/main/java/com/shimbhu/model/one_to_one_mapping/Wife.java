package com.shimbhu.model.one_to_one_mapping;

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
import lombok.ToString;

@Entity
@Table(name = "wife")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Wife {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wife_id")
    private Integer wifeId;

    @Column(name = "full_name")
    private String fullName;
    private Integer age;
    private String occupation;
    private String city;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "my_husband_id")
    private Husband husband;
}
