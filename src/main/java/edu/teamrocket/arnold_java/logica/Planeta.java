package edu.teamrocket.arnold_java.logica;

import java.util.EnumSet;

public enum Planeta {

    MERCURY(3.303e23, 2.4397e6),
    VENUS(4.869e24, 6.0518e6),
    EARTH(5.976e24, 6.37814e6),
    MARS(6.421e23, 3.3972e6),
    JUPITER(1.9e27, 7.1492e7),
    SATURN(5.688e26, 6.0268e7),
    URANUS(8.686e25, 2.5559e7),
    NEPTUNE(1.024e26, 2.4746e7);

    public static final double G = 6.67400e-11;

    private final double masaPlaneta;
    private final double radioPlaneta;

    Planeta(double masa,double radio) {
        this.masaPlaneta = masa;
        this.radioPlaneta = radio;
    }

    public double getMasa() {
        return masaPlaneta;
    }

    public double getRadio() {
        return radioPlaneta;
    }

    public double gravedadSuperficial() {
        return G * masaPlaneta / Math.pow(radioPlaneta, 2);
    }

     public double masaHumano(double pesoTierra) {
        return pesoTierra / EARTH.gravedadSuperficial();
    }
       public double pesoSuperficie(double pesoTierra) {
        return masaHumano(pesoTierra) * gravedadSuperficial();
    }

       public static EnumSet<Planeta> getPlanetasTerrestres() {
        return EnumSet.range(MERCURY, MARS);
    }

    public static EnumSet<Planeta> getGigantesGaseosos() {
        return EnumSet.range(JUPITER, SATURN);
    }

    public static EnumSet<Planeta> getGigantesHelados() {
        return EnumSet.range(URANUS, NEPTUNE);
    }
}