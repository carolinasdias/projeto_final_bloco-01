package Livraria.model;

public class Livro extends Produto{
	private String autor;

	public Livro(int id, int tipo, String nome, float preco, String autor) {
		super(id, tipo, nome, preco);
		this.setAutor(autor);
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Autor: " + this.autor);
	}

}
