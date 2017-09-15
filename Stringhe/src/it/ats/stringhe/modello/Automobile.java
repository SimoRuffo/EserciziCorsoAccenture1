package it.ats.stringhe.modello;

import java.util.Date;

public class Automobile {

	
	// indica il modello dell'automobile
	private String modello;
	// Inidica il colore dell'automobile
	private String colore;
	// Indica la marca dell'automobile
	private String marca;
	private String targa;

	// Indica la cilindrata dell'automobile
	private int cilindrata;
	
	// proprietà che memorizzerà la data di produzione dell'automobile
	private Date dataProduzione;
	
	// Chi guida l'automobile?? 
	private Persona autista;

	public Date getDataProduzione() {
		return dataProduzione;  // restituisce la dataProduzione
	}

	
	public Persona getAutista() {
		return autista;
	}


	public void setAutista(Persona autista) {
		this.autista = autista;
	}


	// Metodo costruttore che viene richiamato con new... 
	public Automobile( String marca, String modello, String colore, String targa,int cilindrata, Date dataProduzione) {
		this.cilindrata = cilindrata;
		this.modello = modello;
		this.colore = colore;
		this.marca = marca;
		this.targa = targa;
		this.dataProduzione = dataProduzione;
	}

	public int getCilindrata() {
		return cilindrata; // restituisce la cilindrata
	}

	public String getTarga() {
		return targa; // restituisce la targa
	}

	public void setTarga(String targa) {
		this.targa = targa; // Imposta la targa
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;  // Imposta la cilindrata
	}

	public String getModello() {
		return modello;  // Ritorna il modello 
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Automobile [cilindrata=" + cilindrata + ", modello=" + modello + ", colore=" + colore + ", marca="
				+ marca + ", targa=" + targa + ", dataProduzione=" + dataProduzione + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((targa == null) ? 0 : targa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automobile other = (Automobile) obj;
		if (targa == null) {
			if (other.targa != null)
				return false;
		} else if (!targa.equals(other.targa))
			return false;
		return true;
	}

}
