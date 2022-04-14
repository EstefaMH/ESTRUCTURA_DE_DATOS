/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pilas;

import java.util.Arrays;
import java.util.Scanner;
//import static sun.net.www.http.HttpClient.New;

/**
 *
 * @author maria
 */
public class Pilas {

    public static void main(String[] args) {
        System.out.println("*********Ejercicio de pilas**********");
        PrimeraPila pila1 = new PrimeraPila();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int maximoVector = teclado.nextInt();
        System.out.println("Ingrese la cantidad de elementos a ingresar");
        int cantElementos = teclado.nextInt();
        if (cantElementos<= maximoVector){
            int[] vector = new int[maximoVector];
            pila1.generar(cantElementos, cantElementos, vector);
            pila1.imprimir(vector);
            //pila1.mostrar();
            
            System.out.println("Ingrese el elemento a insertar");
            int elementoInsertar = teclado.nextInt();
            int[] elementoInsertado = pila1.eliminar(vector, elementoInsertar);
            System.out.println(Arrays.toString(elementoInsertado));
            
            System.out.println("Ingrese el elemento a buscar");
            int elementoBuscar = teclado.nextInt();
            int resultadoBusqueda = pila1.buscar(vector, elementoBuscar);
            System.out.println("El resultado de la busqueda por elemento es "+ resultadoBusqueda);
            
            System.out.println("Ingrese el elemento a buscar para realizar la actualización");
            elementoBuscar = teclado.nextInt();
            System.out.println("Ingrese el nuevo valor para el elemento: "+elementoBuscar);
            int elementoActualizar = teclado.nextInt();
            pila1.actualizar(vector, elementoBuscar, elementoActualizar);
            
            System.out.println("Ingrese el elemento a eliminar");
            int elementoEliminar = teclado.nextInt();
            int[] elementoEliminado = pila1.eliminar(vector, elementoEliminar);
            System.out.println(Arrays.toString(elementoEliminado));
            
            /*System.out.println("Ingrese el elemento a insertar");
            int elementoInsertar = teclado.nextInt();
            int[] elementoInsertado = pila1.eliminar(vector, elementoInsertar);
            System.out.println(Arrays.toString(elementoInsertado));*/

        }
        else{
            System.out.println("El vector no puede ser menor que la cantidad de elementos"
                    + "a guardar");
        }
    }
}
