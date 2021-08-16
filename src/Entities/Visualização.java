package Entities;

import Error.Personalizado;
import Services.Video;

public class Visualiza��o  {
Video video;
Gafanhoto gafanhoto;
public Visualiza��o(Gafanhoto gafanhoto,Video video) {
	this.video = video;
	this.gafanhoto = gafanhoto;
	ValidationTime();
	ValidationView();
}



public void ValidationTime() {
	
	 gafanhoto.setTotalAssistido(gafanhoto.getTotalAssistido()+1);
}

public void ValidationView() {
	video.setViews(video.getViews()+1);
}


@Override
public String toString() {
	return video.toString()+"\n"+gafanhoto.toString();
}

public void avaliar() {
	video.setAvalia��o(5);
}

public void avaliar(int nota) throws Personalizado {
if (nota<0 || nota>5) {
	throw new Personalizado("Avalie entre 0 e 5");
} else {
	video.setAvalia��o(nota);
}
}
public void avaliar(double porc) throws Personalizado {
	if (porc<20) {
		video.setAvalia��o(2);
	}else if (porc>20 && porc<40) {
		video.setAvalia��o(3);
	} else if (porc>40 && porc<70) {
		video.setAvalia��o(4);
	} else if (porc>70 && porc<100){
		video.setAvalia��o(5);
	}
	else {
		throw new Personalizado("Porcentagem Inv�lida");
	}
}

}
