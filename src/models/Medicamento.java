package models;

public class Medicamento {

    private String nombre_medicamento;
    private String dosis;


    //===============// Constructores //===============//

    public Medicamento() {
    }

    public Medicamento(String nombre_medicamento, String dosis) {
        this.nombre_medicamento = nombre_medicamento;
        this.dosis = dosis;
    }

    //===============// Set y get //===============//


    public String getNombre_medicamento() {
        return nombre_medicamento;
    }

    public void setNombre_medicamento(String nombre_medicamento) {
        this.nombre_medicamento = nombre_medicamento;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre_medicamento='" + nombre_medicamento + '\'' +
                '}';
    }
}
