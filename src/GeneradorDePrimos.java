/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Margarita Delgado
 */
public class GeneradorDePrimos {
    private static int dim;
private static boolean esPrimo[]; private static int primos[];

public static int[] generarPrimos (int max)
{
if (max < 2) {
return new int[0];	// Vector vacío
} else {
inicializarCriba(max); cribar(); rellenarPrimos(); return primos;
}
}
 
private static void inicializarCriba (int max)
{
int i;
dim = max + 1;
esPrimo = new boolean[dim];
for (i=0; i<dim; i++) esPrimo[i] = true;
esPrimo[0] = esPrimo[1] = false;
}
private static void cribar ()
{
int i,j = 0;
for (i=2; i<Math.sqrt(dim)+1; i++) { if (esPrimo[i]) {
// Eliminar los múltiplos de i for (j=2*i; j<dim; j+=i)
esPrimo[j] = false;
}
}
}
private static void rellenarPrimos ()
{
int i, j, cuenta = 0;
// Contar primos cuenta = 0;
for (i=0; i<dim; i++) if (esPrimo[i])
cuenta++;
// Rellenar el vector de números primos primos = new int[cuenta];
for (i=0, j=0; i<dim; i++) if (esPrimo[i])
primos[j++] = i;
}  
}
