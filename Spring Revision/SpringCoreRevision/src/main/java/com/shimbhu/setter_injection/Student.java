package com.shimbhu.setter_injection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Integer studentId;
    private String studentName;
    private String studentCity;
    private String studentDream;
}
