package models;

import java.util.ArrayList;

public class Propietario {

    private String nombre;
    private ArrayList<Mascota> mascotas_asociadas;

    //===============// Constructores //===============//


    public Propietario() {
        ArrayList<Mascota> mascotas_asociadas = new ArrayList<>();
    }

    public Propietario(String nombre) {
        this.nombre = nombre;
        this.mascotas_asociadas = new ArrayList<>();
    }

    //===============// Set y get //===============//


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Mascota> getMascotas_asociadas() {
        return mascotas_asociadas;
    }

    public void setMascotas_asociadas(ArrayList<Mascota> mascotas_asociadas) {
        this.mascotas_asociadas = mascotas_asociadas;
    }


    //Metodo para agregar mascotas una a una
    public void agregar_mascota(Mascota m){

        this.mascotas_asociadas.add(m);
    }


}
