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
                    System.out.print("Ingrese un número: ");
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
                    System.out.print("Ingrese el número a multiplicar: ");
                    valor1 = teclado.nextInt();
                    System.out.print("Ingrese hasta qué valor quiere multiplicar: ");
                    valor2 = teclado.nextInt();
                    TablaMultiplicar(valor1, valor2);
                    break;
                case 3: 
                    System.out.println("");
                    System.out.println("Numeros primos");
                    int inicial;
                    int fin;
                    System.out.print("Ingrese el rango inicial: ");
                    inicial = teclado.nextInt();
                    System.out.print("Ingrese el rango final: ");
                    fin = teclado.nextInt();
                    System.out.println("");
                    for (int i = inicial; i < fin; i++) {
                        if (Primo(i)){
                            System.out.println(i + " ");
                        }
                    }
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Calculadora");
                    int menu;
                    do {
                        System.out.println("");
                        System.out.println("1. Suma");
                        System.out.println("2. Resta");
                        System.out.println("3. Multiplicación");
                        System.out.println("4. División");
                        System.out.println("5. Regresar al menú principal");
                        menu = teclado.nextInt();
                        switch (menu) {
                            case 1:
                                System.out.println("");
                                System.out.println("Suma");
                                float numero1;
                                float numero2;
                                System.out.print("Ingrese el primer numero: ");
                                numero1 = teclado.nextFloat();
                                System.out.print("Ingrese el segundo numero: ");
                                numero2 = teclado.nextFloat();
                                System.out.println("");
                                System.out.println("El resultado es " + Suma(numero1, numero2));
                                break;
                            case 2:
                                System.out.println("");
                                System.out.println("Resta");
                                float resta1;
                                float resta2;
                                System.out.print("Ingrese el primer numero: ");
                                resta1 = teclado.nextFloat();
                                System.out.print("Ingrese el segundo numero: ");
                                resta2 = teclado.nextFloat();
                                System.out.println("");
                                System.out.println("El resultado es: " + Resta(resta1, resta2));
                                break;
                            case 3:
                                System.out.println("");
                                System.out.println("Multiplicación");
                                float multip1;
                                float multip2;
                                System.out.print("Ingrese el primer numero: ");
                                multip1 = teclado.nextFloat();
                                System.out.print("Ingrese el segundo numero: ");
                                multip2 = teclado.nextFloat();
                                System.out.println("");
                                System.out.println("El resultado es: " + Multi(multip1, multip2));
                                System.out.println("");
                                break;
                            case 4: 
                                System.out.println("");
                                System.out.println("División");
                                float div1;
                                float div2;
                                System.out.print("Ingrese el primer número: ");
                                div1 = teclado.nextFloat();
                                System.out.print("Ingrese el segundo número: ");
                                div2 = teclado.nextFloat();
                                System.out.println("");
                                if (div2 == 0) {
                                    System.out.println("No es posible dividir entre cero");
                                } else{
                                    System.out.println("El resultado es: " + Divi(div1, div2));
                                }
                                break;
                            case 5:
                                System.out.println("Ha regresado al menú principal");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    } while (menu != 5);
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opción no valida");
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
        for (int i = 1; i <= second; i++) {
            System.out.println(first + " * " + i + " = " + first*i);
        }
    }
    
    public static boolean Primo(int num){
        int init = 2;
        boolean esprimo = true;
        while ((esprimo) && (init != num)){
            if (num < 2){
                esprimo = false;
            } else if (num % init == 0){
                esprimo = false;
            }
            init++;
        }
        return esprimo;
    }
    
    public static float Suma(float valor1, float valor2){
        float resultado = valor1 + valor2;
        return resultado;
    }
    
    public static float Resta(float valor1, float valor2){
        float resultado = valor1 - valor2;
        return resultado;
    }
    
    public static float Multi(float valor1, float valor2){
        float resultado = valor1 * valor2;
        return resultado;
    }
    
    public static float Divi(float valor1, float valor2){
        float resultado = valor1 / valor2;
        return resultado;
    }
}
