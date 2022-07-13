package com.open_bootcamp;

public class Main {
    public static void main (String [] args){
        Persona unaPersona = new Persona();

        unaPersona.setEdad(35);
        unaPersona.setNombre("Teodoro");
        unaPersona.setTelefono(123456789);

        System.out.println("Esta persona se llama "+unaPersona.getNombre()+", tiene "+unaPersona.getEdad()+" años y su teléfono es el "+unaPersona.getTelefono());
    }

}


class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}