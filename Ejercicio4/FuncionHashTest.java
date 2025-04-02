package Ejercicio4;

import Ejercicio1.CodigoEmpleado;
import Ejercicio1.FuncionHash;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionHashTest {

    /*
    Descripción de la prueba
    Objetivo: Verificar que la función de hash devuelve un índice válido dentro del rango de la tabla.
    Resultado esperado: El índice devuelto debe estar dentro del rango [0, 99].
    */
    @Test
    public void testHashFunctionValidIndex() {
        CodigoEmpleado codigo = new CodigoEmpleado("A", 23);
        FuncionHash hashFunction = new FuncionHash();
        int tblLength = 100;
        int hash = hashFunction.fHash(codigo, tblLength);
        assertTrue(hash >= 0 && hash < tblLength);
    }

    /*
    Descripción de la prueba
    Objetivo: Verificar que la función de hash devuelve índices diferentes para códigos de país diferentes.
    Resultado esperado: Los índices devueltos deben ser diferentes.
    */
    @Test
    public void testHashFunctionDifferentCountryCodes() {
        CodigoEmpleado codigo1 = new CodigoEmpleado("A", 23);
        CodigoEmpleado codigo2 = new CodigoEmpleado("B", 23);
        FuncionHash hashFunction = new FuncionHash();
        int tblLength = 100;
        int hash1 = hashFunction.fHash(codigo1, tblLength);
        int hash2 = hashFunction.fHash(codigo2, tblLength);
        assertNotEquals(hash1, hash2);
    }

    /*
    Descripción de la prueba
    Objetivo: Verificar que la función de hash devuelve el mismo índice para códigos iguales.
    Resultado esperado: Los índices devueltos deben ser iguales.
    */
    @Test
    public void testHashFunctionSameCodes() {
        CodigoEmpleado codigo1 = new CodigoEmpleado("A", 23);
        CodigoEmpleado codigo2 = new CodigoEmpleado("A", 23);
        FuncionHash hashFunction = new FuncionHash();
        int tblLength = 100;
        int hash1 = hashFunction.fHash(codigo1, tblLength);
        int hash2 = hashFunction.fHash(codigo2, tblLength);
        assertEquals(hash1, hash2);
    }

    /*
    Descripción de la prueba
    Objetivo: Verificar que la función de hash maneja correctamente el límite inferior del número de empleado.
    Resultado esperado: El índice devuelto debe estar dentro del rango [0, 99].
    */
    @Test
    public void testHashFunctionLowerBoundary() {
        CodigoEmpleado codigo = new CodigoEmpleado("A", 0);
        FuncionHash hashFunction = new FuncionHash();
        int tblLength = 100;
        int hash = hashFunction.fHash(codigo, tblLength);
        assertTrue(hash >= 0 && hash < tblLength);
    }

    /*
    Descripción de la prueba
    Objetivo: Verificar que la función de hash maneja correctamente el límite superior del número de empleado.
    Resultado esperado: El índice devuelto debe estar dentro del rango [0, 99].
    */
    @Test
    public void testHashFunctionUpperBoundary() {
        CodigoEmpleado codigo = new CodigoEmpleado("A", 999);
        FuncionHash hashFunction = new FuncionHash();
        int tblLength = 100;
        int hash = hashFunction.fHash(codigo, tblLength);
        assertTrue(hash >= 0 && hash < tblLength);
    }
}