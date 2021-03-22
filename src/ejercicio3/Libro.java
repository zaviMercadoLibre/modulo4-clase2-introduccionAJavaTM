package ejercicio3;

import org.w3c.dom.ls.LSOutput;

public class Libro
{
    private String titulo;
    private String autor;
    private int id;
    private boolean prestado;

    public Libro()
    {

    }

    public Libro(String titulo, String autor, int id)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.prestado = false;
    }

    public void prestamo()
    {
        setPrestado(true);
    }

    public void devolucion()
    {
        setPrestado(false);
    }
    @Override
    public String toString()
    {
        return getTitulo()+", "+getId()+" , "+getAutor();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public static void main(String[] args) {
        Libro libro = new Libro("harry poter","j.k.rowling",1234);
        System.out.println(libro.toString());
        System.out.println("Estado: "+libro.isPrestado());
        libro.prestamo();
        System.out.println("Estado: "+libro.isPrestado());
        libro.devolucion();
        System.out.println("Estado: "+libro.isPrestado());
    }

}
