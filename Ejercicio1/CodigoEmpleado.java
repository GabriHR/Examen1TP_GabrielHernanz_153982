package Ejercicio1;

public class CodigoEmpleado {
    private String codPais;
    private int codEmpleado;

    public CodigoEmpleado(String codPais, int codEmpleado) {
        this.codPais = codPais;
        this.codEmpleado = codEmpleado;
    }

    public String getCodPais() {
        return codPais;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }
}