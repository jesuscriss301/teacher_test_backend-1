package com.teacher.test.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="subcategory")
@Data
public class Subcategory {

    @Id
    @SequenceGenerator(name="subcategory_id_seq", allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="subcategory_id_seq")
    private Integer id;

    @OneToOne
    private Criterion criterion;

    private String question;
}
