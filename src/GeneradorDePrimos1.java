/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Margarita Delgado
 */
public class GeneradorDePrimos1 {
    private static boolean esPrimo[]; private static int primos[];

public static int[] generarPrimos (int max)
{
if (max < 2) {  return new int[0];
} else {
inicializarCandidatos(max); eliminarMultiplos(); obtenerCandidatosNoEliminados(); return primos;
}
}

private static void inicializarCandidatos (int max)
{
int i;
esPrimo = new boolean[max+1];
esPrimo[0] = esPrimo[1] = false; for (i=2; i<esPrimo.length; i++)
esPrimo[i] = true;
}

    private static void eliminarMultiplos() {
        int i;
for (i=2; i<maxFactor(); i++) if (esPrimo[i])
eliminarMultiplosDe(i);
}

private static int maxFactor ()
{
return (int) Math.sqrt(esPrimo.length) + 1;
}

private static void eliminarMultiplosDe (int i)
{
int multiplo;
for ( multiplo=2*i;
multiplo<esPrimo.length; multiplo+=i)
esPrimo[multiplo] = false;
 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void obtenerCandidatosNoEliminados() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
