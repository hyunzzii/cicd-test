package com.example.cicdtest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DefaultTest {
    @DisplayName("test")
    @Test
    void test(){
        Assertions.assertThat(1+1).isEqualTo(2);
    }
}
