package org.example;
import static org.junit.jupiter.api.Assertions.*;

class ClaseCadenaTest {


    @org.junit.jupiter.api.Test

    void DevuelveIniciales() {

        String iniciales = ClaseCadena.DevuelveIniciales("David Tinaut");
        assertEquals("D.T.", iniciales);

        String iniciales2 = ClaseCadena.DevuelveIniciales(null);
        assertEquals("", iniciales2);
    }

}