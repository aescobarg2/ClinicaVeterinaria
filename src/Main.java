import models.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Propietario p1 = new Propietario("Armando");
        Propietario p2 = new Propietario("Cristian");

        Mascota m1 = new Mascota("Canino", "Jose", 2, 5, p1);
        Mascota m2 = new Mascota("Felino", "Fredo", 3, 6, p2);

        p1.addMascota(m1);
        p2.addMascota(m2);


        Veterinario vet = new Veterinario();
        Consulta con = new Consulta("30/03/2026", m1);
        vet.recetar(con, "Carprofeno", "1 cada 8h");

        // 3. Listas para mostrar
        ArrayList<Propietario> listaP = new ArrayList<>();
        listaP.add(p1);
        listaP.add(p2);

        ArrayList<Consulta> listaC = new ArrayList<>();
        listaC.add(con);


        System.out.println("--- PROPIETARIOS Y MASCOTAS ---");
       

        System.out.println("\n--- CONSULTAS Y RECETAS ---");

    }
}