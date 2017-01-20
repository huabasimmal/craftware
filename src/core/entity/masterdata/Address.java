package core.entity.masterdata;

import javax.persistence.*;

@Entity
public class Address {
	private String city;
	private int houseNo;
	@Id
	@GeneratedValue
	private long id;
	private String plz;
	private String street;

	public Address(String street, int houseNo, String plz, String city) {
		this.setStreet(street);
		this.setHouseNo(houseNo);
		this.setPlz(plz);
		this.setCity(city);
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the houseNo
	 */
	public int getHouseNo() {
		return houseNo;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the plz
	 */
	public String getPlz() {
		return plz;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param houseNo
	 *            the houseNo to set
	 */
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param plz
	 *            the plz to set
	 */
	public void setPlz(String plz) {
		this.plz = plz;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
}