package com.shimbhu.chapter2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "student_details") // using this we can change the table in the database while creation
// using lombok for reducing boilerplate code for getter, setter, constructor etc.
@NoArgsConstructor
@AllArgsConstructor
@Data
//@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {

    @Id
    private int id;
    private String name;
    private String city;
    private String career;
}
