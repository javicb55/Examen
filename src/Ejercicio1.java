/** Documentacion  del examen
-@author Javier
-@version 1.0
*/

//programa que imprime 3 numeros
// el primero indica el valor en el que empieza
// el segundo el incremento que se le va hacer
// el tercero el numero de columnas a mostrar
import java.util.Scanner;


public class Ejercicio1
{
	public static void main(String[] arg)
	{
		System.out.println("Inserte numero en el que empieza");
		Scanner in = new Scanner(System.in);
		int iniciador = in.nextInt();
		System.out.println("Inserte el incremento");
		int incremento = in.nextInt();
		System.out.println("Indique el número de columnas"); // se como dividir en columnas.
		int numeroColumnas = in.nextInt();
		in.close();
		
	
		System.out.printf("Numero en el que empieza %d, numero del incremento %d, numero de columnas. %d%n",iniciador,incremento,numeroColumnas);
		if (numeroColumnas <= 0)
		System.out.println("No se puede mostrar, utilizaremos 2 columnas");
		
		
		
		
		int contador = 0;	
		
		while (contador <= 10)
		{
			iniciador += incremento;
			System.out.printf("%d%n",iniciador);
			contador ++;
		}
		
		
		
	}
	
	
	
		
	
}