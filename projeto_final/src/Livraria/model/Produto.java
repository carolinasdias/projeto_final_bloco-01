package Livraria.model;

public abstract class Produto {
	int tipo, id;
	String nome;
	float preco;
	
	public Produto(int id, int tipo, String nome, float preco) {
		super();
		
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {
		String tipo = "";
		
		
	}
}

