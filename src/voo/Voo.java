package voo;
import java.util.Date;
import java.util.Timer;

public class Voo {

	
	private Date data;
	private Timer horario;
	private int aeroporto_origem;
	private int aeroporto_destino;
	private int disponivel;
	
	public Voo(Date data, Timer horario, int aeroporto_origem, int aeroporto_destino, int disponivel) {
		super();
		this.data = data;
		this.horario = horario;
		this.aeroporto_origem = aeroporto_origem;
		this.aeroporto_destino = aeroporto_destino;
		this.disponivel = disponivel;
	}
	 
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Timer getHorario() {
		return horario;
	}
	public void setHorario(Timer horario) {
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
