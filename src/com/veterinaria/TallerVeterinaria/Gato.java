package com.veterinaria.TallerVeterinaria;

public class Gato extends Animal implements IntAsegurable, IntVacunas {
    private static final double COSTO_BASE = 38000;

    private boolean esEsterilizado;
    private int vacunasAplicadas = 0;

    public Gato(String nombre, int edad, String dueno, boolean esEsterilizado) {
        super(nombre, edad, dueno);
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public String imprimirFichaExtended() {
        return "Está esterilizado?: " + esEsterilizado + "\n" +
                "Vacunas: " + getVacunasAplicadas() + "\n";
    }

    @Override
    public double costoConsulta() {
        return COSTO_BASE;
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
        if (esEsterilizado) {
            return 120000;
        } else {
            return 200000;
        }
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "GATO-" + nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
