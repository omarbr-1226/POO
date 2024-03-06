import java.util.Scanner;
public class Materia {
    static Scanner sc = new Scanner(System.in);
    private int calificacion;
    private String nombre;
    private int promedio =0;
    private int pagoColegiatura=2000;
    //constructor vacío
    public Materia(String nombre,int calificacion) {
        this.nombre=nombre;
        this.calificacion=calificacion;
    }
    //metodo para mostrar todas las materias sin necesidad de instanciar todos los objetos
    static public void NombreMaterias(int materias) {
        switch (materias) {
            case 0:
                System.out.println("Ingles");                                 break;
                case 1:  System.out.println("Calculo Integral");              break;
                case 2: System.out.println("Algebra Lineal");                 break;
                case 3: System.out.println("Programación Orientada Objetos"); break;
                case 4: System.out.println("Contabilidad");                   break;
                case 5: System.out.println("Quimica");                        break;
                case 6: System.out.println("Probabilidad y Estadistica");     break;
            }
    }
    //metodo para pedir los datos de la materias (calificación)
    public void PedirDatos() {
        int[] materias = new int[7];
        for (int i = 0; i < materias.length; i++) {
            System.out.println("Ingresa la calificación de la materia: ");
            NombreMaterias(i);
            materias[i] = sc.nextInt();
            do {
                if (materias[i] > 100 || materias[i] < 0) {
                    System.out.println("Datos no validos");
                    materias[i] = sc.nextInt();
                }
            } while (materias[i] > 100 || materias[i] < 0);
            promedio += materias[i];
        }
    }
   public void getPromedio(){
        promedio=promedio/7;
        System.out.println("Obtuvo un promedio final de: "+promedio);
   }
    public void   getDescuento() {
        if (promedio >= 100) {
            System.out.println("Felicidades tienes el 100% de descuento, ahora pagaras: " + (pagoColegiatura*0));
        } else if (promedio >= 90) {
            System.out.println("Felicidades tienes el 20% de descuento, ahora pagaras: " + (pagoColegiatura * 0.8));
        } else if (promedio < 90) {
            System.out.println("ponle mas empeño no obtuviste un descuento :( JAJAJA pagaras: " + pagoColegiatura);
        }
    }
}
