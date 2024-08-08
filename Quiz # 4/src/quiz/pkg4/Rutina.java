/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.pkg4;

/**
 *
 * @author josem
 */
import javax.swing.JOptionPane;

public class Rutina {
    private final Estudiante[] estudiantes = new Estudiante[10];

    public void agregar() {
        for (int i = 0; i < 8; i++) {
            Estudiante e = new Estudiante();
            e.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre del estudiante:"));
            e.setCurso(JOptionPane.showInputDialog(null, "Digite el curso del estudiante:"));
            e.setProfesor(JOptionPane.showInputDialog(null, "Digite el nombre del profesor:"));
            e.setCalificacion(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la calificación del estudiante:")));
            estudiantes[i] = e;
        }
    }

    public void completar() {
        estudiantes[8] = new Estudiante("Juan Pérez", "Matemáticas", "Profe 1", 95.5);
        estudiantes[9] = new Estudiante("Ana Gómez", "Ciencias", "Profe 2", 87.0);
    }

    public void mostrar() {
        StringBuilder s = new StringBuilder();
        for (Estudiante estudiante : estudiantes) {
            s.append(estudiante.getNombre()).append(" ")
                .append(estudiante.getCurso()).append(" ")
                .append(estudiante.getProfesor()).append(" ")
                .append(estudiante.getCalificacion()).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, "Ponderado de promedios:\n" + s);
    }

    public String estudianteConNotaMayor() {
        Estudiante mayor = estudiantes[0];
        for (Estudiante e : estudiantes) {
            if (e.getCalificacion() > mayor.getCalificacion()) {
                mayor = e;
            }
        }
        return mayor.getNombre();
    }

    public String estudianteConNotaMenor() {
        Estudiante menor = estudiantes[0];
        for (Estudiante e : estudiantes) {
            if (e.getCalificacion() < menor.getCalificacion()) {
                menor = e;
            }
        }
        return menor.getNombre();
    }

    public double promedioCalificaciones() {
        double suma = 0;
        for (Estudiante e : estudiantes) {
            suma += e.getCalificacion();
        }
        return suma / estudiantes.length;
    }

    public String calificacionesEncimaDelPromedio() {
        double promedio = promedioCalificaciones();
        StringBuilder s = new StringBuilder();
        for (Estudiante e : estudiantes) {
            if (e.getCalificacion() > promedio) {
                s.append(e.getNombre()).append("\n");
            }
        }
        return s.toString();
    }

    public String calificacionesDebajoDelPromedio() {
        double promedio = promedioCalificaciones();
        StringBuilder s = new StringBuilder();
        for (Estudiante e : estudiantes) {
            if (e.getCalificacion() < promedio) {
                s.append(e.getNombre()).append("\n");
            }
        }
        return s.toString();
    }
}

