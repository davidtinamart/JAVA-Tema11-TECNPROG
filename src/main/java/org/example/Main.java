package org.example;

public class Main {
    public static void main(String[] args) {
        String iniciales = ClaseCadena.DevuelveIniciales("David Tinaut");
        System.out.println(iniciales);

        String iniciales2 = ClaseCadena.DevuelveIniciales("davidtinaut");
        System.out.println(iniciales2);

        String iniciales3 = ClaseCadena.DevuelveIniciales("David Tinaut Martinez");
        System.out.println(iniciales3);

        String iniciales4 = ClaseCadena.DevuelveIniciales("");
        System.out.println(iniciales4);

    }
}