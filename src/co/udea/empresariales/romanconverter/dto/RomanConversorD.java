package co.udea.empresariales.romanconverter.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class RomanConversorD implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3919970497008509586L;
	
	
	private String romanNumber;
	
	
	public RomanConversorD() {
		super();
	}

	public RomanConversorD(String romanNumber) {
		this.romanNumber = romanNumber;
	}
	
	public String getRomanNumber() {
		return romanNumber;
	}

	public void setRomanNumber(String romanNumber) {
		this.romanNumber = romanNumber;
	}

}
