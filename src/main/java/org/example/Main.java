package org.example;

import org.example.ayudas.Licor;
import org.example.modelos.Cliente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        Licor bebida = new Licor();
        Licor bebida2 = new Licor("Jagermeister","Licor","Jager","alto grado alcohol",29D, LocalDate.of(2028,10,31));


        Cliente persona = new Cliente();
        Cliente persona1 = new Cliente("Andres","c.c","32 años", "5653020","masculino");


        //Accediendo a los atributos

        System.out.println(bebida.getNombre());
        System.out.println(bebida2.getNombre());


    }
}