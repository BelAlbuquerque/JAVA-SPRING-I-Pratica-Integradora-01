package com.bootcampjava.numerosromanos.controller;

import com.bootcampjava.numerosromanos.model.NumeroRomanoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

@RestController
@RequestMapping("/calculator")
public class NumeroRomanoController {

    @Autowired
    private NumeroRomanoModel repo;



    @GetMapping("/{number}")
    public ResponseEntity<String> getNumber(@PathVariable String number) {
        Hashtable<String, String> dictRomansNumeralData = ((Hashtable<String, String>)repo.getRomanNumeric());

       String roman = dictRomansNumeralData.get(number);

        return ResponseEntity.ok(roman);
    }
}
