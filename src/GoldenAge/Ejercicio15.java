package GoldenAge;

public class Ejercicio15 {
    import java.util.Scanner;

public class OrdenarNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los dos nombres
        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = scanner.nextLine();
        
        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = scanner.nextLine();
        
        // Comparar los nombres ignorando mayúsculas/minúsculas
        int comparacion = nombre1.compareToIgnoreCase(nombre2);
        
        // Mostrar los nombres ordenados alfabéticamente
        System.out.println("\nNombres ordenados alfabéticamente:");
        
        if (comparacion < 0) {
            System.out.println(nombre1);
            System.out.println(nombre2);
        } else if (comparacion > 0) {
            System.out.println(nombre2);
            System.out.println(nombre1);
        } else {
            System.out.println("Los nombres son iguales: " + nombre1);
        }
        
        scanner.close();
    }
}
}
