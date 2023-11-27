package Livraria.model;

public class Ebook extends Produto {
	private String formato;
	private String setFormato;

	public Ebook(int id, int tipo, String nome, float preco, String formato) {
		super(id, tipo, nome, preco);
		this.setFormato = formato;
		
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

}
