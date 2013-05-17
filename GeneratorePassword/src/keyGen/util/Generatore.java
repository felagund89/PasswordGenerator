package keyGen.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Generatore {

	private Long numero;

	private String parola;

	private String carattereSpeciale;

	private String[] caratteriSpeciali = { "?", "!", "%", "@", "*" };

	private ArrayList<String> paroleDelFile = new ArrayList<String>(0);

	private String password;

	public Generatore(File nomeFile) throws IOException {
		loadDati(nomeFile);
		generatorePassword();

	}

	private void generatorePassword() {

		int x = (int) (Math.random() * paroleDelFile.size());
		int y = (int) (Math.random() * caratteriSpeciali.length);

		numero = (long) ((Math.random() * 99) + 10);
		carattereSpeciale = caratteriSpeciali[y];
		parola = paroleDelFile.get(x);

		password = parola + numero.toString() + carattereSpeciale;

	}

	public void loadDati(File nomeFile) throws IOException {

		FileReader fileReader = new FileReader(nomeFile);
		BufferedReader fileBufereReader = new BufferedReader(fileReader);

		String s = fileBufereReader.readLine();

		while (s != null) {
			if (s != "WORDS" && s != "FINE") {
				paroleDelFile.add(s);
				s = fileBufereReader.readLine();
			}
		}

	}

	/**
	 * @return the numero
	 */
	public Long getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(Long numero) {
		this.numero = numero;
	}

	/**
	 * @return the parola
	 */
	public String getParola() {
		return parola;
	}

	/**
	 * @param parola
	 *            the parola to set
	 */
	public void setParola(String parola) {
		this.parola = parola;
	}

	/**
	 * @return the carattereSpeciale
	 */
	public String getCarattereSpeciale() {
		return carattereSpeciale;
	}

	/**
	 * @param carattereSpeciale
	 *            the carattereSpeciale to set
	 */
	public void setCarattereSpeciale(String carattereSpeciale) {
		this.carattereSpeciale = carattereSpeciale;
	}

	/**
	 * @return the caratteriSpeciali
	 */
	public String[] getCaratteriSpeciali() {
		return caratteriSpeciali;
	}

	/**
	 * @param caratteriSpeciali
	 *            the caratteriSpeciali to set
	 */
	public void setCaratteriSpeciali(String[] caratteriSpeciali) {
		this.caratteriSpeciali = caratteriSpeciali;
	}

	/**
	 * @return the paroleDelFile
	 */
	public ArrayList<String> getParoleDelFile() {
		return paroleDelFile;
	}

	/**
	 * @param paroleDelFile
	 *            the paroleDelFile to set
	 */
	public void setParoleDelFile(ArrayList<String> paroleDelFile) {
		this.paroleDelFile = paroleDelFile;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
