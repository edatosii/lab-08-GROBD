package co.umariana;

/**
 * Ejercicios de calentamiento.
 *
 * INSTRUCCIONES
 * -------------
 * 1. Cada método tiene un "TODO" y lanza UnsupportedOperationException.
 *    Reemplace esa línea por su implementación.
 * 2. NO modifique las pruebas (src/test). Ejecútelas con:   mvn test
 * 3. No cambie los nombres ni los parámetros de los métodos.
 */
///editado por Gabriel David Obando Rosero AKA GROBD
public class Calculadora {

    /** @return la suma de a y b */
    public int sumar(int a, int b) {
        // TODO: escriba su código aquí
        int suma = a + b;
        System.out.println("la suma =" + suma);
        return suma;
    }

    /** @return a menos b */
    public int restar(int a, int b) {
        int resta = a - b;
        System.out.println("la resta ="+ resta);
        return resta;
    }

    /** @return el producto de a y b */
    public int multiplicar(int a, int b) {
     int multiplicacion = a*b;
        System.out.println("la multiplicacion es = " + multiplicacion);
        return multiplicacion;
    }

    /**
     * @return a dividido entre b, con decimales (ej.: 7 / 2 = 3.5)
     * @throws ArithmeticException si b es 0 (mensaje: "No se puede dividir entre cero")
     */
    public double dividir(int a, int b) {
        if (b == 0) {
        throw new ArithmeticException("No se puede dividir entre cero");
        }
        else {
        double Adouble = a;
        double bDouble = b;
        double dividido = Adouble/bDouble;
        return dividido;
        }     
    }

    /** @return true si el número es par (el 0 es par; los negativos también pueden serlo) */
    public boolean esPar(int numero) {
        boolean espar;
        if (numero % 2 == 0) {    
        espar = true;
        }
        else {
        espar = false;
        }
        System.out.println("es par?: " + espar);
        return espar;
    }
}
