public class Fraccion2 {
    private int numerador;
    private int denominador;

    // Constructores
    public Fraccion2() {
        this.numerador = 0;
        this.denominador = 1;
    }

    public Fraccion2(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    public Fraccion2(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    // Getters y setters
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
        simplificar();
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero");
        }
        this.denominador = denominador;
        simplificar();
    }

    // toString
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    // Operaciones con fracciones
    public Fraccion2 sumar(Fraccion2 f) {
        Fraccion2 nueva = new Fraccion2();
        nueva.denominador = this.denominador * f.denominador;
        nueva.numerador = (this.numerador * f.denominador) + (f.numerador * this.denominador);
        nueva.simplificar();
        return nueva;
    }

    public Fraccion2 restar(Fraccion2 f) {
        Fraccion2 nueva = new Fraccion2();
        nueva.denominador = this.denominador * f.denominador;
        nueva.numerador = (this.numerador * f.denominador) - (f.numerador * this.denominador);
        nueva.simplificar();
        return nueva;
    }

    public Fraccion2 multiplicar(Fraccion2 f) {
        Fraccion2 nueva = new Fraccion2();
        nueva.numerador = this.numerador * f.numerador;
        nueva.denominador = this.denominador * f.denominador;
        nueva.simplificar();
        return nueva;
    }

    public Fraccion2 dividir(Fraccion2 f) {
        if (f.numerador == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        Fraccion2 nueva = new Fraccion2();
        nueva.numerador = this.numerador * f.denominador;
        nueva.denominador = this.denominador * f.numerador;
        nueva.simplificar();
        return nueva;
    }

    // Método para simplificar fracciones
    private void simplificar() {
        int mcd = mcd(Math.abs(numerador), Math.abs(denominador));
        numerador /= mcd;
        denominador /= mcd;
        if (denominador < 0) { // Mantener el signo en el numerador
            numerador = -numerador;
            denominador = -denominador;
        }
    }

    // Método para calcular el Máximo Común Divisor (MCD)
    private int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
