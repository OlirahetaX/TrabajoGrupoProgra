package grupoprogra;

import java.util.Scanner;
import java.util.Random;

public class GrupoProgra {

    public static Scanner entrada = new Scanner(System.in);
    public static Scanner rm = new Scanner(System.in);
    public static Tv volumen = new Tv();

    public static void main(String[] args) {

        System.out.print("Desea ver television [1. Si/2. No/3.escoger un programa aleatorio]: ");
        int op = entrada.nextInt();
        while ((op == 1) || (op == 3)) {
            System.out.println();
            System.out.println("Programas disponibles");
            System.out.println("1. La casa de papel \n2. The Walking Dead \n3. The Titanic \n4. Frozen \n5. Breaking Bad");
            System.out.println();
            if (op == 3) {
                int d5 = new Random().nextInt((5 - 1) + 1) + 1;//dado de 5 lados
                programa(d5);
            } else if (op == 1) {
                programa(intprograma());
            }
            System.out.print("Desea cambiar el canal [1. Si/2. No/3. otro programa aleatorio]: ");
            op = entrada.nextInt();
        }
    }

    public static int intprograma() {
        int d5 = 0;
        boolean x = true;
        while (x == true) {
            System.out.println("Ingrese el nombre del programa que desea ver: ");
            String progra = rm.nextLine();
            System.out.println();
            if (progra.toLowerCase().contains("La casa de papel".toLowerCase())) {
                d5 = 1;
                x = false;
            } else if (progra.toLowerCase().contains("The Walking Dead".toLowerCase())) {
                d5 = 2;
                x = false;
            } else if (progra.toLowerCase().contains("The Titanic".toLowerCase())) {
                d5 = 3;
                x = false;
            } else if (progra.toLowerCase().contains("Frozen".toLowerCase())) {
                d5 = 4;
                x = false;
            } else if (progra.toLowerCase().contains("Breaking Bad".toLowerCase())) {
                d5 = 5;
                x = false;
            } else {
                System.out.println("ERROR, intenete escribir sin tildes y con la primera en mayuscula");
            }
        }
        return d5;
    }

    public static void programa(int d5) {
        int vol;
        boolean x = true;
        while (x == true) {
            switch (d5) {
                case 1 -> {
                    Tv Lacasadepapel = new Tv("La casa de papel", "Jesus Colmenar", "Suspenso", 50, "Netflix", "Serie");
                    System.out.println("--- La casa de papel se esta reproduciendo---");
                    Lacasadepapel.mensaje();
                    x = false;
                }
                case 2 -> {
                    Tv Walkingdead = new Tv("The Walking Dead", " Robert Kirkman", "Horror", 50, "Fox", "Serie");
                    System.out.println("---" + "The Walking Dead" + " se esta reproduciendo---");
                    Walkingdead.mensaje();
                    x = false;

                }
                case 3 -> {
                    Tv Titanic = new Tv("The Titanic", "James Cameron", "Suspenso", 195, "Fox", "Pelicula");
                    System.out.println("---" + "The Titanic" + " se esta reproduciendo---");
                    Titanic.mensaje();
                    x = false;

                }
                case 4 -> {
                    Tv Frozen = new Tv("Frozen", "Chris Buck", "Fantasia", 102, "Disney", "Pelicula");
                    System.out.println("---" + "Frozen" + " se esta reproduciendo---");
                    Frozen.mensaje();
                    x = false;

                }
                case 5 -> {
                    Tv Breakingbad = new Tv("Breaking Bad", "Vince Gilligan", "Drama", 50, "Sony", "Serie");
                    System.out.println("---" + "Breaking Bad" + " se esta reproduciendo---");
                    Breakingbad.mensaje();
                    x = false;

                }
            }
        }
        System.out.println();
        System.out.print("En cuanto desea dejar el volumen: ");
        entrada = new Scanner(System.in);
        vol = entrada.nextInt();
        while ((vol < 0) || (vol > 100)) {
            System.out.println("El volumen solo llega de 0 a 100");
            vol = entrada.nextInt();
        }
        volumen.setVolumen(vol);
        System.out.println("El volumen ahora es: " + (volumen.getVolumen()));
        System.out.println();

    }

}
