package com.ebartmedia.ejobss.repository;

import com.ebartmedia.ejobss.dto.CatSubCatDto;
import com.ebartmedia.ejobss.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer> {
//    @Query(value = "select categories_name,sub_cat_name from categories INNER JOIN subcategories ON categories.id = subcategories.id", nativeQuery = true)
//    List<Categories> findBothTables();


//    @Query(value = "select categories_name,sub_cat_name from categories INNER JOIN subcategories ON categories.id = subcategories.id", nativeQuery = true)
  //  @Query("SELECT new com.ebartmedia.ejobss.dto.CatSubCatDto(sub.subCatName, c.categoriesName)"
            @Query("SELECT new com.ebartmedia.ejobss.dto.CatSubCatDto(sub.subCatName, c.categoriesName)"
               + "FROM SubCategories sub INNER JOIN sub.categories c")
    List<CatSubCatDto> findBothTables();
//    List<Categories> findBothTables();
}
