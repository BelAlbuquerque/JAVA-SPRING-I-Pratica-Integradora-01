package com.bootcampjava.numerosromanos.model;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

@Repository
public class NumeroRomanoModel {

    private Hashtable<String, String> romanNumeric = new Hashtable<>();

    public NumeroRomanoModel() {
        this.romanNumeric.put("1", "I");
        this.romanNumeric.put("4", "IV");
        this.romanNumeric.put("5", "V");
        this.romanNumeric.put("9", "IX");
        this.romanNumeric.put("10", "X");
        this.romanNumeric.put("40", "XL");
        this.romanNumeric.put("50", "L");
        this.romanNumeric.put("90", "XC");
        this.romanNumeric.put("100", "C");
        this.romanNumeric.put("400", "CD");
        this.romanNumeric.put("500", "D");
        this.romanNumeric.put("900", "CM");
        this.romanNumeric.put("1000", "M");
    }


    public Map<String, String> getRomanNumeric() {
        return romanNumeric;
    }
    // private final String db = "src/main/resources/dataBase.json";

}
