package Entities;

public abstract class  Pessoa {
private String nome="";
private Integer idade=0;
private char sexo=0;
private String experiencia="";

Pessoa() {
	
}



public Pessoa(String nome, char sexo) {
	super();
	this.nome = nome;
	this.sexo = sexo;
}





public void ganharExp() {
	
}





public String getNome() {
	return nome;
}





public void setNome(String nome) {
	this.nome = nome;
}





public Integer getIdade() {
	return idade;
}





public void setIdade(Integer idade) {
	this.idade = idade;
}





public char getSexo() {
	return sexo;
}





public void setSexo(char sexo) {
	this.sexo = sexo;
}





public String getExperiencia() {
	return experiencia;
}





public void setExperiencia(String experiencia) {
	this.experiencia = experiencia;
}
	

}
