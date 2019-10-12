import java.util.Scanner;

public class Ada {
    public static void main(String[] args) {
        double numerohabmburgues ;
        double tipohambuguesa;
        double tipodepago;
        double tot, pa;
        double to;
        double cargo;
        String  ti , tp;
        System.out.println("ingrese el tipo de hamburguesa: ");
        System.out.println("ingrese la cantidad de hamburguesas: ");
        System.out.println("ingrese el tipo de tarjeta: ");


        if (ti == "sencilla"){
            pa=20;
        }else{
          if (ti == "doble"){
              pa=25;

          }else{
              pa=28;

          }

    }
        to= pa* numerohabmburgues ;

        if (tp == "tar"){
            cargo= to * 0.05;

        }else{
            cargo= 0;

        }
        tot= to+ cargo;
        System.out.println("mostrar cargo"+cargo);
        System.out.println("mostar total cargo" + tot);
        System.out.println("mostrar total cargp"+to);
        String preciohambuerguesa;
        System.out.println("mostrar precio hambuerguesa "+preciohambuerguesa);

}}
