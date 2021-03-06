package io.training.katas;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int number) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int diviser =2; number > 1; diviser++) {
            for(; number % diviser == 0; number /= diviser){
                primeFactors.add(diviser);
            }
        }
        return primeFactors;
    }
}
