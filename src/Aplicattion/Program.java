package Aplicattion;

import java.io.IOException;
import java.util.Scanner;

import Entities.Gafanhoto;
import Entities.Visualização;
import Error.Personalizado;
import Services.Video;

public class Program {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	//User
	System.out.println("Cadastro : ");
	System.out.print("Quantas contas deseja cadastrar  ? ");
	int account = sc.nextInt();
	Gafanhoto contas[] = new Gafanhoto[account];
	for (int i =0 ;i<contas.length;i++) {
		System.out.print("Digite o nome : ");
		String nome = sc.next();
		System.out.print("Digite o sexo : ");
		char sexo = sc.next().charAt(0);
	System.out.print("Digite o login : ");
	String login=sc.next();
		contas[i]=new Gafanhoto(nome,sexo,login);
	}
	//Videos Pré definidos.
	Video filme[] = new Video[3];
	filme[0]= new Video("JAVA");
	filme[1]= new Video("HTML");
	filme[2]= new Video("EUNI");
	try {
	Visualização view[] = new Visualização[4];
	view[0]= new Visualização(contas[0],filme[0]);
	view[0].avaliar(5);
	System.out.println(view[0]);
	view[1]= new Visualização(contas[0],filme[0]);
	System.out.println(view[1]);
	view[2] = new Visualização(contas[0],filme[0]);
	System.out.println(view[2]);
	
	}
	catch(Personalizado e) {
		System.out.println("Erro : "+e.getMessage());
	}
	
	
	
	}
	
}
