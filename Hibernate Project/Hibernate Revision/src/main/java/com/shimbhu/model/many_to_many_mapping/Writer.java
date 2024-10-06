package com.shimbhu.model.many_to_many_mapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "writer")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Writer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "writer_id")
    private Integer writerId;

    @Column(name = "writer_name")
    private String writerName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "wri_pub_mapping",joinColumns ={@JoinColumn(name = "wri1_id")},inverseJoinColumns = {@JoinColumn(name = "pub1id")})
    List<Publication> publications = new ArrayList<>();

}
