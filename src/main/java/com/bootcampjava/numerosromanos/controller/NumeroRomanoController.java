package com.bootcampjava.numerosromanos.controller;

import com.bootcampjava.numerosromanos.model.NumeroRomanoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/calculator")
public class NumeroRomanoController {

    @Autowired
    private NumeroRomanoModel model;



    @GetMapping("/{numberParams}")
    public ResponseEntity<String> getNumber(@PathVariable int numberParams) {
        String roman ="";

        while (numberParams != 0) {
            ArrayList<Integer> listOfNumbers = model.getListOfNumbers();
            int t = numberParams;
            ArrayList<Integer> array = (ArrayList<Integer>) listOfNumbers.stream()
                    .filter(n -> n <= t).collect(Collectors.toList());
            int index = array.size() -1;
            int num = array.get(index);

            roman += model.getRomanNumerals().get(listOfNumbers.indexOf(num));
            numberParams -= num;

        }


        return ResponseEntity.ok(roman);
    }
}
