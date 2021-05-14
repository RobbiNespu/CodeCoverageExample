package com.github.robbinespu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoolMethodTest {
    @Test
    @DisplayName("Input 1,2 expect 1")
    void methodBar_sum1() {
        int answer = CoolMethod.methodBar(1,2);
        assertEquals(answer,1);
    }
}