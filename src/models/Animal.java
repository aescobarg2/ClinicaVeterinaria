package models;

public class Animal{

    private String especie;


    //===============// Constructores //===============//


    public Animal() {
    }

    public Animal(String especie) {
        this.especie = especie;
    }

    //===============// Set y get //===============//


    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
