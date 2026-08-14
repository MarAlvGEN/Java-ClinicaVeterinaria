package com.veterinaria.TallerVeterinaria;

public class Main {
    public static void main(String[] args) {

        Perro perro1 = new Perro("Firulais", 4, "Carlos", "Labrador");
        Perro perro2 = new Perro("Rocko", 3, "Alexandra", "Boxer");
        Gato gato1 = new Gato("Michi", 3, "Miguel", true);
        Gato gato2 = new Gato("Snow", 8, "Jorge", false);
        Ave ave1 = new Ave("Condorito", 2, "Margarita", 8);
        Ave ave2 = new Ave("Ary", 5, "Roberto", 20);
        Conejo conejo1 = new Conejo("Copito", 3, "Carlos", "Blanco");

        Clinica clinica1 = new Clinica("VetCare", "Calle 1 Cr 2 Edif 3");

        Animal[] animales = new Animal[] {
                perro1,
                perro2,
                gato1,
                gato2,
                ave1,
                ave2,
                conejo1,
        };

        IntAsegurable[] asegurables = new IntAsegurable[] {
                perro1,
                perro2,
                gato1,
                gato2,
                clinica1
        };

        System.out.println("### JORDANA DE VACUNACION ###");
        perro1.registrarVacuna("Viruela");
        perro1.registrarVacuna("Sarampion");
        gato2.registrarVacuna("Tetano");
        System.out.println("----------\n");

        System.out.println("### IMPRIMIR FICHAS ###");
        for (Animal a : animales) {
            a.imprimirFicha();
        }

        System.out.println("\n### VERIFICAR SEGURO ###");
        for (IntAsegurable a : asegurables) {
            System.out.printf("Seguro para: %s\n", a.getNombre());
            System.out.printf("Número de poliza: %s\n", a.obtenerNumeroPoliza());
            System.out.printf("Prima del Seguro: %.0f\n\n", a.calcularPrimaSeguro());
        }

    }

}
