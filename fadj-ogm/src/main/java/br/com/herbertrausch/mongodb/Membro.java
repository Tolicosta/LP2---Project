package br.com.herbertrausch.rest;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Document
public class Membro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private String nome;
	private String telefone;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private int qtdMembros;
	private int tipo;


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getQtdMembros() {
		return qtdMembros;
	}
	public void setQtdMembros(int qtdMembros) {
		this.qtdMembros = qtdMembros;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	private Usuario usuario;

	@Override
	public String toString() {
		return "Membro [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco +  ", bairro=" + bairro +  ", cidade=" + cidade +  ",estado=" + estado +  ", cep=" + cep +  ", tipo=" + tipo + ", qtdMembros=" + qtdMembros +  "]";
	}
}