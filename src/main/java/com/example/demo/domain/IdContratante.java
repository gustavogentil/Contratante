package com.example.demo.domain;

public enum IdContratante {
	
	id_contratante(1, "Rafael Campos");

	
	private int id;
	private String descricao;
	
	private IdContratante(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getId() {
		return id;
	}
	
	
	public static IdContratante toEnum(Integer id) {
		if(id == null) {
			return null;
		}
			
		for(IdContratante x : IdContratante.values()) {
			if(id.equals(id)) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + id);
	}
}

