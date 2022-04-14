/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.mycompany.pilas.Pilas;
import java.util.Scanner;

/**
 *
 * @author Janus
 */
public class main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO ");
        System.out.println("MENU");
        System.out.println("1. CENSO");
        System.out.println("2. PILAS");
        
        int opc = sc.nextInt();
        
        if(opc==1){
            CENSO censo = new CENSO();
            censo.censo();  
        }else
            if(opc==2){
                Pilas pilas = new Pilas();
                //PILAS pilas = new PILAS();
                Pilas.main(args);
                //pilas.pila();
            }
        
    
        }  
    
   
 
    
}
