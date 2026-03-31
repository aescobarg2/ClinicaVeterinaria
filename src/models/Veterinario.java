package models;

import java.util.ArrayList;

public class Veterinario {

    private String nombre;
    private double id_medico;

    //===============// Constructores //===============//

    public Veterinario() {
    }

    public Veterinario(String nombre, double id_medico) {
        this.nombre = nombre;
        this.id_medico = id_medico;
    }

    //===============// Set y get //===============//


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getId_medico() {
        return id_medico;
    }

    public void setId_medico(double id_medico) {
        this.id_medico = id_medico;
    }


    //===============// Funcion agregada de Veterinario  //===============//



    public void recetar(Consulta consulta, Medicamento med){
        consulta.agregarMedicamento(med);
    }
}
