
public class Alunos {
	
	// ----------------- ATRIBUTOS
	private int cpf;
	private String nome;
	private char sexo;
		
	
	// ----------------- MÉTODOS
	
		
	 public Alunos(int cpf, String nome) {
//		this.cpf = cpf;
		this.nome = nome;
		
		if(cpf < 10000 || cpf > 99999) { 
			
			System.out.println("O cpf deve conter apenas 5 dígitos!");
			} else {
				this.cpf = cpf;
			}
	 }
	 public Alunos(int cpf, String nome, char sexo) {
//		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo;
				
		if(cpf < 10000 || cpf > 99999) { 
					
			System.out.println("O cpf deve conter apenas 5 dígitos!");
			} else {
				this.cpf = cpf;
			}
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		//this.cpf = cpf;
		
		if(cpf < 10000 || cpf > 99999) { 
			
			System.out.println("O cpf deve conter apenas 5 dígitos!");
			} else {
				this.cpf = cpf;
			}
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	// --- MÉTODOS VARIADOS
	public void cumprimentar() {
		System.out.println("OI, sou o " + this.nome);
		
	}
	public void cumprimentar(String mensagem) {
		System.out.println(mensagem + " " + this.nome);
		
	}
	
	
	

}
