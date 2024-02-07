package examen1P;

import javax.swing.JOptionPane;

/**
 * Clase que calcula la raíz cuadrada de un número dado, lo va acumulando y 
 * eleva al cubo el valor de la raíz cuadrada inicialmente calculado. Los valores
 * se piden a través de una ventana modal y la ejecución finaliza cuando se 
 * introduce como valor el 0.
 * @version examen 1.0 07/02/2024
 * @author Roberto Delgado Sánchez
 */
public class RaizCuadrada 
{
    /**
     * Método principal de la clase.
     * Pide por pantalla un número, calcula ru raíz cuadrada, suma su valor
     * al total y luego eleva el valor de la raíz cuadrada al cubo, almacenando 
     * el resultado en la variable operacion. No se muestra ningún resultado 
     * por pantalla.
     * @param args parámetros que puede recibir desde la línea de comandos.
     */
    public static void main(String[] args) 
    {
        // Variables empleadas en el código.
        String teclado;
        double num = 0.0;
        double operacion = 0.0;
        double raizCuadrada = 0.0;
        double total = 0;
        
        do
        {
            // Mostramos una ventana en la que le pedimos al usuario un número.
            teclado = JOptionPane.showInputDialog("Introduce un número (0 para terminar)");
            num = Double.parseDouble(teclado);
            
            // Si es distinto de 0 hacemos los cálculos mencionados.
            if (num != 0)
            {
                raizCuadrada = Math.sqrt(num);
                total += raizCuadrada;
                operacion = Math.pow(raizCuadrada, 3);
            } 
        } while (num != 0);
    }
}