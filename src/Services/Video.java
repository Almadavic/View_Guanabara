package Services;

public class Video implements AcoesVideo {
  private String titulo="";
  private Integer avalia��o=0;
  private Integer views=0;
	private boolean reproduzindo=false;


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAvalia��o() {
		return avalia��o;
	}

	public void setAvalia��o(Integer avalia��o) {
		this.avalia��o = avalia��o;
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
		return "Video " + titulo + ", avalia��o=" + avalia��o + ", views=" + views + ", reproduzindo="
				+ reproduzindo + "]";
	}

	
	
	

}
