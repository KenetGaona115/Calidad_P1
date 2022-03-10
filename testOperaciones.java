import java.util.Scanner;

public class testOperaciones {

    public static void main(String[] args) {
        int opcion;
        int n1 = 0;
        int n2 = 0;
        Operaciones operaciones = new Operaciones();
        Scanner lector = new Scanner(System.in);
        do {
            System.out.println("Escribe el numero de una de las opciones");
            System.out.println("1. suma");
            System.out.println("2. restar");
            System.out.println("3. multiplicar");
            System.out.println("4. dividir");
            System.out.println("5. numero positivo");
            System.out.println("6. numero par");
            System.out.println("7. numero impar");
            System.out.println("8. factorial");
            System.out.println("9. numero perfecto");
            System.out.println("10.numeros amigos");
            System.out.println("-> 0. salir");
            opcion = lector.nextInt();
            switch (opcion) {
                case 0:
                    
                    break;
                case 1:
                    System.out.println("Haz seleccionado la opcion 1");
                    System.out.println("Sumar dos numeros");
                    System.out.println("Ingresa un numero: ");
                    operaciones.numero1 = lector.nextDouble();
                    System.out.println("Ingresa un numero: ");
                    operaciones.numero2 = lector.nextDouble();
                    operaciones.sumar();
                    System.out.println("La suma es : " + operaciones.resultado);
                    break;
                case 2:
                    System.out.println("Haz seleccionado la opcion 2");
                    System.out.println("restar dos numeros");
                    System.out.println("Ingresa un numero: ");
                    operaciones.numero1 = lector.nextDouble();
                    System.out.println("Ingresa un numero: ");
                    operaciones.numero2 = lector.nextDouble();
                    operaciones.restar();
                    System.out.println("La resta es : " + operaciones.resultado);
                    break;
                case 3:
                    System.out.println("Haz seleccionado la opcion 3");
                    System.out.println("multiplicar dos numeros");
                    System.out.println("Ingresa un numero: ");
                    operaciones.numero1 = lector.nextDouble();
                    System.out.println("Ingresa un numero: ");
                    operaciones.numero2 = lector.nextDouble();
                    System.out.println("La multiplicacion es: " + operaciones.multiplicar(operaciones.numero1, operaciones.numero2));
                    // System.out.println("La multiplicacion es: " + operaciones.resultado);
                    break;
                case 4:
                    System.out.println("Haz seleccionado la opcion 4");
                    System.out.println("Dividir dos numeros ");
                    System.out.println("Ingresa un numero: ");
                    operaciones.numero1 = lector.nextDouble();
                    System.out.println("Ingresa un numero: ");
                    operaciones.numero2 = lector.nextDouble();
                    System.out.println("La division es: " + operaciones.dividir(operaciones.numero1, operaciones.numero2));
                    break;
                case 5:
                    System.out.println("Haz seleccionado la opcion 5");
                    System.out.println("Calcular numero positivo");
                    System.out.println("Ingresa un numero: ");
                    //operaciones.numero1 = lector.nextDouble();
                    System.out.println("El numero positivo es " + operaciones.calcularPositivo(lector.nextInt()));
                    break;
                case 6:
                    System.out.println("Haz seleccionado la opcion 6");
                    System.out.println("Calcular numero par");
                    System.out.println("Ingresa un numero: ");
                    System.out.println("El numero par es :" + operaciones.calcularPar(lector.nextInt()));
                    break;
                case 7:
                    System.out.println("Haz seleccionado la opcion 7");
                    System.out.println("Es numero impar");
                    System.out.println("Ingresa el numero:");
                    n1 = lector.nextInt();
                    System.out.println(operaciones.calcularPrimo(n1));
                    break;
                case 8:
                    System.out.println("Haz seleccionado la opcion 7");
                    System.out.println("Factorial de un numero");
                    System.out.println("Ingresa el numero:");
                    n1 = lector.nextInt();
                    System.out.println(operaciones.factorial(n1));
                    break;
                case 9:
                    System.out.println("Haz seleccionado la opcion 9");
                    System.out.println("Es numero perfecto");
                    System.out.println("Ingresa el numero:");
                    n1 = lector.nextInt();
                    System.out.println(operaciones.numeroPerfecto(n1));
                    break;
                case 10:
                    System.out.println("Haz seleccionado la opcion 10");
                    System.out.println("Numeros amigos");
                    System.out.println("Ingresa el primer numero:");
                    n1 = lector.nextInt();
                    System.out.println("Ingresa el segundo numero:");
                    n2 = lector.nextInt();
                    System.out.println(operaciones.numerosAmigos(n1,n2));
                    break;
                default :
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 0);
        System.out.println("\nGracias por usar el prograna\nRosa Alicia Martinez Estrada");
    }
}
