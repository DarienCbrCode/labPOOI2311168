import Personas.Empleado;
import Personas.Estudiante;
import animales.Perro;
import figurasgeometricas.Circulo;
import figurasgeometricas.Figura;
import figurasgeometricas.Punto;
import figurasgeometricas.Rectangulo;
import figurasgeometricas.Triangulo;
import otros.Automovil;
import otros.Celular;
import otros.Mesa;
import otros.Pelota;


public class TestPrincipal {
      
    public static void main(String[] args) {
        objeto1(args);
        objeto2(args);
        objeto3(args);
        objeto4(args);
        objeto5(args);
        objeto6(args);
        objeto7(args);
        objeto8(args);
        objeto9(args);
        objeto10(args);
        objeto11(args);
        objeto12(args);
    }
       
    public static void objeto1(String[] args){
        Perro miPerro = new Perro("Max", "Labrador", "Amarillo", 3);

        System.out.println("Nombre del perro: " + miPerro.getTipoRaza());
        System.out.println("Tipo de raza del perro: " + miPerro.getEdad());
       
    }
    
    public static void objeto2(String[] args){
        Automovil miAutomovil = new Automovil("ABC123", "Toyota", "Corolla", "Rojo", "Sedán");

        System.out.println("Marca del automovil: " + miAutomovil.getMarca());
        System.out.println("Modelo del automovil: " + miAutomovil.getModelo());
    }
    
    public static void objeto3(String[] args){
        Celular miCelular = new Celular(123456789, "Samsung", "Negro", "Galaxy S21", "Plan Premium");

        System.out.println("Marca del celular: " + miCelular.getMarca());
        System.out.println("Modelo del celular: " + miCelular.getModelo());
    }
    
    public static void objeto4(String[] args){
        Mesa miMesa = new Mesa(120.5f, 80.0f, "Marrón", "Madera", "Rectangular");

        System.out.println("Material de la mesa: " + miMesa.getMaterial());
        System.out.println("Forma de la mesa: " + miMesa.getForma());
    }
    
    public static void objeto5(String[] args){
        Pelota miPelota = new Pelota(15.5f,"Blanco");

        System.out.println("Tamano de la pelota: " + miPelota.getTamaño());
        System.out.println("Color de la pelota: " + miPelota.getColor());
    }
    
    public static void objeto6(String[] args){
        Empleado miEmpleado = new Empleado(1, "Juan", "Pérez", 50000);
        
        System.out.println("Salario del empleado: $" + miEmpleado.getSalario());
        System.out.println("Salario anual del empleado: $" + miEmpleado.getSalarioAnual());
    }
    
    public static void objeto7(String[] args){
        Estudiante miEstudiante = new Estudiante(1, "Juan", "Pérez", 20, "Matematicas", 90.5f);

        System.out.println("Curso del estudiante: " + miEstudiante.getCurso());
        System.out.println("Calificacion del estudiante: " + miEstudiante.getNota());
    }
    
    public static void objeto8(String[] args){
        Circulo miCirculo = new Circulo(5.0,"Rojo");

        System.out.println("Radio del circulo: " + miCirculo.getRadio());
        System.out.println("Area del circulo: " + miCirculo.getArea());
        System.out.println("Color del circulo: " + miCirculo.getColor());
        miCirculo.setColor("Rojo");
        System.out.println("Nuevo color del circulo: " + miCirculo.getColor());
    }
    
    public static void objeto9(String[] args){
        Figura miFigura = new Figura("Cuadrado");

        System.out.println("Area de la figura: " + miFigura.getArea());
        boolean esRegular = miFigura.FiguraRegorIrreg();
        System.out.println("La figura es regular? " + esRegular);
    }
    
    public static void objeto10(String[] args){
        Punto miPunto = new Punto(3.5, 2.0);

        System.out.println("Coordenada X: " + miPunto.getCoordenadaX());
        System.out.println("Coordenada Y: " + miPunto.getCoordenadaY());
    }
    
    public static void objeto11(String[] args){
        Rectangulo miRectangulo = new Rectangulo();

        System.out.println("Largo del rectangulo: " + miRectangulo.getLargo());
        System.out.println("Ancho del rectangulo: " + miRectangulo.getAncho());
        System.out.println("Area del rectangulo: " + miRectangulo.getArea());
        miRectangulo.setLargo(4.0f);
        miRectangulo.setAncho(2.0f);
        System.out.println("Nuevo area del rectangulo: " + miRectangulo.getArea());
    }
    
    public static void objeto12(String[] args){
        Punto vertice1 = new Punto(0, 0);
        Punto vertice2 = new Punto(4, 0);
        Punto vertice3 = new Punto(2, 3);

        Triangulo miTriangulo = new Triangulo(vertice1, vertice2, vertice3);
        double perimetro = miTriangulo.getPerimetro();
        String tipo = miTriangulo.getTipo();
        System.out.println("Perimetro del triangulo: " + perimetro);
        System.out.println("Tipo de triangulo: " + tipo);
    }
}