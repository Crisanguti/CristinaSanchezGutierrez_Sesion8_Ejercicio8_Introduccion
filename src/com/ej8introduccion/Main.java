package com.ej8introduccion;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setNombre("Daniel");
        persona.setEdad(33);
        persona.setTelefono(654987321);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());

    }
}
