public class Lista {
	private Cadastro primeiro;
	private Cadastro ultimo;
	private int tamanho;
	
	public Lista() {
		this.tamanho = 0;
	}
	public Cadastro getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Cadastro primeiro) {
		this.primeiro = primeiro;
	}
	public Cadastro getUltimo() {
		return ultimo;
	}
	public void setUltimo(Cadastro ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public void remover(String nome) {
		Cadastro anterior = null;
		Cadastro atual = this.primeiro;
			for (int i =0; i < this.getTamanho(); i++) {
				if (atual.getNome().equals(nome)) {
					if (this.getTamanho()==1) {
						this.primeiro= null;
						this.ultimo = null;
					}
					else if (atual == primeiro) {
						this.primeiro = atual.getNext();
						atual.setNext(null);
					}
					else if (atual == ultimo) {
						this.ultimo = anterior;
						anterior.setNext(null);
					}
					else {
						anterior.setNext(atual.getNext());
						atual = null;
					}
					this.tamanho--;
					break;
				}
				anterior = atual;
				atual = atual.getNext();
			}
	}
	public void add(String nome) {
		Cadastro cadastrar = new Cadastro(nome);
		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = cadastrar;
			this.ultimo = cadastrar;
		}
		else {
			this.ultimo.setNext(cadastrar);
			this.ultimo = cadastrar;
		}
		this.tamanho++;
	}
	public Cadastro get(int posicao) {
		Cadastro atual = this.primeiro;
		for (int i = 0; i< posicao; i++) {
			if (atual.getNext()!= null) { 
				atual = atual.getNext();
			}
		}
		return atual;
	}
}
