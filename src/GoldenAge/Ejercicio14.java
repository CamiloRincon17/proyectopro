package GoldenAge;

public class Ejercicio14 {
    
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Tabla de multiplicar del " + numero + " (del 5 al 50):");
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
