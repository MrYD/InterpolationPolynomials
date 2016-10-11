package com.company;

public class Main {

    public static void main(String[] args) {
        double xzero = 0;
        double yzero = -5;
        double h = 1;
        NewtonForword nf = new NewtonForword(xzero, yzero, h);

        nf.add(1);

        nf.add(9);

        nf.add(25);

        nf.printForwardDifference();
        System.out.println();
        System.out.println(nf.P);
    }
}
