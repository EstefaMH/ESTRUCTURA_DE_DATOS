/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo;

import java.util.Scanner;

/**
 *
 * @author Janus
 */
public class CENSO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("CENSO NACIONAL");
        
        System.out.println("Cuantas familias desea ingresar : ");
        int num_fam = sc.nextInt();
        
         int[] familia = new int[num_fam];
         int[] agua = new int[num_fam];
         int[] luz = new int[num_fam];
         int[] gas = new int[num_fam];
         
        for(int i=0; i<num_fam; i++){
            
            
           
            System.out.println("Ingrese su estrato : ");
            familia[i]= sc.nextInt();
            
             if(familia[i]<1 || familia[i]>3 ){
                
                 System.out.println("Ingrese su estrato : ");
                familia[i]= sc.nextInt();
             }
            
            System.out.println("Ingrese el valor del agua");
            agua[i]= sc.nextInt();
            
            System.out.println("Ingrese el valor de la luz");
            luz[i]= sc.nextInt();
            
            System.out.println("Ingrese el valor del gas: ");
            gas[i]= sc.nextInt();
            
        }
        
        for(int i=0; i<num_fam; i++){
            int gas_discriminado=0;
            int luz_discriminado=0;
            int agua_discriminado=0;
            
            switch(familia[i]){
                
                case 1 :
                    gas_discriminado= gas[i]-(gas[i]*20)/100;
                    luz_discriminado=luz[i]-(luz[i]*20)/100;
                    agua_discriminado=agua[i]-(agua[i]*20)/100;
                    
                    break;
                
                case 2 :
                    
                    gas_discriminado= gas[i]-(gas[i]*15)/100;
                    luz_discriminado=luz[i]-(luz[i]*15)/100;
                    agua_discriminado=agua[i]-(agua[i]*15)/100;
                    
                    break;
                    
                case 3:
                    gas_discriminado= gas[i]-(gas[i]*9)/100;
                    luz_discriminado=luz[i]-(luz[i]*9)/100;
                    agua_discriminado=agua[i]-(agua[i]*9)/100;
                    
                    break;
                    
                    
            }
        
            System.out.println("\nFAMILIA " + (i+1) +"\n"+ "Estrato : "+familia[i]+"\nGAS: "+gas_discriminado+"\nLUZ: "+ luz_discriminado+"\nAGUA: "+agua_discriminado+"\n");
        
        }
         
        
    
  
    }
 
}
