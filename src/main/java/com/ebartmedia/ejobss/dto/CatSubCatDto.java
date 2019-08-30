package com.ebartmedia.ejobss.dto;

public class CatSubCatDto {

    private String catName;
    private String subCatName;


//    public CatSubCatDto(String catName, String subCatName) {
//        this.catName = catName;
//        this.subCatName = subCatName;
//    }

    public CatSubCatDto(String catName, String subCatName) {
        this.catName = catName;
        this.subCatName = subCatName;
    }


    public CatSubCatDto() {


    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getSubCatName() {
        return subCatName;
    }

    public void setSubCatName(String subCatName) {
        this.subCatName = subCatName;
    }
}
