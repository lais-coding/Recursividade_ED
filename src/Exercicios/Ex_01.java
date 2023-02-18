package Exercicios;

public class Ex_01 {

	public Ex_01() {
		super();
	}

	public static void main(String[] args) {
			
		int A = 2;
		int B = 3;
		int resultado = Somar(A, B);
		

		System.out.println("Resultado == " + resultado);
		}

	// FUNÇÃO

	public static int Somar(int A, int B) {


	if (B == 1) {
			return A;
		} else {
			B = B - 1;
			return A + Somar(A, B);
		}

	}

}
