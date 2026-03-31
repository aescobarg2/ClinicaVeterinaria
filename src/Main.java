import models.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ---------------- Instancias de propietarios -------------------------
        Propietario p1 = new Propietario("Roberto", new ArrayList<>());
        Propietario p2 = new Propietario("Carlos", new ArrayList<>());
        Propietario p3 = new Propietario("Marrugo", new ArrayList<>());

        ArrayList<Propietario> propietarios = new ArrayList<>();
        propietarios.add(p1);
        propietarios.add(p2);
        propietarios.add(p3);

        // ---------------- Instancias de veterinarios -------------------------
        Veterinario v1 = new Veterinario("Manuel", 20.45);
        Veterinario v2 = new Veterinario("Guerra", 10.46);
        Veterinario v3 = new Veterinario("Jose", 40.35);

        ArrayList<Veterinario> veterinarios = new ArrayList<>();
        veterinarios.add(v1);
        veterinarios.add(v2);
        veterinarios.add(v3);

        // ---------------- Instancias de Mascotas -------------------------
        Mascota m1 = new Mascota("Canino", "Firu", 3, 15.0F);
        Mascota m2 = new Mascota("Felino", "Mishi", 2, 8.0F);
        Mascota m3 = new Mascota("Reptil", "Spaider", 4, 18.0F);
        Mascota m4 = new Mascota("Canino", "Connor", 2, 13.0F);
        Mascota m5 = new Mascota("Felino", "Luna", 1, 14.0F);
        Mascota m6 = new Mascota("Reptil", "Micha", 3, 5.0F);
        Mascota m7 = new Mascota("Canino", "Simba", 4, 20.0F);
        Mascota m8 = new Mascota("Felino", "Milla", 1, 8.0F);
        Mascota m9 = new Mascota("Reptil", "drilococo", 2, 18.0F);

        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(m1);
        mascotas.add(m2);
        mascotas.add(m3);
        mascotas.add(m4);
        mascotas.add(m5);
        mascotas.add(m6);
        mascotas.add(m7);
        mascotas.add(m8);
        mascotas.add(m9);

        // ------------------------- Le asignamos mascotas a cada propietario -------------------------
        int start = 0;
        int end = 3;
        for(int i = 0; i < propietarios.size(); i++) {
            for(int j = start; j < end; j++) {
                propietarios.get(i).agregar_mascota(mascotas.get(j));
            }
            start += 2;
            end += 2;
        }

        // ---------------- Instancias de Medicamentos -------------------------
        Medicamento medicamento1 = new Medicamento("Acetaminofen", "Tres por dia");
        Medicamento medicamento2 = new Medicamento("Ibuprofeno", "Una cada mañana");
        Medicamento medicamento3 = new Medicamento("Naproxeno", "Al medio dia por una semana");

        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        medicamentos.add(medicamento1);
        medicamentos.add(medicamento2);
        medicamentos.add(medicamento3);

        // ---------------- Instancias de consultas -------------------------
        ArrayList<Consulta> consultas = new ArrayList<>();
        for(int i = 0; i < mascotas.size(); i++) {
            Consulta consulta = new Consulta(i+1, mascotas.get(i), new ArrayList<>());
            consultas.add(consulta);
        }



        // --------------------- Recetamos los medicamentos por consulta ---------------------
        for (Consulta consulta : consultas) {
            for (int j = 0; j < veterinarios.size(); j++) {
                veterinarios.get(j).recetar(consulta, medicamentos.get(j));
            }
        }

        // ---------------- Impresion de los datos por consola -------------------------
        for(Propietario propietario : propietarios) {
            System.out.println("\n--------------------------------------------------------");
            System.out.println("Nombre del propietario: " + propietario.getNombre());
            System.out.println("--------------------------------------------------------");
            System.out.println("Mascotas asociadas:");
            for(Mascota mascota : propietario.getMascotas_asociadas()) {
                System.out.println(mascota.toString());
            }
        }
        System.out.println("\n--------------------------------------------------------");
        System.out.println("         Consultas Realizadas");
        System.out.println("--------------------------------------------------------");
        for(Consulta consulta : consultas) {
            System.out.println("\n" + consulta.toString());
            System.out.print("Medicamentos recetados: ");
            for(Medicamento medicamento : consulta.getMedicamentos_recetados()) {
                System.out.print(medicamento.getNombre_medicamento() + " ");
            }
        }






    }
}