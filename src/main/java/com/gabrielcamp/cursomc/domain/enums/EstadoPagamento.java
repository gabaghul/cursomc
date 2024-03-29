package com.gabrielcamp.cursomc.domain.enums;

public enum EstadoPagamento {
	PENDENTE(1, "Pagamento Pendente"),
	QUITADO(2, "Pagamento Quitado"),
	CANCELADO(3, "Pagamento Cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento() {

	}

	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		if(cod == null) return null;
		
		for(EstadoPagamento pgto : EstadoPagamento.values()) {
			if(cod.equals(pgto.getCod())) return pgto;
		}
		
		throw new IllegalArgumentException("Id Inválido: " + cod);
	}	
	
	
}
