package edu.teamrocket.arnold_java.logica;

public class ArnoldMain {

    public static void main(String[] args) {

        double pesoUsuario = 60.0; // kg

        System.out.println("Peso en todos los planetas:");
        for (Planeta p : Planeta.values()) {
            System.out.printf("En %s pesas %.3f N%n",
                    p.name(), p.pesoSuperficie(pesoUsuario));
        }

        System.out.println("\nPlanetas terrestres:");
        for (Planeta p : Planeta.getPlanetasTerrestres()) {
            System.out.printf("En %s pesas %.3f N%n",
                    p.name(), p.pesoSuperficie(pesoUsuario));
        }

        System.out.println("\nGigantes gaseosos:");
        for (Planeta p : Planeta.getGigantesGaseosos()) {
            System.out.printf("En %s pesas %.3f N%n",
                    p.name(), p.pesoSuperficie(pesoUsuario));
        }

        System.out.println("\nGigantes helados:");
        for (Planeta p : Planeta.getGigantesHelados()) {
            System.out.printf("En %s pesas %.3f N%n",
                    p.name(), p.pesoSuperficie(pesoUsuario));
        }
    }
}
