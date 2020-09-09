import java.util.Locale;
import java.util.Scanner;

public class TesteLogica {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String aluno1, aluno2;
		Double np1, np2, media1, media2;
		
		System.out.print("Digite o nome do aluno: ");
		aluno1 = sc.nextLine();
		
		System.out.print("Digite a nota da np1: ");
		np1 = sc.nextDouble();
		
		System.out.print("Digite a nota da np2: ");
		np2 = sc.nextDouble();
		
		media1 = (np1 + np2) / 2;
		
		sc.nextLine();
		System.out.print("Digite o nome do aluno: ");
		aluno2 = sc.nextLine();
		
		System.out.print("Digite a nota da np1: ");
		np1 = sc.nextDouble();
		
		System.out.print("Digite a nota da np2: ");
		np2 = sc.nextDouble();
		
		media2 = (np1 + np2) / 2;
		
		if(media1 >= 6.0) {
			System.out.println(aluno1);
			System.out.println("Aprovado!");
		} else {
			System.out.println(aluno1);
			System.out.println("Reprovado!");
		}
		
		if(media2 >= 6.0) {
			System.out.println(aluno2);
			System.out.println("Aprovado!");
		} else {
			System.out.println(aluno2);
			System.out.println("Reprovado!");
		}
		
		sc.close();
	}

}
