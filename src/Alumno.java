import java.util.Scanner;
public class Alumno{
    static Scanner sc = new Scanner (System.in);
    //declaracion de los atributos
    private String NombreAlumnos;
    private int Matricula;
    //constructor vacio
    public Alumno(String nombre,int matricula){
        this.Matricula=matricula;
        this.NombreAlumnos=nombre;
    }
    //metodo para pedir el nombre
    public void PedirNombre() {
        System.out.println("Ingrese su nombre");
        NombreAlumnos = sc.next();
    }
    //metodo para pedir las matricula
    public void PedirMatricula(){
            System.out.print("Ingrese su matricula: ");
            Matricula = sc.nextInt();
    }
    public void InformacionAlumno(){
        System.out.println("El alumno: "+this.NombreAlumnos);
        System.out.println("De la matricula: "+this.Matricula);
    }
}
