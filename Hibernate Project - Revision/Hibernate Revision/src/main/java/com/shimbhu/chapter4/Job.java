package com.shimbhu.chapter4;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Job {

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "work_city")
    private String workCity;

    private String salary;
    private String role;
}
