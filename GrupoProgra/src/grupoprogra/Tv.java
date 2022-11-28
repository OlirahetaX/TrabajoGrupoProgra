package grupoprogra;

public class Tv {
   public String nombre;
    public String director;
    public String genero;
    public int duracion;
    public String canal;
    public String tipo;
    public int volumen;
    //mutadores
    public int getVolumen() {
        return volumen;
    }
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
//constructores
    public Tv() {
    }
    public Tv(String nombre, String director, String genero, int duracion, String canal, String tipo) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.canal = canal;
        this.tipo = tipo;
    }
    public void mensaje() {
        System.out.println(this.nombre + " dirigida por " + this.director + ".");
        System.out.println("es una " + this.tipo + " del genero " + this.genero);
        System.out.println("con una duracion de  " + this.duracion + " minutos, del canal " + this.canal);
    }

}
