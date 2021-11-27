import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Lista lista = new Lista();
		Scanner scan = new Scanner(System.in);
		Random gerar = new Random();
		int op = 1;
		System.out.println("Pressione ENTER para começar:");
		
		while (op==1) {
			scan.nextLine();
			System.out.println("Informe o nome do participante: ");
			lista.add(scan.nextLine());
			System.out.println("Deseja Cadastrar outro participante (1 - S/0 - N) ? ");
			op = scan.nextInt();
			if (op == 0 && (lista.getTamanho()%2 != 0)) {
				System.out.println("Números impares de participantes, adicione mais 1.");
				System.out.println();
				op = 1;
			}
			
		}
		int aux = 0;
		while(aux < lista.getTamanho()) {
			scan.nextLine();
			System.out.println("Informe seu nome: ");
			String nome = scan.nextLine();
			if (aux != 0) {
				System.out.println("Pressione [ENTER] para tirar o amigo ");
				scan.nextLine();
				
			}else {
				System.out.println("Pressione [ENTER] para tirar o amigo ");
				scan.nextLine();
			}
			
			String name = lista.get(gerar.nextInt(lista.getTamanho())).getNome();
			while (name.equals(nome)) {
				name = lista.get(gerar.nextInt(lista.getTamanho())).getNome();
			}
			System.out.println("Seu amigo é: " + name);
			lista.remover(name);
		}
		System.out.print("Todos os participantes sorteados. Programa finalizado.");
		
	}

}
