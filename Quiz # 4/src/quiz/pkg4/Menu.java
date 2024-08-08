/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Menu {
    public void mostrarMenu() {
        Rutina rutina = new Rutina();
        rutina.agregar();
        rutina.completar();
        rutina.mostrar();
        
        String mayor = rutina.estudianteConNotaMayor();
        String menor = rutina.estudianteConNotaMenor();
        double promedio = rutina.promedioCalificaciones();
        String encimaPromedio = rutina.calificacionesEncimaDelPromedio();
        String debajoPromedio = rutina.calificacionesDebajoDelPromedio();

        JOptionPane.showMessageDialog(null, "Estudiante con la nota mayor: " + mayor);
        JOptionPane.showMessageDialog(null, "Estudiante con la nota menor: " + menor);
        JOptionPane.showMessageDialog(null, "Promedio de calificaciones: " + promedio);
        JOptionPane.showMessageDialog(null, "Estudiantes con calificaciones por encima del promedio:\n" + encimaPromedio);
        JOptionPane.showMessageDialog(null, "Estudiantes con calificaciones por debajo del promedio:\n" + debajoPromedio);
    }
}


