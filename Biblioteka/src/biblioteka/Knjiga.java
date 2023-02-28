package biblioteka;

import java.util.List;

public class Knjiga {

	private String naslov;
	private long isbn;
	private List<Autor> autori;
	private String izadavac;
	private int izdanje;
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public List<Autor> getAutori() {
		return autori;
	}
	public void setAutori(List<Autor> autori) {
		this.autori = autori;
	}
	public String getIzadavac() {
		return izadavac;
	}
	public void setIzadavac(String izadavac) {
		this.izadavac = izadavac;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	
	
}
