package addon.sewing.entity.masterdata.materials;

import javax.persistence.*;

import core.entity.masterdata.Material;

@Entity
public class Fabric extends Material {
	private String color;
	@Id
	@GeneratedValue
	private long id;
	private String type;

	public Fabric(String name, String category, String type, String color) {
		super(name, category);
		this.setType(type);
		this.setColor(color);
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
