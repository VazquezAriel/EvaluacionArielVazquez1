
public class Main {

    public static void main(String[] args) {
        
        // INGRESO DE DATOS
        InputData input = new InputData();

        int number = input.getNumber("Ingrese un número entero: ");
        int row = input.getNumberBetween1And5("Ingrese la ubicación en la Matriz 5x5 - Fila: ");
        int column = input.getNumberBetween1And5("Ingrese la ubicación en la Matriz 5x5 - Columna: ");

        System.out.println("==================================================");
        System.out.println("- Número ingresado: " + number);
        System.out.println("- Ubicación en la matriz 5x5: Fila: " + row + ", Columna: " + column);

        // IMPRESION DEL RESULTADO
        Process proceso = new Process(number, row, column);
        System.out.println("- Resultado:");
        proceso.printSequentialMatrix();
        System.out.println("==================================================");

    }
    
}
