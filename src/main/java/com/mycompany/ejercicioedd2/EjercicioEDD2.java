/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd2;

import java.util.Scanner;

/**
 * We ask user for a series of data per screen and finaly we show them
 *
 * @author David Aparicio Sir
 * @version 1.0
 */
public class EjercicioEDD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Define the program variables 
        //Define the person's name
    String Name;
    //Define the person's first surname
    String FirstSurname;
    //Define the person's second surname
    String SecondSurname;
    //Defines and initializes the reader variable of type Scanner
    Scanner reader=new Scanner(System.in);
    System.out.println("Escribe tu nombre");
        Name=reader.nextLine();
    System.out.println("Escribe tu primer apellido");
        FirstSurname=reader.nextLine();
    System.out.println("Escribe tu segundo apellido");
        SecondSurname=reader.nextLine();
        System.out.println(Name+" "+FirstSurname+" "+SecondSurname);    
    }  
}
