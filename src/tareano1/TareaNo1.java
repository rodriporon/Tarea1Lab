package tareano1;
import java.util.Scanner;

public class TareaNo1 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1. Numero par o impar");
            System.out.println("2. Tabla de multiplicar");
            System.out.println("3. Numeros primos");
            System.out.println("4. Calculadora");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("Numero par o impar");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Tabla de multiplicar");
                    break;
                case 3: 
                    System.out.println("");
                    System.out.println("Numeros primos");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Calculadora");
            }       
        } while (opcion != 4);
    }
}
