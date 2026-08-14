package com.veterinaria.TallerVeterinaria;

public class Clinica implements IntAsegurable {
    private String nombre;
    private String direccion;

    public Clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 5000000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-" + nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
