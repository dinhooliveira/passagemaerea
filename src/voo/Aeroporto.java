package voo;

public class Aeroporto {

	private int id;
	private String nome;
	private String cidade;
	
	public Aeroporto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Aeroporto(int id, String nome, String cidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
