package Services;

public class Video implements AcoesVideo {
  private String titulo="";
  private Integer avaliação=0;
  private Integer views=0;
	private boolean reproduzindo=false;


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAvaliação() {
		return avaliação;
	}

	public void setAvaliação(Integer avaliação) {
		this.avaliação = avaliação;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	public Video(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public void play() {
		
		
	}

	@Override
	public void pause() {
		
		
	}

	@Override
	public void like() {
		
		
	}













	@Override
	public String toString() {
		return "Video " + titulo + ", avaliação=" + avaliação + ", views=" + views + ", reproduzindo="
				+ reproduzindo + "]";
	}

	
	
	

}
