package ejercicio4;

public class Fraccion {
    private double x;
    private double y;

    public Fraccion(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Fraccion(int a,int b, int c, int d) {
        this.x = (double) a/b;
        this.y = (double) c/d;
    }
    public Fraccion(int a,int b, double c) {
        this.x = (double) a/b;
        this.y = c;
    }
    public Fraccion(double a, int c, int d) {
        this.x = a;
        this.y = (double) c/d;
    }

    public void sumar ()
    {
        double result = this.x + this.y;
        System.out.println("La suma de los numeros es :"+result);
    }
    public void restar()
    {
        double result = this.x -this.y;
        System.out.println("la resta de los numeros es: "+result);
    }
    public void dividir()
    {
        double result = this.x / this.y;
        System.out.println("la resta de los numeros es: "+result);
    }
    public void multiplicar()
    {
        double result = this.x * this.y;
        System.out.println("la resta de los numeros es: "+result);
    }

    public static void main(String[] args) {
        Fraccion fracUno = new Fraccion(1,2,3,4);
        Fraccion fracDos = new Fraccion(1.4,5.7);
        Fraccion fracTres = new Fraccion(1,2,5.4);
        Fraccion fracCuatro = new Fraccion(4.4,1,2);

        fracUno.sumar();
        fracCuatro.multiplicar();
        fracDos.dividir();
        fracTres.restar();
    }

}
