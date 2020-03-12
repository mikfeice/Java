import java.util.Scanner;

public class Interface {
	
	String mensagem;
	
	public Interface(String mensagem) {
		this.mensagem = mensagem;
	}
	public void cumprimentar() { //método sem parâmetros
		System.out.println(mensagem);
	}
	
	public void Imprimir(String mensagem) {
		System.out.println(mensagem);
	}
	
	public int somar (int a, int b) {
		return a + b;
	}
	
	public String entrada() {
		Scanner entr = new Scanner(System.in);
		
		return entr.nextLine();
		
	}

}
