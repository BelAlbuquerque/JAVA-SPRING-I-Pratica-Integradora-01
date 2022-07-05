package com.bootcampjava.numerosromanos.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

@Repository
public class NumeroRomanoModel {
    private int[] listOfNumbers;
    private String[]romanNumerals;

    public NumeroRomanoModel() {
        this.listOfNumbers = new int[]{ 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
        this.romanNumerals = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    }


    public int[] getListOfNumbers() {
        return listOfNumbers;
    }
    public  String[] getRomanNumerals() { return romanNumerals; }
}
