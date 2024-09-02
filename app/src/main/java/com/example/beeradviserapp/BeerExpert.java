package com.example.beeradviserapp;


import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();


        switch (color.toLowerCase()) {
            case "light":
                brands.add("Jail Pale Ale");
                brands.add("Lager Lite");
                break;
            case "amber":
                brands.add("Jack Amber");
                brands.add("Red Moose");
                break;
            case "brown":
                brands.add("Brown Bear Beer");
                brands.add("Bock Brownie");
                break;
            case "dark":
                brands.add("Dark Daniel");
                brands.add("Gout Stout");
                break;
            default:
                brands.add("No recommendations available for this color");
                break;
        }

        return brands;
    }
}

