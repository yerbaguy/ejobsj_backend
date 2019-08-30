package com.ebartmedia.ejobss.entity;


import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "subcategories")
public class SubCategories {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer id;

    @Column(name = "sub_cat_name")
    public String subCatName;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cat_id", nullable = false)
    public Categories categories;



}
