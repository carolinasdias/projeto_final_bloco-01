package Livraria.repository;

import Livraria.model.Produto;

public interface LivrariaRepository {
	public void cadastrarProduto(Produto produto);
	public void listarTodosOsLivros();
	public void consultarLivrosPorId(int id);
	public void atualizarLivros(Produto produto);
	public void deletarLivro(int id);
	

}
