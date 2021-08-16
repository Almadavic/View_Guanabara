package Entities;

import Error.Personalizado;
import Services.Video;

public class Visualização  {
Video video;
Gafanhoto gafanhoto;
public Visualização(Gafanhoto gafanhoto,Video video) {
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
	video.setAvaliação(5);
}

public void avaliar(int nota) throws Personalizado {
if (nota<0 || nota>5) {
	throw new Personalizado("Avalie entre 0 e 5");
} else {
	video.setAvaliação(nota);
}
}
public void avaliar(double porc) throws Personalizado {
	if (porc<20) {
		video.setAvaliação(2);
	}else if (porc>20 && porc<40) {
		video.setAvaliação(3);
	} else if (porc>40 && porc<70) {
		video.setAvaliação(4);
	} else if (porc>70 && porc<100){
		video.setAvaliação(5);
	}
	else {
		throw new Personalizado("Porcentagem Inválida");
	}
}

}
