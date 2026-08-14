package com.veterinaria.TallerVeterinaria;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String dueno;

    public Animal(String nombre, int edad, String dueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.dueno = dueno;
    }

    public abstract double costoConsulta();

    public void imprimirFicha() {
        System.out.println(
                "FICHA TECNICA: " + nombre + "\n" +
                        "Edad: " + edad + "\n" +
                        "Dueño: " + dueno + "\n" +
                        imprimirFichaExtended() + "\n" +
                        "COSTO CONSULTA: " + costoConsulta() + "\n" +
                        "-------------");
    };

    public abstract String imprimirFichaExtended();
}
