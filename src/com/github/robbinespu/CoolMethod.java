package com.github.robbinespu;

public class CoolMethod {
    private static int result;
    public static int methodBar(int p1, int p2) {
        if (p1 > 0 && p2 > 0) {
            result = p1;
        }
        return result;
    }
}
