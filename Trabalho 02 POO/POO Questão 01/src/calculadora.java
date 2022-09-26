import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1, num2;
		char sinal;
		float resultado;
		
		System.out.print("Digite o primeiro numero: ");
		num1 = sc.nextFloat();
		System.out.print("Digite o segundo numero: ");
		num2 = sc.nextFloat();
		System.out.print("Digite o operador: ");
		sinal = sc.next().charAt(0);
		
		if(sinal == '+') {
			resultado = num1 + num2;
			System.out.println("A soma dos numeros e: " + resultado);
		}
		if(sinal == '-') {
			resultado = num1 - num2;
			System.out.println("A subtracao dos numeros e: " + resultado);
		}		
		if(sinal == '*') {
			resultado = num1 * num2;
			System.out.println("A multiplicacao dos numeros e: " + resultado);
		}
		if(sinal == '/') {
			resultado = num1 / num2;
			System.out.println("A divisão dos numeros e: " + resultado);
		}
		sc.close();

	}

}







