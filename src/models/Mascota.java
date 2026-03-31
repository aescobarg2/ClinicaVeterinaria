package models;

public class Mascota extends Animal {

    private String nombre;
    private int edad;
    private float peso;

    //===============// Constructores //===============//

    public Mascota() {
    }

    public Mascota(String especie, String nombre, int edad, float peso) {
        super(especie);
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
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

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre: '" + nombre + '\'' +
                ", edad: " + edad +
                ", peso: " + peso +
                '}';
    }
}
