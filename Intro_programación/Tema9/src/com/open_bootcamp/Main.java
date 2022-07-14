package com.open_bootcamp;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 28;
        cliente.nombre = "Eduardo";
        cliente.telefono = 123456789;
        cliente.credito = 250.50;
        System.out.println("El cliente "+cliente.nombre+" tiene "+cliente.edad+" años y su teléfono es el "+cliente.telefono+" y tiene un crédito de "+cliente.credito+"€");

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 40;
        trabajador.nombre = "Manolo";
        trabajador.telefono = 987654321;
        trabajador.salario = 1500.00;
        System.out.println("El trabajador "+trabajador.nombre+" tiene "+trabajador.edad+" años y su teléfono es el "+trabajador.telefono+"y tiene un salario de "+trabajador.salario+"€");
    }
}

class Persona{
    public String nombre;
    public int edad;
    public int telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}