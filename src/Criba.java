/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Margarita Delgado
 */
public class Criba 
{
    public static int[] generarPrimos (int max)
    {
        int i,j;
        
        if (max >= 2){
            int dim= max + 1;
            boolean[] esPrimo = new boolean[dim];
            
            for(i=0; i<dim; i++)
                esPrimo[i] = true;
            
            esPrimo[0] = esPrimo[1] = false;
            
            //Criba
            for(i=2; i<Math.sqrt(dim)+1; i++){
                if(esPrimo[i]){
                    for(j=2*i; j<dim; j+=i)
                        esPrimo[j] = false;
                }
            }
            
            int cuenta = 0;
            
            for(i=0; i<dim; i++){
                if(esPrimo[i])
                    cuenta++;
            }
            int[] primos = new int[cuenta];
            
            for(i=0, j=0; i<dim; i++){
            if(esPrimo[i])
                primos[j++] = i;
        }
            return primos;
    } else {
            return new int[0];
        }  
 }
}
