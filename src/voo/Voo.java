package voo;

public class Voo {

	private int id;
	private String data;
	private String horario;
	private String origem;
	private String destino;
	private int aeroporto_origem;
	private int aeroporto_destino;
	private int disponivel;

	public Voo() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Voo(String data, String horario, int aeroporto_origem, int aeroporto_destino, int disponivel) {
		super();
		this.data = data;
		this.horario = horario;
		this.aeroporto_origem = aeroporto_origem;
		this.aeroporto_destino = aeroporto_destino;
		this.disponivel = disponivel;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getAeroporto_origem() {
		return aeroporto_origem;
	}

	public void setAeroporto_origem(int aeroporto_origem) {
		this.aeroporto_origem = aeroporto_origem;
	}

	public int getAeroporto_destino() {
		return aeroporto_destino;
	}

	public void setAeroporto_destino(int aeroporto_destino) {
		this.aeroporto_destino = aeroporto_destino;
	}

	public int getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(int disponivel) {
		this.disponivel = disponivel;
	}

}
