package Ejercicio1;

public class FuncionHash {
    public int fHash(CodigoEmpleado codigo, int tblLength) {
        // Convertir el código del país a un valor numérico
        int codPaisValue = codigo.getCodPais().charAt(0) - 'A';

        // Obtener el código del empleado
        int codEmpleado = codigo.getCodEmpleado();

        // Combinar los valores y calcular el índice en la tabla hash
        int hash = (codPaisValue * 1000 + codEmpleado) % tblLength;

        return hash;
    }
}