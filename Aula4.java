
public class Aula4 {

	public static void main(String[] args) {
		
		Alunos p1 = new Alunos(45896, "Michael", 'M');
		Alunos p2 = new Alunos(64626, "Paulo");
			
		System.out.println("o cpf do " + p1.getNome() + " é: " + p1.getCpf() + ", Sexo: " + p1.getSexo());
		
		p1.setCpf(48760);
		p1.setNome("Dudu");
		
		System.out.println("o cpf do " + p1.getNome() + " é: " + p1.getCpf() + ", Sexo: " + p1.getSexo());
		
		p1.cumprimentar();
		p2.cumprimentar("E aí, tudo bem?");
	}
	

}
