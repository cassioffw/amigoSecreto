public class Cadastro {
	private String nome;
	private Cadastro next;
	
	public Cadastro(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cadastro getNext() {
		return next;
	}
	public void setNext(Cadastro next) {
		this.next = next;
	}
}
