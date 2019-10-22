package com.company;

public class Gcd {

        public static int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }
    }

