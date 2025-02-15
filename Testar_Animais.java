package animais;
import java.util.Scanner;
public class Testar_Animais {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner king = new Scanner(System.in)) {
			animal jojo = new animal(king.next(),king.nextFloat(),king.nextInt(),king.next(),king.next(),king.nextFloat());
			jojo.dados();
			peixe tubarão = new peixe(king.next(),king.nextFloat(),king.nextInt(),king.next(),king.next(),king.nextFloat(),king.next());
			tubarão.dados();
		}
	}

}
