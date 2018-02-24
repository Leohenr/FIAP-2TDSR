package be.com.fiap.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_BEBIDA")
@SequenceGenerator(name = "bebida", sequenceName = "SQ_TB_BEBIDA", allocationSize = 1)
public class Bebida implements Serializable {
	@Id
	@Column(name = "CD_BEBIDA")
	@GeneratedValue(generator = "bebida", strategy = GenerationType.SEQUENCE)
	private int cdBebida;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "DS_TIPO_BEBIDA")
	private TipoBebida tipo;
	
	@Column(name = "NM_BEBIDA", nullable = false, length = 50)
	private String nomeBebida;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_VALIDADE")
	private Calendar dataValidade;
	
	@Lob
	@Column(name="FL_ROTULO")
	private byte[] rotulo;
	
	@Column(name="FG_ALCOOLICO")
	private boolean alcoolico;

	public Bebida() {
		super();
	}

	public Bebida(TipoBebida tipo, String nomeBebida, Calendar dataValidade, byte[] rotulo, boolean alcoolico) {
		super();
		this.tipo = tipo;
		this.nomeBebida = nomeBebida;
		this.dataValidade = dataValidade;
		this.rotulo = rotulo;
		this.alcoolico = alcoolico;
	}

	public int getCdBebida() {
		return cdBebida;
	}


	public void setCdBebida(int cdBebida) {
		this.cdBebida = cdBebida;
	}


	public TipoBebida getTipo() {
		return tipo;
	}


	public void setTipo(TipoBebida tipo) {
		this.tipo = tipo;
	}


	public String getNomeBebida() {
		return nomeBebida;
	}


	public void setNomeBebida(String nomeBebida) {
		this.nomeBebida = nomeBebida;
	}


	public Calendar getDataValidade() {
		return dataValidade;
	}


	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}


	public byte[] getRotulo() {
		return rotulo;
	}


	public void setRotulo(byte[] rotulo) {
		this.rotulo = rotulo;
	}


	public boolean isAlcoolico() {
		return alcoolico;
	}


	public void setAlcoolico(boolean alcoolico) {
		this.alcoolico = alcoolico;
	}
	
	
	
}
