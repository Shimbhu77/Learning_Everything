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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "publication")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Publication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publication_id")
    private Integer publicationId;

    @Column(name = "publication_name")
    private String publicationName;

    @ManyToMany(mappedBy = "publications", cascade = CascadeType.ALL)
  //  @JoinTable(name = "pub_wri_mapping",joinColumns ={@JoinColumn(name = "pub2_id")},inverseJoinColumns = {@JoinColumn(name = "wri2_id")})
    private List<Writer> writers = new ArrayList<>();

}
