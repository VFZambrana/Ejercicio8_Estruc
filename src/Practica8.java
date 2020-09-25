import java.util.Scanner;


public class Practica8 {

    private String[] nombres;
    private int[] edades;

    public void cargar() {

        Scanner teclado = new Scanner(System.in);
        nombres = new String[100];
        edades = new int[100];


        for (int i = 0; i < nombres.length; i++) {

            System.out.print("Ingrese nombre:");
            nombres[i] = teclado.next();
            if (nombres[i].equals("*")) {
                break ;
            }
            else {
                System.out.print("Ingrese edad:");
                edades[i] = teclado.nextInt();
            }
        }
    }
    public void mayoresEdad() {
        System.out.println("Personas mayores de edad.\n");
        for (int i = 0; i < nombres.length; i++) {
            if (edades[i] >= 18) {
                System.out.println("nombre:" + nombres[i] + "\nedad:" + edades[i]);
            }
        }
    }
    public void masEdad() {
        System.out.println("\nPersonas mayores de edad.\n");
        for (int i = 0; i < nombres.length; i++) {
            if (edades[i] >= 30) {
                System.out.println("nombre:" + nombres[i] + "\nedad:" + edades[i]);
            }
        }
    }
}
