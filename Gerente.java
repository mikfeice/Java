
public class Gerente extends Alunos {
	
	public Gerente(int cpf, String nome) {
		super(cpf, nome);
	}

	public Gerente(int cpf, String nome, char sexo) {
		super(cpf, nome, sexo);
	}
	
	//sobreposi��o (override) do m�todo cumprimentar
	
	public void cumprimentar() {
		System.out.println("oi, sou o gerente " + this.getNome());
	}
}
