
public class Aula5 {

	public static void main(String[] args) {
		
		Empregado empregado1 = new Empregado(12658, "Michael", 'M');
		Gerente gerente1 = new Gerente(45600, "Pedro");
		
		empregado1.cumprimentar();
		//System.out.println(empregado1.getSexo());
		empregado1.Trabalhar();
		empregado1.setCodigo(111);
	    System.out.println("codigo: " + empregado1.getCodigo());
		
		gerente1.cumprimentar();
		System.out.println(gerente1.getCpf());

	}

}
