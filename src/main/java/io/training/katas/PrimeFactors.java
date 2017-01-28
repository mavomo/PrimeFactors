package io.training.katas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michelle on 28/01/2017.
 */
public class PrimeFactors {

    public static List<Integer> generate(int number) {
        List<Integer> primeFactors = new ArrayList<>();
        if (number%2 == 0){
            primeFactors.add(2);
            number/=2;
        }
        if(number > 1){
            primeFactors.add(number);
        }
        return primeFactors;
    }
}
