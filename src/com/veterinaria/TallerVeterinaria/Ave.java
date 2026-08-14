package com.veterinaria.TallerVeterinaria;

public class Ave extends Animal {
    private static final double COSTO_BASE = 38000;
    private int pesoGramos;

    public Ave(String nombre, int edad, String dueno, int pesoGramos) {
        super(nombre, edad, dueno);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public String imprimirFichaExtended() {
        return "Peso: " + pesoGramos + "(g)\n";
    }

    @Override
    public double costoConsulta() {
        return COSTO_BASE + (100 * pesoGramos);
    }

}
