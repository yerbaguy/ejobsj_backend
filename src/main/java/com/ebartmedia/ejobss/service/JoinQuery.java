package com.ebartmedia.ejobss.service;


import com.ebartmedia.ejobss.dto.CatSubCatDto;
import com.ebartmedia.ejobss.repository.CategoriesRepository;
import org.jvnet.hk2.annotations.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JoinQuery {


    @Resource
    private CategoriesRepository categoriesRepository;


    public List<CatSubCatDto> getBothh() {

        List<CatSubCatDto> categoriesList = categoriesRepository.findBothTables();

        categoriesList.forEach(l -> System.out.println(l));
        return categoriesList;
    }
}
