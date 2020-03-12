
public class Gerente extends Alunos {
	
	public Gerente(int cpf, String nome) {
		super(cpf, nome);
	}

	public Gerente(int cpf, String nome, char sexo) {
		super(cpf, nome, sexo);
	}
	
	//sobreposição (override) do método cumprimentar
	
	public void cumprimentar() {
		System.out.println("oi, sou o gerente " + this.getNome());
	}
}
