package com.bridgelabz.generics;

public class Maximum<T> {

    T a;
    T b;
    T c;

    public Maximum() {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Method for finding maximum value (int,float,string) -->

    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {

        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Maximum mx = new Maximum();
        System.out.println("Welcome to Generic Practice Problem");
        System.out.println("The Maximum integer is: " + mx.findMax(12, 24, 36));
        System.out.println("The Maximum float is: " + mx.findMax(34.65, 25.76, 87.54));
        System.out.println("The Maximum string is: " + mx.findMax("Apple", "Banana", "Peach"));
    }

}