public class Operaciones {

    public double numero1;
    public double numero2;
    public double resultado;

    public void sumar() {
        this.resultado = this.numero1 + this.numero2;
    }

    public void restar() {
        this.resultado = this.numero1 - this.numero2;
    }

    public double multiplicar(double x, double y) {
        return x * y;
    }

    public double dividir(double x, double y) {
        return x / y;
    }

    public boolean calcularPositivo(int n) {
        return n > 0;
    }

    public boolean calcularPar(int n) {
        return n % 2 == 0;

    }

    public boolean calcularPrimo(int n) {
        int contador = 0;
        for (int divisor = 1; divisor <= n; divisor++) {
            if (n % divisor == 0) {
                contador++;
            }
        }
        return contador == 2;
    }

    public double factorial(double n) {
        double factorial = 1;
        while (n != 0) {
            factorial = factorial * n;
            n--;
        }
        return factorial;
    }

    public boolean numeroPerfecto(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return (sum == n);
    }

    public boolean numerosAmigos(int a, int b) {
        return (sumaDeDiv(a) == b && sumaDeDiv(b) == a);
    }

    /*
        Funciones privadas
            estas solo son usadas por la clase local
     */
    //llamamos a la funcion para retornar la suma de los divisores del numero
    private static int sumaDeDiv(int x) {
        // 1 es un divisor propio
        //Es el numero base
        int suma = 1;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                suma += i;
                // Para manejar cuadrados perfectos
                if (x / i != i) {
                    suma += x / i;
                }
            }
        }
        return suma;
    }
}
