package Exercicios;

public class Ex_02 {


	public Ex_02() {
		super();
	}
	
	public static void main(String[] args) {
		

		int X = 25;
		int Y = 5;
		
		int resto = Div(X, Y);
		System.out.println("RESTO DA DIVISÃO == " +resto);
		
		
	}
	
	//FUNÇÃO
	
	//OBS: quando a contagem é impar não dá o resultado certo, quando é par dá certo
	
	
	public static int Div(int X, int Y) {
		
		if(X < Y) {
			return Y - X;
		}
			
		else {
			X = X - Y;
			return Y - Div(X, Y);
		}
	}

}
