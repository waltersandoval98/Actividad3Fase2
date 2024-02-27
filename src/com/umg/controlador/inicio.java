/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.controlador;

import com.umg.entidad.EPersona;
import java.util.Scanner;

/**
 *
 * @author DGUTIERREZ
 */
public class inicio {

    public static void main(String[] args) {

        int opc = 0;
        EPersona persona = new EPersona();
        Scanner obtener = new Scanner(System.in);

        while (opc != 5) {
            try {
                System.out.println("INICIO");
                System.out.println("1. Crear");
                System.out.println("2. Leer");
                System.out.println("3. Actualizar");
                System.out.println("4. Borrar");
                System.out.println("5. Salir\n");
                System.out.println("Por favor seleccione una opción");
                opc = obtener.nextInt();

                if (opc == 1) {
                    persona.crear();
                } else if (opc == 2 ) {
                    persona.leer();
                } else if (opc == 3) { 
                    persona.actualizar();
                } else if (opc == 4) {
                    persona.borrar();
                } else if (opc == 5) {
                    System.out.println("Saliendo del programa");
                } else if (opc <= 0 || opc >= 6) {
                    System.out.println("Opcion incorrecta, por favor vuelva a intentarlo.");
                }
            } catch (Exception ex) {
                System.out.println("Opcion incorrecta, solamente se acepta numeros");
                //ex.printStackTrace();
                opc = 0;
                obtener.nextLine();
            }

        }

    }
}
