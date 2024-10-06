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
@Table(name = "husband")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Husband {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "husband_id")
    private Integer husbandId;

    @Column(name = "full_name")
    private String fullName;
    private Integer age;
    private String occupation;
    private String city;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "my_wife_id")
    private Wife wife;
}
