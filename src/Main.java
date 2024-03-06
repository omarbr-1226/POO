import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp;
        do {
            Alumno alumno = new Alumno("",0);
            Materia mat1 = new Materia("",0);
                alumno.PedirNombre();
                alumno.PedirMatricula();
                mat1.PedirDatos();
                alumno.InformacionAlumno();
                mat1.getPromedio();
                mat1.getDescuento();
                System.out.println("--------------------------------------------------");
            System.out.println("Desea agregar otro alumno? (si o no)");
            resp=sc.next().charAt(0);
        }while(resp=='s'|| resp=='S');
    }
}