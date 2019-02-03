/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioob3;
import java.util.*;
/**
 *
 * @author Milzork
 */
public class EjercicioOb3 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        // pide los datos al usuario
        for(int i = 0; i < 10; ++i) 
        {
            System.out.print("Introduce elemento " + (i+1) + ": ");
            int valor = sc.nextInt();
            a[i] = valor;
        }


        // muestra array, rellenando con espacios para que coincida el índice con el elemento (hasta números de tres cifras)
        System.out.println("El array es:");
        for(int i = 0; i < 10; ++i) 
        {
            System.out.print(i + " ");
            if(i < 100) System.out.print(" ");
            if(i < 10) System.out.print(" ");
        }
        
        System.out.println("");
        
        for(int i = 0; i < 10; ++i) 
        {
            System.out.print(a[i] + " ");
            if(a[i] < 100) System.out.print(" ");
            if(a[i] < 10) System.out.print(" ");
        }
        
        System.out.println("");
        
        System.out.println("");
        
        System.out.println("");


        // acumula los primos al principio del array
        int n = 0;
        
        for(int i = 0; i < 10; ++i) 
        {
            // determina si el elemento es primo. Que alguien me salve T.T
            int posiblePrimo = a[i];
             boolean esPrimo = true;
            for(int f = 2; f <= posiblePrimo / 2; ++f) {
                if((posiblePrimo % f)==0) {
                    esPrimo = false;
                    break;
                }
            }

            //si es primo, se intercambia con la posición "0n" e incrementa "n"
            if(esPrimo) 
            {
                int temp = a[n];
                a[n] = posiblePrimo;
                a[i] = temp;
                ++n;
            }
        }

        // muestra el array otra vez pero con los primos
        System.out.println("El array con los primos primero es:");
        
        for(int i = 0; i < 10; ++i) {
            System.out.print(i + " ");
            if(i < 100) System.out.print(" ");
            if(i < 10) System.out.print(" ");
        }
        
        System.out.println("");
        
        for(int i = 0; i < 10; ++i) {
            System.out.print(a[i] + " ");
            if(a[i] < 100) System.out.print(" ");
            if(a[i] < 10) System.out.print(" ");
        }
        System.out.println("");
      

    }
    }
