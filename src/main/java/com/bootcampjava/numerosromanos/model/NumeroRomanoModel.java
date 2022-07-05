package com.bootcampjava.numerosromanos.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

@Repository
public class NumeroRomanoModel {
    private ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
    private ArrayList<String>romanNumerals =  new ArrayList<String>();;

    public NumeroRomanoModel() {
        this.listOfNumbers.add(1);
        this.listOfNumbers.add(4);
        this.listOfNumbers.add(5);
        this.listOfNumbers.add(9);
        this.listOfNumbers.add(10);
        this.listOfNumbers.add(40);
        this.listOfNumbers.add(50);
        this.listOfNumbers.add(90);
        this.listOfNumbers.add(100);
        this.listOfNumbers.add(400);
        this.listOfNumbers.add(500);
        this.listOfNumbers.add(900);
        this.listOfNumbers.add(1000);
        this.romanNumerals.add("I");
        this.romanNumerals.add("IV");
        this.romanNumerals.add("V");
        this.romanNumerals.add("IX");
        this.romanNumerals.add("X");
        this.romanNumerals.add("XL");
        this.romanNumerals.add("L");
        this.romanNumerals.add("XC");
        this.romanNumerals.add("C");
        this.romanNumerals.add("CD");
        this.romanNumerals.add("D");
        this.romanNumerals.add("CM");
        this.romanNumerals.add("M");

}


    public ArrayList<Integer> getListOfNumbers() {
        return listOfNumbers;
    }
    public  ArrayList<String> getRomanNumerals() { return romanNumerals; }
}
