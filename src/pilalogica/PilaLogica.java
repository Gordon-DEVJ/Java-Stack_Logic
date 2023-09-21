
package pilalogica;

import java.util.Scanner;

public class PilaLogica {

static Scanner sc=new Scanner(System.in);
static int dato;
static int n_Posiciones;
static int n_Elementos;
static int pila[];

    public static void main(String[] args) {
        // TODO code application logic here
        
        while(true){
            System.out.println("\tOpciones");
            System.out.println("");
            System.out.println("1.\tCrear\t|\tNueva Pila");
            System.out.println("2.\tBorrar\t|\tBorrar Pila");
            System.out.println("3.\tLlena?\t|\tVerificar si esta llena");
            System.out.println("4.\tVacia?\t|\tVerificar si esta vacia");
            System.out.println("5.\tPush\t|\tAgregar dato");
            System.out.println("6.\tPop\t|\tSacar elemento");
            System.out.println("7.\tTop\t|\tMirar ultimo elemento");
            System.out.println("");
            System.out.println("8.\tSalir");
            int opc=sc.nextInt();
            switch (opc){
                case 1:
                    Crear();
                    break;
                case 2:
                    if (n_Posiciones==0) {
                        System.out.println("No existe pila para borrar");
                    }else{
                        Borrar();
                    }break;                    
                case 3:
                    if (n_Posiciones==0) {
                        System.out.println("No existe pila para verificar");
                    }else{
                        if (Llena()) {
                            System.out.println("Pila Llena");
                        }
                    }break;
                case 4:
                    if (n_Posiciones==0) {
                        System.out.println("No existe pila para verificar");
                    }else{
                        if (Vacia()) {
                            System.out.println("Pila Vacia");
                        }
                    }break;
                case 5:
                    if (n_Posiciones==0) {
                        System.out.println("No existe pila para Push");
                    }else{
                        push();
                    }break;
                case 6:
                    if (n_Posiciones==0) {
                        System.out.println("No existe pila para Push");
                    }else{
                        pop();
                    }break;
                case 7:
                    if (n_Posiciones==0) {
                        System.out.println("No existe pila para Push");
                    }else{
                        top();
                    }break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }
    }
    
    public static void Crear(){
        System.out.println("Ingrese el numero de posiciones");
        n_Posiciones=sc.nextInt();
        pila = new int[n_Posiciones];
        n_Elementos = 0;
        System.out.println("Tamaño de pila creada: "+pila.length+"Posiciones");
    }
    
    public static void Borrar(){
        System.out.println("Borrando Pila...");
        pila=null;
        System.out.println("Pila Borrada");
    }
    
    public static boolean Vacia(){
        if (n_Elementos==0) {
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean Llena(){
        if (n_Elementos==n_Posiciones) {
            return true;
        }else{
            return false;
        }
    }
    
    public static void push(){
        if (Llena()) {
            System.out.println("Pila llena");
        }else{
            System.out.println("Digite nuevo dato");
            int dato = sc.nextInt();
            pila[n_Elementos] = dato;
            n_Elementos++;
        }
    }
    
    public static void pop(){
        if (Vacia()) {
            System.out.println("Pila Vacia");
        }else{
            System.out.println("Dato a sacar: "+pila[n_Elementos-1]);
            n_Elementos--;
        }
    }
    
    public static void top(){
        if (Vacia()) {
            System.out.println("No hay dato a mostrar");
        }else{
            System.out.println("El ultimo dato es: "+pila[n_Elementos-1]);
        }
    }
}