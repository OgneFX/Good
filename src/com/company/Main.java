package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader col = new BufferedReader(new InputStreamReader(System.in));
        String first = col.readLine();
        String last = "";
        long start1_000 = System.nanoTime();
        for (int i = 0; i <= 1000; i++)
        {

            last = new StringBuffer(first).reverse().toString();

        }
        long finish1_000 = System.nanoTime();
        long trace1_000 = finish1_000 - start1_000;


        long start10_000 = System.nanoTime();
        for(int i = 0; i<=10000; i++)
        {
            last = new StringBuffer(first).reverse().toString();
        }
        long finish10_000 = System.nanoTime();
        long trace10_000 = finish10_000 - start10_000;

        long start100_000 = System.nanoTime();
        for(int i = 0; i<=100000; i++)
        {
            last = new StringBuffer(first).reverse().toString();
        }
        long finish100_000 = System.nanoTime();
        long trace100_000 = finish100_000 - start100_000;


        System.out.println(first);
        System.out.println(last);
        System.out.println(trace1_000);
        System.out.println(trace10_000);
        System.out.print(trace100_000);
    }
}
