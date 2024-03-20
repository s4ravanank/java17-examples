package com.dreamworks.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SieveOfErothness8 {

    public static void main(String[] args) {
        int size = 30;
        Boolean allElements[] = new Boolean[size+1];
        Arrays.fill(allElements, true);



        for(int i=2; i*i <size; i++ ){
           if(allElements[i]) {
               // Update all multiples of i
//               for(int j = i*i; j <= size; j += i)
//                   allElements[j] = false;
           }
        }

//        IntStream.range(2, allElements.length)
//                .mapToObj(index ->String.format("%d ", index))
//                        .forEach(System.out::println);

//        IntStream.range(2, allElements.length)
//                .filter(index-> allElements[index].equals(true))
//                .mapToObj(index ->String.format("%d ", index))
//                .forEach(System.out::print);


    }
}
