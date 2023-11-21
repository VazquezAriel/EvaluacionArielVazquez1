import java.util.InputMismatchException;
import java.util.Scanner;

class InputData {
    
    private final Scanner scanner;

    public InputData() {
        this.scanner = new Scanner(System.in);
    }

    // Devuelve un numero entero ingresado por consola.
    public int getNumber(String message) {
        while (true) {
            try {
                System.out.println(message);
                return scanner.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Porfavor ingrese un numero entero valido.");
                scanner.next();
            }
        }
    }

    //Debuelve un numero entre 0 y 4 ingresado por consola.
    public int getNumberBetween1And5(String message ) {
        while (true) {
            try {
                System.out.println(message);
                int number =  scanner.nextInt();
                if (number >= 0 && number <= 4) return number;
                System.out.println("Porfavor ingrese un numero entero entre 0 y 4.");

            } catch (InputMismatchException e) {
                System.out.println("Porfavor ingrese un numero entero entre 0 y 4.");
                scanner.next();
            }
        }
    }
}