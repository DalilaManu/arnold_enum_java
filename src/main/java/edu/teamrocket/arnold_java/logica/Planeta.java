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