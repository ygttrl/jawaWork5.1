package eCommerceDemo.entities.concretes;

import eCommerceDemo.entities.abstracts.Entity;

public class User implements Entity {
	
	private int id;
	private String ad;
	private String soyad;
	private String eposta;
	private String parola;
	
	public User() {}
	public User(String ad) {this.ad=ad;}

	public User(int id, String ad, String soyad, String eposta, String parola) {
		
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.eposta = eposta;
		this.parola = parola;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}
	
}
