package com.it1311l.uap.simplespringbootapp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sortnumbers {

    @GetMapping("/sort")
    public List<Integer> sortInteger() {
        int[] arr = {3, 10, 8, 9, 2, 2, 8, 10, 2, 3};
        
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        
        List<Integer> sortedList = new ArrayList<>();
        for (int value : arr) {
            sortedList.add(value);
        }

        return sortedList;
    }
}

