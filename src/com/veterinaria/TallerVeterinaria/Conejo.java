package com.veterinaria.TallerVeterinaria;

public class Conejo extends Animal {
    protected String color;
    private static final double COSTO_BASE = 6000;

    public Conejo(String nombre, int edad, String dueno, String color) {
        super(nombre, edad, dueno);
        this.color = color;
    }

    @Override
    public void imprimirFicha() {
        super.imprimirFicha();
    }

    @Override
    public String imprimirFichaExtended() {
        return "Color: " + color + "\n";
    }

    @Override
    public double costoConsulta() {
        return COSTO_BASE;
    }

}
