package models;

public class Mascota extends Animal {

    private String nombre;
    private int edad;
    private float peso;
    private Propietario propietario;


    //===============// Constructores //===============//

    public Mascota() {
    }

    public Mascota(String especie, String nombre, int edad, float peso, Propietario propietario) {
        super(especie);
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.propietario = propietario;
    }

    //===============// Set y get //===============//


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
