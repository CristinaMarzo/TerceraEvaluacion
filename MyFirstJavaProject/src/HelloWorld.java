//import java.util.Scanner;  // Import the Scanner class

public class HelloWorld {

	public static void main(String[] args) {
		
		byte cont;
		byte numero=5;
		System.out.println("Bienvenido al programa para calcular las tablas de multiplicar.");
		System.out.println("Introduzca el numero deseado: ");
		//Scanner scanner = new Scanner(System.in); //esto seria un cin de c++

		System.out.println("Hola, mundo");
		for (cont=0; cont<=10; cont++){
			System.out.print(cont);
			System.out.print(" X ");
			System.out.print(numero);
			System.out.print(" = ");
			System.out.println(cont*numero);
		
		}
	}

}
