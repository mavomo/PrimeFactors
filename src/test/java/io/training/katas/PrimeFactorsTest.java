package io.training.katas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class PrimeFactorsTest {

    @Test
    public void shoud_return_empty_list_as_factor_of_1() {
        List<Integer> primeFactors = PrimeFactors.generate(1);
        Assertions.assertThat(primeFactors).isEmpty();
    }
}
