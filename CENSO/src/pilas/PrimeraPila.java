/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilas;

/**
 *
 * @author maria
 */
class PrimeraPila {
    int tope= -1, maximo, npar=0, nimpar=0;
    //int[] vector = new int[maximo];
    public void generar(int cantidadElementos, int totalPila, int[] vectorElementos){
        maximo= totalPila;
        for (int i = 0; i < cantidadElementos; i++) {
            tope++;
            vectorElementos[tope] = (int) Math.floor(Math.random()*100);
            if (vectorElementos[tope]%2==0) {
                npar++;
            }
            else{
                nimpar++;
            }
        }
    }
    public void imprimir(int[] vectorImpresion){
        System.out.println("Elementos que están en la pila");
        for (int i = 0; i < tope; i++) {
            System.out.println("Posición: "+i+" con valor: "+vectorImpresion[i]);
        }
        System.out.println("El tope de la pila es: "+tope+" "
                + "El maximo de la pila es: "+maximo);
    }
    public void mostrar(){
        System.out.println("El número de elementos pares son: "+npar);
        System.out.println("El número de elementos impares son: "+nimpar);
    }   
    public int buscar(int[] vectorImpresion, int elemento){
        int resultadoBusqueda = -1;//posición 0 o que no se encontró la posición
        //recorremos el vector inicial
        for (int i = 0; i < vectorImpresion.length; i++) {
            //buscar el elemento en el vector y salir del for con el break, cuando lo encuentre
            if (vectorImpresion[i]== elemento) {
                resultadoBusqueda = i;
                break;
            }
        }
        return resultadoBusqueda;
    }
    public void actualizar(int[] vectorImpresion, int elemento, int nuevoElemento){
        int resultadoBusqueda = buscar(vectorImpresion, elemento);
        if (resultadoBusqueda>0) {
            vectorImpresion[resultadoBusqueda]= nuevoElemento;
        }
        imprimir(vectorImpresion);
    }
    
    public int[] eliminar(int[] vectorImpresion, int elemento){
        int resultadoBusqueda = buscar(vectorImpresion, elemento);
        int[] newVector = new int[vectorImpresion.length];
        
        if (resultadoBusqueda>0) {
            for (int i = 0; i < vectorImpresion.length; i++) {
                if (i!=resultadoBusqueda) {
                    newVector[i]= vectorImpresion[i];
                }
            }
        }
        return newVector;
    }
    public int[] insertar(int[] vectorImpresion, int elemento){
        int[] newVector = new int[vectorImpresion.length];
        for (int i = 0; i < vectorImpresion.length; i++) {
            newVector[i]= vectorImpresion[i]+1;
        }
        return newVector;
    }
   
}
