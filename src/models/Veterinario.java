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



    public void recetar(Mascota m, Medicamento med){

        System.out.println("El veterinario " + this.nombre + " en la receta asigno el medicamento: "
                + med.getNombre_medicamento() + " con la dosis " + med.getDosis() + " a la mascota " + m.getNombre());
    }
}
