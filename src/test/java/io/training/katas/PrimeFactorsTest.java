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
    public void should_return_a_list_containing_2_2_as_prime_factor_of_4() {
        assertThat(PrimeFactors.generate(4)).containsExactly(2,2);
    }

    @Test
    public void should_return_a_list_containing_2_3_as_prime_factor_of_6() {
        assertThat(PrimeFactors.generate(6)).containsExactly(2,3);
    }

    @Test
    public void should_return_a_list_containing_2_2_2_as_prime_factor_of_8() {
        assertThat(PrimeFactors.generate(8)).containsExactly(2,2,2);
    }

    @Test
    public void should_return_a_list_containing_3_3_as_prime_factor_of_9() {
        assertThat(PrimeFactors.generate(9)).containsExactly(3,3);
    }

    @Test
    public void should_return_a_list_containing_3_5_as_prime_factor_of_15() {
        assertThat(PrimeFactors.generate(15)).containsExactly(3,5);
    }

    @Test
    public void should_return_a_list_containing_3_3_3_as_prime_factor_of_27() {
        assertThat(PrimeFactors.generate(27)).containsExactly(3,3,3);
    }

    @Test
    public void should_return_a_list_containing_5_5_as_prime_factor_of_25() {
        assertThat(PrimeFactors.generate(25)).containsExactly(5,5);
    }


}
