/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;
import paquete01.Profesor;

public class EjemploTres {
    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        Profesor profesor1 = new Profesor("Rene"," Contratado");       
        Profesor profesor2 = new Profesor("Gloria"," Contratado");

        Calificacion [] calificaciones = {new Calificacion(10, "Computación", profesor1), 
            new Calificacion(9, "Electrónica",profesor2)};
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f CON PROFESOR: %s", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerProfesor(),
                    objetoCalificacion.obtenerNota());
        }
        
    }
}
