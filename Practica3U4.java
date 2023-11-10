/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fundamentos;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el estudiante (1: Angel, 2: Karla, 3: Zuriel): ");
        int opcionEstudiante = scanner.nextInt();

        switch (opcionEstudiante) {
            case 1:
                CalculadoraCalificaciones.calcularPromedioEstudiante("Angel");
                break;
            case 2:
                CalculadoraCalificaciones.calcularPromedioEstudiante("Karla");
                break;
            case 3:
                CalculadoraCalificaciones.calcularPromedioEstudiante("Zuriel");
                break;
            default:
                System.out.println("Opcion no valida vuelva intentar vuelva intentar no con su ex si no a poner el nombre");
        }

        CalculadoraCalificaciones.calcularPromedioMaterias();
    }
}

class CalculadoraCalificaciones {
    static double[][] calificaciones = {
            {90.5, 85.0, 78.5, 92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5, 91.0, 87.5}
    };

    static void calcularPromedioEstudiante(String nombreEstudiante) {
        int indiceEstudiante = obtenerIndiceEstudiante(nombreEstudiante);
        if (indiceEstudiante != -1) {
            double suma = 0;
            for (int j = 0; j < calificaciones[indiceEstudiante].length; j++) {
                suma += calificaciones[indiceEstudiante][j];
            }
            double promedio = suma / calificaciones[indiceEstudiante].length;
            System.out.println("Promedio de calificaciones para el estudiante " + nombreEstudiante + ": " + promedio);
        } else {
            System.out.println("Estudiante no encontrado vulva a intentar por fis");
        }
    }

    static void calcularPromedioMaterias() {
        for (int j = 0; j < calificaciones[0].length; j++) {
            double suma = 0;
            for (int i = 0; i < calificaciones.length; i++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / calificaciones.length;
            System.out.println("Promedio de calificaciones para la materia " + obtenerNombreMateria(j) + ": " + promedio);
        }
    }

    static String obtenerNombreMateria(int indiceMateria) {
        String[] materias = {"Calculo Diferencial", "Matematicas Discretas", "Fundamentos de Programacion", "Fundamentos de Investigacion"};
        return materias[indiceMateria];
    }

    static int obtenerIndiceEstudiante(String nombreEstudiante) {
        String[] estudiantes = {"Angel", "Karla", "Zuriel"};
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].equals(nombreEstudiante)) {
                return i;
            }
        }
        return -1; 
    }
}

    
