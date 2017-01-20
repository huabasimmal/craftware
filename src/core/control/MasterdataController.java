package core.control;

import java.util.ArrayList;
import java.util.Date;

import core.entity.masterdata.Address;
import core.entity.masterdata.Contact;
import core.entity.masterdata.Customer;
import core.entity.masterdata.Material;
import core.entity.masterdata.Measure;

public class MasterdataController {
	private ArrayList<Customer> customerList;
	private ArrayList<Material> materialList;
	private ArrayList<Measure> measureList;
	private OrderdataController ordercontroller;

	public MasterdataController() {
	}

	public void buildMaterialList() {

	}

	public Address createAddress(String street, int houseNo, String plz, String city) {
		return new Address(street, houseNo, plz, city);
	}

	public Contact createContact(String phone, String mobile, String email) {
		return new Contact(phone, mobile, email);
	}

	public Customer createCustomer(String name, String surname, Date birthDate, Address address, Contact contact) {
		return new Customer(name, surname, birthDate, address, contact);
	}

	public Material createMaterial(String name, String category) {
		return new Material(name, category);
	}

	public Measure createMeasure(String type, double measurement, String unit) {
		return new Measure(type, measurement, unit);
	}

	/**
	 * @return the customerList
	 */
	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	/**
	 * @return the materials
	 */
	public ArrayList<Material> getMaterialList() {
		return materialList;
	}

	/**
	 * @return the measureList
	 */
	public ArrayList<Measure> getMeasureList() {
		return measureList;
	}

	/**
	 * @return the ordermanager
	 */
	public OrderdataController getOrdermanager() {
		return ordercontroller;
	}

	public Address readAddress(String name) {
		Address address = null;
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getName().equals(name) || customerList.get(i).getSurname().equals(name)) {
				address = customerList.get(i).getAddress();
				break;
			}
		}
		return address;

	}

	public Contact readContact(String name) {
		Contact contact = null;
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getName().equals(name)) {
				contact = customerList.get(i).getContact();
				break;
			}
		}
		return contact;

	}

	public Customer readCustomer(String name) {
		Customer customer = null;
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getName().equals(name) || customerList.get(i).getSurname().equals(name)) {
				customer = customerList.get(i);
				break;
			}
		}
		return customer;
	}

	public Customer readCustomer(String name, String surname) {
		Customer customer = null;
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getName().equals(name) && customerList.get(i).getSurname().equals(surname)) {
				customer = customerList.get(i);
				break;
			}
		}
		return customer;
	}

	public Customer readCustomer(String name, String surname, Date birthDate) {
		Customer customer = null;
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getName().equals(name) && customerList.get(i).getSurname().equals(surname)
					&& customerList.get(i).getBirthDate().equals(birthDate)) {
				customer = customerList.get(i);
				break;
			}
		}
		return customer;
	}

	public Material readMaterial(String name) {
		Material material = null;
		for (int i = 0; i < materialList.size(); i++) {
			if (materialList.get(i).getName().equals(name)) {
				material = materialList.get(i);
				break;
			}
		}
		return material;
	}

	public Measure readMeasure(String type) {
		Measure measure = null;
		for (int i = 0; i < measureList.size(); i++) {
			if (measureList.get(i).getType().equals(type)) {
				measure = measureList.get(i);
				break;
			}
		}
		return measure;
	}

	/**
	 * @param customerList
	 *            the customerList to set
	 */
	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}

	/**
	 * @param materials
	 *            the materials to set
	 */
	public void setMaterialList(ArrayList<Material> materialList) {
		this.materialList = materialList;
	}

	/**
	 * @param measureList
	 *            the measureList to set
	 */
	public void setMeasureList(ArrayList<Measure> measureList) {
		this.measureList = measureList;
	}

	/**
	 * @param ordermanager
	 *            the ordermanager to set
	 */
	public void setOrdermanager(OrderdataController ordermanager) {
		this.ordercontroller = ordermanager;
	}
}