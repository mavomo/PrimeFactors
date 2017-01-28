package io.training.katas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michelle on 28/01/2017.
 */
public class PrimeFactors {

    public static List<Integer> generate(int number) {
        List<Integer> primeFactors = new ArrayList<>();
        //int diviser = 2;
        for (int diviser =2; number > 1; diviser++) {
            while (number % diviser == 0) {
                primeFactors.add(diviser);
                number /= diviser;
            }
        }
        /*diviser ++;
        while (number %diviser == 0){
            primeFactors.add(diviser);
            number/=diviser;
        }
        if(number > 1){
            primeFactors.add(number);
        }*/
        return primeFactors;
    }
}
