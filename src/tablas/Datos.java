package tablas;
// Generated 22-dic-2018 12:55:59 by Hibernate Tools 5.1.0.Alpha1

/**
 * Datos generated by hbm2java
 */
public class Datos implements java.io.Serializable {

	private Integer id;
	private String arma;
	private String raza;

	public Datos() {
	}

	public Datos(String arma, String raza) {
		this.arma = arma;
		this.raza = raza;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArma() {
		return this.arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public String getRaza() {
		return this.raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

}