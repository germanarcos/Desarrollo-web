import java.util.Scanner;

public class H1_Ej13 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int nums_to_sum;
		int result = 0;
		
			
			System.out.println("Introduce la cantidad de n�meros naturales a sumar");
			nums_to_sum = keyboard.nextInt();
			
			
			
				System.out.println("Lista de n�meros a sumar:\n");
				
				for (int naturals = 1; naturals <= nums_to_sum; naturals++) {
					System.out.print(naturals);
					
					if (naturals < nums_to_sum) {
						System.out.print(", ");
					}
					
					result += naturals;
				}
				
					System.out.println("\n\nLa suma es: " + result);
	}
}

/*
Proceso H1_Ej13
	Definir naturals, nums_to_sum, result Como Entero;
	
		result <- 0;
	
	
		Escribir "Lista de n�meros a sumar: ";
		Leer nums_to_sum;
		
		
			Escribir "Lista de n�meros a sumar:";
			Escribir "";
			
				Para naturals<-1 Hasta nums_to_sum Con Paso 1 Hacer
					Escribir "  ", naturals;
					
					
					result <- result + naturals;
				FinPara
				
					Escribir "";
					Escribir "";
					Escribir "La suma es: ", result;
FinProceso
 */
