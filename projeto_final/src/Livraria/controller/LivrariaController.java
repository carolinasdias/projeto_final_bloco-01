package Livraria.controller;

import java.util.ArrayList;
import java.util.Optional;

import Livraria.model.Produto;
import Livraria.repository.LivrariaRepository;

public class LivrariaController implements LivrariaRepository{

	private ArrayList<Produto> listaLivros = new ArrayList<Produto>();
	
	int numero = 0;
	
	@Override
	public void consultarLivrosPorId(int id) {
		
		Optional<Produto> produto = buscarNaCollection(id);
		
		if (produto.isPresent())
			produto.get().visualizar();
		else
			System.out.println("O Livro" + id + "não foi encontrado!");
		
	}

	@Override
	public void listarTodosOsLivros() {
			for(var produto : listaLivros) {
			produto.visualizar();
	}
	}
			@Override
			public void cadastrarProduto(Produto produto) {
				listaLivros.add(produto);
				System.out.println("O Livro " + produto.getId() + "foi cadastrado com sucesso!");
			
			
		}
			@Override
			public void atualizarLivros (Produto produto) {
				Optional<Produto> buscaLivro = buscarNaCollection(produto.getId());
				
				if (buscaLivro.isPresent()) {
					listaLivros.set(listaLivros.indexOf(buscaLivro.get()), produto);
					System.out.println("O livro" + produto.getId() + "foi atualizado com sucesso!");
	
				}else
					System.out.println("O livro " + produto.getId() + "não foi encontrado!");
			}
			
			
				
		public int gerarId() {
			int id = 0;
			return ++ id;
		}

		public Optional<Produto> buscarNaCollection(int id) {

			for (var produto : listaLivros) {
				if (produto.getId() == id)
					return Optional.of(produto);
			}

			return Optional.empty();
		}

		@Override
		public void deletarLivro(int id) {
			// TODO Auto-generated method stub
			
		}
	}
