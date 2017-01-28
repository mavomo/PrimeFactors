package io.training.katas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorsTest {

    @Test
    public void shoud_return_empty_list_as_factor_of_1() {
        assertThat(PrimeFactors.generate(1)).isEmpty();
    }

    @Test
    public void should_return_a_list_containing_2_as_prime_factor_of_2() {
        assertThat(PrimeFactors.generate(2)).containsExactly(2);
    }

    @Test
    public void should_return_a_list_containing_3_as_prime_factor_of_3() {
        assertThat(PrimeFactors.generate(3)).containsExactly(3);
    }

    @Test
    public void should_return_a_list_containing_4_as_prime_factor_of_4() {
        assertThat(PrimeFactors.generate(4)).containsExactly(2,2);
    }
}
