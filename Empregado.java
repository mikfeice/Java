
public class Empregado extends Alunos {
	
	private int codigo;
	
	Empregado(int cpf, String nome){
		super(cpf, nome);
	}
	
	public Empregado(int cpf, String nome, char sexo) {
		super(cpf, nome, sexo);
	}
	
	public void Trabalhar() {
		System.out.println("estou trabalhando");
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void cumprimentar() {
		System.out.println("oi, sou o empregado " + this.getNome());
	}
	
}
