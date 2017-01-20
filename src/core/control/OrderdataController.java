package core.control;

import java.util.ArrayList;
import java.util.Date;

import core.entity.Order;
import core.entity.masterdata.Customer;
import core.entity.masterdata.Material;
import core.entity.masterdata.Measure;

public class OrderdataController {
	private ArrayList<Order> orderList;

	public OrderdataController() {
	}

	public void addOrderMaterial(ArrayList<Material> material, Order order) {
		order.setMaterials(material);
	}

	public void addOrderMeasure(ArrayList<Measure> measure, Order order) {
		order.setMeasure(measure);
	}

	public Order createOrder(String category, Customer customer, double price, Date creatDate, Date finishDate) {
		return new Order(category, customer, price, creatDate, finishDate);
	}

	/**
	 * @return the orderList
	 */
	public ArrayList<Order> getOrderList() {
		return orderList;
	}

	/**
	 * @param orderList
	 *            the orderList to set
	 */
	public void setOrderList(ArrayList<Order> orderList) {
		this.orderList = orderList;
	}
}