
package animales;

public class Perro {
    private String nombre;
    private String raza;
    private String color;
    private int edad;

    public Perro(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public String getTipoRaza() {
        return raza + " Perro";
    }

    public int getEdad() {
        return edad;
    }

   }