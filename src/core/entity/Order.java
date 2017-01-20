package core.entity;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.*;

import core.entity.masterdata.Customer;
import core.entity.masterdata.Material;
import core.entity.masterdata.Measure;

@Entity
public class Order {
	private String category;
	private Date creatDate;
	private Customer customer;
	private Date finishDate;
	@Id
	@GeneratedValue
	private long id;
	private ArrayList<Material> materials;
	private ArrayList<Measure> measure;
	private double price;

	public Order(String category, Customer customer, ArrayList<Measure> measure, double price, Date creatDate,
			Date finishDate) {
		this.setCategory(category);
		this.setCustomer(customer);
		this.setMeasure(measure);
		this.setPrice(price);
		this.setCreatDate(creatDate);
		this.setFinishDate(finishDate);
	}

	public Order(String category, Customer customer, ArrayList<Measure> measure, double price, Date creatDate,
			Date finishDate, ArrayList<Material> materials) {
		this.setCategory(category);
		this.setCustomer(customer);
		this.setMeasure(measure);
		this.setPrice(price);
		this.setCreatDate(creatDate);
		this.setFinishDate(finishDate);
		this.setMaterials(materials);
	}

	public Order(String category, Customer customer, double price, Date creatDate, Date finishDate) {
		this.setCategory(category);
		this.setCustomer(customer);
		this.setPrice(price);
		this.setCreatDate(creatDate);
		this.setFinishDate(finishDate);
	}

	public Order(String category, Customer customer, double price, Date creatDate, Date finishDate,
			ArrayList<Material> materials) {
		this.setCategory(category);
		this.setCustomer(customer);
		this.setPrice(price);
		this.setCreatDate(creatDate);
		this.setFinishDate(finishDate);
		this.setMaterials(materials);
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @return the creatDate
	 */
	public Date getCreatDate() {
		return creatDate;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @return the finishDate
	 */
	public Date getFinishDate() {
		return finishDate;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the materials
	 */
	public ArrayList<Material> getMaterials() {
		return materials;
	}

	/**
	 * @return the measure
	 */
	public ArrayList<Measure> getMeasure() {
		return measure;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @param creatDate
	 *            the creatDate to set
	 */
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @param finishDate
	 *            the finishDate to set
	 */
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param materials
	 *            the materials to set
	 */
	public void setMaterials(ArrayList<Material> materials) {
		this.materials = materials;
	}

	/**
	 * @param measure
	 *            the measure to set
	 */
	public void setMeasure(ArrayList<Measure> measure) {
		this.measure = measure;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}