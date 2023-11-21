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
}