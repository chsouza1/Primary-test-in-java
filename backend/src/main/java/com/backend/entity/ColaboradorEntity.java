package com.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "COLABORADOR")
public class ColaboradorEntity {
	@Id
	@Column(name="ID")
	Integer id;
	
	@Column(name="NOME")
	String none;
	
	@Column(name="SENHA")
	String senha;
	
	@Column(name="SCORE")
	Integer score;
	
	@ManyToOne
	@JoinColumn(name="ID_CHEFE")
	ColaboradorEntity chefe;

}
