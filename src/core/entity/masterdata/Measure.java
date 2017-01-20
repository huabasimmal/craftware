package core.entity.masterdata;

import javax.persistence.*;

@Entity
public class Measure {
	@Id
	@GeneratedValue
	private long id;
	private double measurement;
	private String type;
	private String unit;

	public Measure(String type, double measurement, String unit) {
		this.setType(type);
		this.setMeasurement(measurement);
		this.setUnit(unit);
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the measurement
	 */
	public double getMeasurement() {
		return measurement;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param measurement
	 *            the measurement to set
	 */
	public void setMeasurement(double measurement) {
		this.measurement = measurement;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @param unit
	 *            the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
}