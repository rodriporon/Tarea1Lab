package tareano1;
import java.util.Scanner;

public class TareaNo1 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("");
            System.out.println("1. Numero par o impar");
            System.out.println("2. Tabla de multiplicar");
            System.out.println("3. Numeros primos");
            System.out.println("4. Calculadora");
            System.out.println("5. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("Numero par o impar");
                    int num1;
                    System.out.print("Ingrese un número ");
                    num1 = teclado.nextInt();
                    if (Par(num1)) {
                        System.out.println("El numero es par");
                    } else {
                        System.out.println("El numero es impar");
                    }
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Tabla de multiplicar");
                    int valor1;
                    int valor2;
                    System.out.println("Ingrese el número a multiplicar");
                    valor1 = teclado.nextInt();
                    System.out.println("Ingrese hasta qué valor quiere multiplicar");
                    valor2 = teclado.nextInt();
                    TablaMultiplicar(valor1, valor2);
                    break;
                case 3: 
                    System.out.println("");
                    System.out.println("Numeros primos");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Calculadora");
                    break;
            }       
        } while (opcion != 5);
    }
    
    public static boolean Par(int num1) {
        if (num1 % 2 == 0) {
            return true; 
        } else { 
            return false;
        }
    }
    
    public static void TablaMultiplicar(int first, int second) {
        for (second = 1; second < 11; second++) {
            System.out.println(first + " * " + second + " = " + first*second);
        }
    }
}
