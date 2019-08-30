package com.ebartmedia.ejobss.entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "categories")
public class Categories {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer id;

    @Column(name = "categories_name")
    public String categoriesName;
}
