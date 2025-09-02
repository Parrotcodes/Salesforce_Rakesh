package org.example.Array;

public class usingJavaTesting {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            System.out.println();
        }
        long end = System.currentTimeMillis();

        System.out.println(end-start);


    }
}
