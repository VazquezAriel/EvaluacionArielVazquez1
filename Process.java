public class Process {

    private int number;
    private int positionRow;
    private int positionCol;

    public Process(int number, int positionRow, int positionCol) {
        this.number = number;
        this.positionRow = positionRow;
        this.positionCol = positionCol;
    }

    /**  El algoritmo recorre una matriz de 5x5, en cada iteracion se evalua si dicha iteracion coincide con la posicion ya sea 
        en las filas o columnas del numero ingresado, si esa condicion se cumple para el caso de las filas se le suma el valor 
        absoluto de la diferencia entre la posicion en las filas del numero y la iteracion de i en ese momento, en caso de las 
        columnas se suma el valor absoluto de la diferencia entre la posicion en las columnas del numero y la iteracion de j 
        en ese momento.**/
    public void printSequentialMatrix() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == positionRow) {
                    int aux = Math.abs(j - positionCol);
                    System.out.print(number + aux);
                    continue;
                }
                if (j == positionCol) {
                    int aux = Math.abs(i - positionRow);
                    System.out.print(number + aux);
                    continue;
                }
                System.out.print("-");

            }
            System.out.println();
        }
    }
    
}
