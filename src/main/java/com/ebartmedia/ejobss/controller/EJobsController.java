package com.ebartmedia.ejobss.controller;


import com.ebartmedia.ejobss.dto.CatSubCatDto;
import com.ebartmedia.ejobss.entity.Categories;
import com.ebartmedia.ejobss.entity.SubCategories;
import com.ebartmedia.ejobss.repository.CategoriesRepository;
import com.ebartmedia.ejobss.repository.SubCategoriesRepository;
import com.ebartmedia.ejobss.service.JoinQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EJobsController {


    @Autowired
    private CategoriesRepository categoriesRepository;

    @Autowired
    private SubCategoriesRepository subCategoriesRepository;

    @Autowired
    private JoinQuery joinQuery;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public ArrayList<Categories> getSubCategories() {


        List<Categories> categoriesList = new ArrayList<>();

        categoriesList = categoriesRepository.findAll();




        return (ArrayList<Categories>) categoriesList;

    }


    @RequestMapping(value = "/getinfo", method = RequestMethod.GET)
    public List<CatSubCatDto> getSubbCategories() {

        Categories categories = new Categories();
        SubCategories subCategories = new SubCategories();

        CatSubCatDto catSubCatDto = new CatSubCatDto();

        List<CatSubCatDto> catSubCatDtos = new ArrayList<>();


         catSubCatDtos = joinQuery.getBothh();


        String getinfo1 = joinQuery.getBothh().get(1).getCatName().toString();
        String getinfo2 = joinQuery.getBothh().get(1).getSubCatName().toString();

           System.out.println("getinfo1" + getinfo2);
           System.out.println("getinfo2" + getinfo1);

           catSubCatDto.setCatName(getinfo2);
           catSubCatDto.setSubCatName(getinfo1);

           catSubCatDtos.add(catSubCatDto);


          return catSubCatDtos;
    }





//    @GetMapping("/getinfo")
//    public ResponseEntity<List<CatSubCatDto>> getInformation() {
//
//
//
//        return new ResponseEntity<CatSubCatDto>(joinQuery.getBothh(), HttpStatus.ACCEPTED);
//    }
}
