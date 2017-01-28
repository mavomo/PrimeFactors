package io.training.katas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michelle on 28/01/2017.
 */
public class PrimeFactors {

    public static List<Integer> generate(int i) {
        List<Integer> primeFactors = new ArrayList<>();
        if(i > 1){
            primeFactors.add(i);
        }
        /*
        if (i == 2){
            primeFactors.add(2);
        }
        if (i == 3) {
            primeFactors.add(3);
        }*/
        return primeFactors;
    }
}
