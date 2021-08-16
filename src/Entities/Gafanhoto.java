package Entities;

public class Gafanhoto extends Pessoa  {
private String Login="Teste";
private int totalAssistido=0;
public Gafanhoto() {
	super();
}
public Gafanhoto(String nome,  char sexo,  String login) {
	super(nome, sexo);
	Login = login;
	
}

public String getLogin() {
	return Login;
}
public void setLogin(String login) {
	Login = login;
}

 
 
 public int getTotalAssistido() {
	return totalAssistido;
}
public void setTotalAssistido(int totalAssistido) {
	this.totalAssistido = totalAssistido;
}
public void viuMaisUm() {
	 
 }
@Override
public String toString() {
	return "Gafanhoto [Login=" + Login + ", totAssistido=" + getTotalAssistido() 
			+ ", Nome()=" + getNome() + ", Idade()=" + getIdade();
			
}
 
 
 
 
 
 
}
