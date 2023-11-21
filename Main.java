
public class Main {

    public static void main(String[] args) {
        
        InputData input = new InputData();

        int number = input.getNumber("Ingrese un número entero: ");
        int row = input.getNumber("Ingrese la ubicación en la Matriz 5x5 - Fila: ");
        int column = input.getNumber("Ingrese la ubicación en la Matriz 5x5 - Columna: ");

        System.out.println("==================================================");
        System.out.println("- Número ingresado: " + number);
        System.out.println("- Ubicación en la Matriz 5x5: Fila: " + row + ", Columna: " + column);
        System.out.println("==================================================");
    }
    
}
