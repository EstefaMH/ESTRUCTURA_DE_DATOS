
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Janus
 */
public class PILAS {

    Scanner sc = new Scanner(System.in);
    Stack<Integer> pila = new Stack<Integer>();
    

    public void pila() {
        int opc =0;
        PILAS pila1 = new PILAS();
        
        do {
          

            System.out.println("---------------- PILA ------------------------");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    insert();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                default:
                    System.out.println("Error la opcion elegida no existe");
            }
           
            System.out.println("la pila actualizada : "+ pila +"top"+pila.peek());

            System.out.println("DESEA VOLVER AL MENU PRINCIPAL ? (1.SI  2.NO) ");
            opc = sc.nextInt();
        } while (opc == 1);
    }

  

    public Stack insert() {

        System.out.println("ingrese un nuevo elemento (numerico) ");
        int insertar = sc.nextInt();
        pila.push(insertar);
       

        return pila;    

    }

    public void update() {
        
    }

    public void delete() {
      
        pila.pop();
    }
    
    public void search() {
        System.out.println("Que elemento busca? ");
        int buscar = sc.nextInt();
        
        System.out.println("El elemento se encuentra en la posicion : "+ pila.search(buscar));
    }
    
}


/*
        
        System.out.println("Ingrese el tamano del vector");
            int maximoVector = sc.nextInt();
            System.out.println("Ingrese la cantidad de elementos a registrar");
            int canElementos = sc.nextInt();
            if (canElementos <= maximoVector) {
                int[] vector = new int[maximoVector];
            pila1.generar(canElementos, maximoVector, vector);
            pila1.imprimir(vector);
            pila1.mostrar();
               

                System.out.println("la pila es :" +pila+ insert() );
            } else {
                System.out.println("El vector no puede ser menor que la cantidad de elementos " + "a guardar");
            }

     int tope = 0, maximo, npar = 0, nimpar = 0;

    public void generar(int cantidadElementos, int totalPila, int[] vectorElementos) {

        maximo = totalPila;
        for (int i = 0; i < cantidadElementos; i++) {
            tope++;
            vectorElementos[tope] = (int) Math.floor(Math.random() * 100);
            if (vectorElementos[tope] % 2 == 0) {
                npar++;
            } else {
                nimpar++;
            }
            
            pila.push(vectorElementos[i]);
        }

    }
    
    
   public void imprimir (int [] vectorImpresion){
        System.out.println("Elementos que estan en la pila");
        for(int i=0; i<tope ; i++){
            System.out.println("Posicion "+i+"=> con valor: "+ vectorImpresion[i]);
        }
        
        System.out.println("El tope de la pila es " + tope+" "+"El maximo de la pila es " + maximo);
    }
    
    public void mostrar(){
        System.out.println("El numero de elementos pares son : "+ npar);
        System.out.println("El numero de elementos impares son : "+ nimpar);
    }

*/