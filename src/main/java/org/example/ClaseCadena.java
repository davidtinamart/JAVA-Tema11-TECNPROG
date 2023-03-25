package org.example;

public class ClaseCadena {

    public static String DevuelveIniciales(String nombreCompleto) {     //devuelve un String
        String iniciales = "";                                          //inicializamos la variable iniciales
        if (nombreCompleto == null || nombreCompleto.isEmpty()) {         //si el nombre es nulo o vacío
            return iniciales;                                           //devuelve una cadena vacía
        }

    String[] nombres = nombreCompleto.trim().split("\s+");          //separa el nombre por espacios

        for(int i = 0; i < nombres.length; i++){                            //recorre el array
            String nombre = null;                                           //inicializamos la variable nombre
            if(!nombre.isEmpty()){                                          //si el nombre no está vacío
            iniciales = iniciales + nombre.charAt(0) + ".";                 //añade la primera letra del nombre y un punto
        }
    }
        return iniciales.toUpperCase();                                     //devuelve las iniciales en Uppercase (mayus)
}


    }