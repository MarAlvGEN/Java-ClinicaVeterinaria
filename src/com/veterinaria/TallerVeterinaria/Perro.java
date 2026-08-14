package com.veterinaria.TallerVeterinaria;

public class Perro extends Animal implements IntAsegurable, IntVacunas {
    private static final double COSTO_BASE = 45000;
    private String raza;
    private int vacunasAplicadas = 0;

    public Perro(String nombre, int edad, String dueno, String raza) {
        super(nombre, edad, dueno);
        this.raza = raza;
    }

    @Override
    public String imprimirFichaExtended() {
        return "Raza: " + raza + "\n" +
                "Vacunas: " + getVacunasAplicadas() + "\n";
    }

    @Override
    public double costoConsulta() {
        return COSTO_BASE + (3000 * edad);
    }

    @Override
    public void registrarVacuna(String nombreVacuna) {
        System.out.printf("A %s se le ha aplicado la vacuna \"%s\".\n", nombre, nombreVacuna);
        vacunasAplicadas++;
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunasAplicadas;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80000 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "PERRO-" + nombre;
    }

    public static double getCostoBase() {
        return COSTO_BASE;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
