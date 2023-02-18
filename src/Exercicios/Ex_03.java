package Exercicios;

public class Ex_03 {

	public Ex_03() {
		super();
	}
	
	
	public static void main(String[] args) {
		
		int [] vetor = {1, 16, 7, 9, 22, 33, 53, 28};
		int i = vetor.length;
		
		int resposta = quantPares(vetor, i);
		System.out.println("QUANTIDADE DE PARES: " +resposta);

	}
	
	public static int quantPares(int[] vetor, int i) {
		
		int cont=0;
		
		if (i == 0) {
			return 0;
		}
		else {
			
			if(vetor[i-1] % 2 == 0) {
				 cont = cont + 1;
				 System.out.println(vetor[i-1]+ "É PAR");
			}
			

			i = i - 1;
			return cont + quantPares (vetor, i);
			
			
		}
		
		
	}

}
