package ejercicio5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    private int dia;
    private int mes;
    private int año;
    public  GregorianCalendar date = new GregorianCalendar();

    public Fecha(int dia, int mes, int año) {
        if(veryfiedDate(dia,mes,año)){
            date.set(año,mes,dia);
            System.out.println("La fecha ingresada es correcta");
        }else {
            System.out.println("La fecha ingresada es incorrecta");
        }
    }

    public boolean veryfiedDate(int dia, int mes, int año){
        if(dia>31 || dia < 1){
            System.out.println("La fecha ingresada es incorrecta");
            return false;
        }
        if(mes>12 || mes < 1  ){
            System.out.println("La fecha ingresada es incorrecta");
            return false;
        }
        if(mes==2 && dia==29 && año % 400 == 0 || (año % 4 == 0 && año % 100 != 0)){
            System.out.println("La fecha ingresada es incorrecta");
            return false;
        }
        System.out.println("La fecha ingresada es correcta");
        return true;
    }
    public void agregarDia(){
            this.date.add(1, Calendar.DAY_OF_YEAR);
            System.out.println("se agrego 1 dia ala fecha ");
    }

    public String toString(){

        return this.date.getTime().toString();
    }

    public static void main(String[] args) {
        Fecha fecha = new Fecha(1,2,1999);

        System.out.println("la fecha ingresada es: "+fecha.toString());
    }
}
