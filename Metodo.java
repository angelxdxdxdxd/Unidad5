/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodo;

/**
 *
 * @author Usuario
 */
public class Metodo {

    public static void main(String[] args) {
        
        int[][] consumo ={
            {100, 50, 30, 120, 60},
            {32, 132, 46, 80, 90},
            {45, 100, 56, 26, 36},
            {60, 110, 72, 33, 40}
        };
        
        System.out.println("Consumo/dia");
        int[] sumAsig = NewClass.calcularSuma(consumo, 3, 4);
        for (int c : sumAsig) {
            System.out.println(c);
        }
        
        System.out.println("Consumo/semana");
        double[] consumo = NewClass.calcularSuma(consumo);
        for (int i = 0; i < consumo.length; i++) {
            System.out.println(consumo[i]); 
        }
        public static void[] calcularSuma(int[][] consumo) {
            
            int[] suma = new int[3];
            
            for (int i = 0; i < 4; i++) { //Control de filas
            double suma = 0.0;
            for (int j = 0; j < 5; j++) { //Control de columnas 
                suma += consumo[i][j];
            }
            
            
        }
    }
}

        