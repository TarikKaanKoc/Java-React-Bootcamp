package com.koc.hrms.Entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "job_titles")
@Entity

@NoArgsConstructor
@AllArgsConstructor

@Data

public class JobTitle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

}
