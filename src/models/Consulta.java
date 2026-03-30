package models;

import java.util.ArrayList;

public class Consulta {

    private int numero_consulta;
    private ArrayList<Medicamento> medicamentos_recetados;

    //===============// Constructores //===============//

    public Consulta() {
    }

    public Consulta(int numero_consulta, ArrayList<Medicamento> medicamentos_recetados) {
        this.numero_consulta = numero_consulta;
        this.medicamentos_recetados = medicamentos_recetados;
    }

    //===============// Set y get //===============//


    public int getNumero_consulta() {
        return numero_consulta;
    }

    public void setNumero_consulta(int numero_consulta) {
        this.numero_consulta = numero_consulta;
    }

    public ArrayList<Medicamento> getMedicamentos_recetados() {
        return medicamentos_recetados;
    }

    public void setMedicamentos_recetados(ArrayList<Medicamento> medicamentos_recetados) {
        this.medicamentos_recetados = medicamentos_recetados;
    }
}
