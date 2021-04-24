package com.ggeteam.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizza")
public class Pizza {
   
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
   
  @Column(name = "sabor")
  private String sabor;
  
  @Column(name = "tamanho")
  private char tamanho;
  
  @Column(name = "preco")
  private float preco;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}


	
	
	
}
