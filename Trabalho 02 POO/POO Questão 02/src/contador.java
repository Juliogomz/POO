import java.util.Scanner;

public class contador {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int i, qntd, array[], par = 0, impar = 0, positivo = 0, negativo = 0, neutro = 0;
			
			System.out.print("Digite a quantidade de numeros: ");
			qntd = sc.nextInt();
			
			array = new int[qntd];
			
			for(i = 0; i < array.length; i++) {
				System.out.format("Digite o numero %d: ", i + 1);
				array[i] = sc.nextInt();
				
				if(array[i] == 0) {
					neutro++;
				}else if(array[i] % 2 == 0) {
					par++;
				}else {
					impar++;
				}
				if(array[i] > 0) {
					positivo++;
				}else if (array[i] < 0){
					negativo++;
				}
			}
			
			System.out.println("Impares:" + impar +" Pares:" + par + " Neutros:" + neutro + " Positivos:" + positivo + " Negativos:" + negativo);
			sc.close();
		}

	}

}
