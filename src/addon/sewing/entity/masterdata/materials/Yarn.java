package addon.sewing.entity.masterdata.materials;

import javax.persistence.*;

import core.entity.masterdata.Material;

@Entity
public class Yarn extends Material {
	private String color;
	@Id
	@GeneratedValue
	private long id;

	public Yarn(String name, String category, String color) {
		super(name, category);
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
}
