import java.util.Scanner;

public class Pessoas {

	public static void main(String[] args) {
		
//		Alunos Michael = new Alunos();
//		
////		Michael.cpf = 48764;
//		
//	//	Michael.nome = "Michael";
//		
//		Alunos Dudu = new Alunos();
//		
////		Dudu.cpf = 48461003;
//		
////		System.out.println(Michael.cpf);
////		System.out.println(Dudu.cpf);
////		
////		Michael.imprimir();
////		Dudu.imprimir();
//		
//		Professores Poo = new Professores();
//		
//		Poo.materia = "dificíl";
//		
////		System.out.println(Poo.materia);
////		Poo.inteligente();
////		Poo.ensinar();
//		
//		Michael.imprimir();
//		System.out.println( " tem uma aula " + Poo.materia);
		
		
//		Interface obj1 = new Interface();
//		
//		obj1.cumprimentar();
//		
//		Interface obj2 = new Interface();
//		
//		obj2.cumprimentar();
//		
//		Interface obj3 = new Interface();
//		
//		int resultado = obj3.somar(10, 20);
//		obj3.Imprimir(Integer.toString(resultado));
//		
//		String mensagem = obj3.entrada();
//		obj3.Imprimir(mensagem);
//		
		Interface obj = new Interface("oi");
//		
////		obj.Imprimir("OI");
//
//		obj.Imprimir(obj.entrada());
//		
//		Interface obj4 = new Interface("olá");
//		obj4.cumprimentar();
		
		Carro carro1 = new Carro("amarelo", "4 rodas");
		
		obj.Imprimir(carro1.cor);
		
		
	}

}
