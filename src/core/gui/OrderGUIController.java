package core.gui;

import core.control.GUIController;
import core.entity.Order;
import core.entity.masterdata.Material;
import core.entity.masterdata.Measure;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class OrderGUIController {
	@FXML
	private Label addressCityLabel;
	@FXML
	private Label addressHouseNoLabel;
	@FXML
	private Label addressPLZLabel;
	@FXML
	private Label addressStreetLabel;
	@FXML
	private Label contactMailLabel;
	@FXML
	private Label contactMobileLabel;
	@FXML
	private Label contactTelephoneLabel;
	@FXML
	private Label customerBirthDateLabel;
	@FXML
	private Label customerGivenNameLabel;

	@FXML
	private Label customerNumberLabel;
	@FXML
	private Label customerSurnameLabel;
	private GUIController guiController;
	@FXML
	private Label orderCreateDateLabel;
	@FXML
	private Label orderFinishDateLabel;
	@FXML
	private TableColumn<Material, String> orderMaterialCategoryColumn;
	@FXML
	private TableColumn<Measure, String> orderMaterialNameColumn;
	@FXML
	private TableView<Material> orderMaterialTable;
	@FXML
	private TableColumn<Measure, String> orderMeasureMeasurementColumn;
	@FXML
	private TableView<Measure> orderMeasureTable;
	@FXML
	private TableColumn<Measure, String> orderMeasureTypeColumn;
	@FXML
	private TableColumn<Measure, String> orderMeasureUnitColumn;
	@FXML
	private TableColumn<Order, String> orderNoColumn;
	@FXML
	private Label orderNumberLabel;
	@FXML
	private Label orderPriceLabel;
	@FXML
	private TableView<Order> orderTable;

	@FXML
	private Label orderTypeLabel;

	/**
	 * @return the addressCityLabel
	 */
	public Label getAddressCityLabel() {
		return addressCityLabel;
	}

	/**
	 * @return the addressHouseNoLabel
	 */
	public Label getAddressHouseNoLabel() {
		return addressHouseNoLabel;
	}

	/**
	 * @return the addressPLZLabel
	 */
	public Label getAddressPLZLabel() {
		return addressPLZLabel;
	}

	/**
	 * @return the addressStreetLabel
	 */
	public Label getAddressStreetLabel() {
		return addressStreetLabel;
	}

	/**
	 * @return the contactMailLabel
	 */
	public Label getContactMailLabel() {
		return contactMailLabel;
	}

	/**
	 * @return the contactMobileLabel
	 */
	public Label getContactMobileLabel() {
		return contactMobileLabel;
	}

	/**
	 * @return the contactTelephoneLabel
	 */
	public Label getContactTelephoneLabel() {
		return contactTelephoneLabel;
	}

	/**
	 * @return the customerBirthDateLabel
	 */
	public Label getCustomerBirthDateLabel() {
		return customerBirthDateLabel;
	}

	/**
	 * @return the customerGivenNameLabel
	 */
	public Label getCustomerGivenNameLabel() {
		return customerGivenNameLabel;
	}

	/**
	 * @return the customerNumberLabel
	 */
	public Label getCustomerNumberLabel() {
		return customerNumberLabel;
	}

	/**
	 * @return the customerSurnameLabel
	 */
	public Label getCustomerSurnameLabel() {
		return customerSurnameLabel;
	}

	/**
	 * @return the guiController
	 */
	public GUIController getGuiController() {
		return guiController;
	}

	/**
	 * @return the orderCreateDateLabel
	 */
	public Label getOrderCreateDateLabel() {
		return orderCreateDateLabel;
	}

	/**
	 * @return the orderFinishDateLabel
	 */
	public Label getOrderFinishDateLabel() {
		return orderFinishDateLabel;
	}

	/**
	 * @return the orderMaterialCategoryColumn
	 */
	public TableColumn<Material, String> getOrderMaterialCategoryColumn() {
		return orderMaterialCategoryColumn;
	}

	/**
	 * @return the orderMaterialNameColumn
	 */
	public TableColumn<Measure, String> getOrderMaterialNameColumn() {
		return orderMaterialNameColumn;
	}

	/**
	 * @return the orderMaterialTable
	 */
	public TableView<Material> getOrderMaterialTable() {
		return orderMaterialTable;
	}

	/**
	 * @return the orderMeasureMeasurementColumn
	 */
	public TableColumn<Measure, String> getOrderMeasureMeasurementColumn() {
		return orderMeasureMeasurementColumn;
	}

	/**
	 * @return the orderMeasureTable
	 */
	public TableView<Measure> getOrderMeasureTable() {
		return orderMeasureTable;
	}

	/**
	 * @return the orderMeasureTypeColumn
	 */
	public TableColumn<Measure, String> getOrderMeasureTypeColumn() {
		return orderMeasureTypeColumn;
	}

	/**
	 * @return the orderMeasureUnitColumn
	 */
	public TableColumn<Measure, String> getOrderMeasureUnitColumn() {
		return orderMeasureUnitColumn;
	}

	/**
	 * @return the orderNoColumn
	 */
	public TableColumn<Order, String> getOrderNoColumn() {
		return orderNoColumn;
	}

	/**
	 * @return the orderNumberLabel
	 */
	public Label getOrderNumberLabel() {
		return orderNumberLabel;
	}

	/**
	 * @return the orderPriceLabel
	 */
	public Label getOrderPriceLabel() {
		return orderPriceLabel;
	}

	/**
	 * @return the orderTable
	 */
	public TableView<Order> getOrderTable() {
		return orderTable;
	}

	/**
	 * @return the orderTypeLabel
	 */
	public Label getOrderTypeLabel() {
		return orderTypeLabel;
	}

	@FXML
	private void initialize() {
		// Initialize the person table with the two columns.
		orderNoColumn
				.setCellValueFactory(cellData -> new SimpleStringProperty(Long.toString(cellData.getValue().getId())));
	}

	/**
	 * @param addressCityLabel
	 *            the addressCityLabel to set
	 */
	public void setAddressCityLabel(Label addressCityLabel) {
		this.addressCityLabel = addressCityLabel;
	}

	/**
	 * @param addressHouseNoLabel
	 *            the addressHouseNoLabel to set
	 */
	public void setAddressHouseNoLabel(Label addressHouseNoLabel) {
		this.addressHouseNoLabel = addressHouseNoLabel;
	}

	/**
	 * @param addressPLZLabel
	 *            the addressPLZLabel to set
	 */
	public void setAddressPLZLabel(Label addressPLZLabel) {
		this.addressPLZLabel = addressPLZLabel;
	}

	/**
	 * @param addressStreetLabel
	 *            the addressStreetLabel to set
	 */
	public void setAddressStreetLabel(Label addressStreetLabel) {
		this.addressStreetLabel = addressStreetLabel;
	}

	/**
	 * @param contactMailLabel
	 *            the contactMailLabel to set
	 */
	public void setContactMailLabel(Label contactMailLabel) {
		this.contactMailLabel = contactMailLabel;
	}

	/**
	 * @param contactMobileLabel
	 *            the contactMobileLabel to set
	 */
	public void setContactMobileLabel(Label contactMobileLabel) {
		this.contactMobileLabel = contactMobileLabel;
	}

	/**
	 * @param contactTelephoneLabel
	 *            the contactTelephoneLabel to set
	 */
	public void setContactTelephoneLabel(Label contactTelephoneLabel) {
		this.contactTelephoneLabel = contactTelephoneLabel;
	}

	/**
	 * @param customerBirthDateLabel
	 *            the customerBirthDateLabel to set
	 */
	public void setCustomerBirthDateLabel(Label customerBirthDateLabel) {
		this.customerBirthDateLabel = customerBirthDateLabel;
	}

	/**
	 * @param customerGivenNameLabel
	 *            the customerGivenNameLabel to set
	 */
	public void setCustomerGivenNameLabel(Label customerGivenNameLabel) {
		this.customerGivenNameLabel = customerGivenNameLabel;
	}

	/**
	 * @param customerNumberLabel
	 *            the customerNumberLabel to set
	 */
	public void setCustomerNumberLabel(Label customerNumberLabel) {
		this.customerNumberLabel = customerNumberLabel;
	}

	/**
	 * @param customerSurnameLabel
	 *            the customerSurnameLabel to set
	 */
	public void setCustomerSurnameLabel(Label customerSurnameLabel) {
		this.customerSurnameLabel = customerSurnameLabel;
	}

	/**
	 * @param guiController
	 *            the guiController to set
	 */
	public void setGuiController(GUIController guiController) {
		this.guiController = guiController;
	}

	/**
	 * @param orderCreateDateLabel
	 *            the orderCreateDateLabel to set
	 */
	public void setOrderCreateDateLabel(Label orderCreateDateLabel) {
		this.orderCreateDateLabel = orderCreateDateLabel;
	}

	/**
	 * @param orderFinishDateLabel
	 *            the orderFinishDateLabel to set
	 */
	public void setOrderFinishDateLabel(Label orderFinishDateLabel) {
		this.orderFinishDateLabel = orderFinishDateLabel;
	}

	/**
	 * @param orderMaterialCategoryColumn
	 *            the orderMaterialCategoryColumn to set
	 */
	public void setOrderMaterialCategoryColumn(TableColumn<Material, String> orderMaterialCategoryColumn) {
		this.orderMaterialCategoryColumn = orderMaterialCategoryColumn;
	}

	/**
	 * @param orderMaterialNameColumn
	 *            the orderMaterialNameColumn to set
	 */
	public void setOrderMaterialNameColumn(TableColumn<Measure, String> orderMaterialNameColumn) {
		this.orderMaterialNameColumn = orderMaterialNameColumn;
	}

	/**
	 * @param orderMaterialTable
	 *            the orderMaterialTable to set
	 */
	public void setOrderMaterialTable(TableView<Material> orderMaterialTable) {
		this.orderMaterialTable = orderMaterialTable;
	}

	/**
	 * @param orderMeasureMeasurementColumn
	 *            the orderMeasureMeasurementColumn to set
	 */
	public void setOrderMeasureMeasurementColumn(TableColumn<Measure, String> orderMeasureMeasurementColumn) {
		this.orderMeasureMeasurementColumn = orderMeasureMeasurementColumn;
	}

	/**
	 * @param orderMeasureTable
	 *            the orderMeasureTable to set
	 */
	public void setOrderMeasureTable(TableView<Measure> orderMeasureTable) {
		this.orderMeasureTable = orderMeasureTable;
	}

	/**
	 * @param orderMeasureTypeColumn
	 *            the orderMeasureTypeColumn to set
	 */
	public void setOrderMeasureTypeColumn(TableColumn<Measure, String> orderMeasureTypeColumn) {
		this.orderMeasureTypeColumn = orderMeasureTypeColumn;
	}

	/**
	 * @param orderMeasureUnitColumn
	 *            the orderMeasureUnitColumn to set
	 */
	public void setOrderMeasureUnitColumn(TableColumn<Measure, String> orderMeasureUnitColumn) {
		this.orderMeasureUnitColumn = orderMeasureUnitColumn;
	}

	/**
	 * @param orderNoColumn
	 *            the orderNoColumn to set
	 */
	public void setOrderNoColumn(TableColumn<Order, String> orderNoColumn) {
		this.orderNoColumn = orderNoColumn;
	}

	/**
	 * @param orderNumberLabel
	 *            the orderNumberLabel to set
	 */
	public void setOrderNumberLabel(Label orderNumberLabel) {
		this.orderNumberLabel = orderNumberLabel;
	}

	/**
	 * @param orderPriceLabel
	 *            the orderPriceLabel to set
	 */
	public void setOrderPriceLabel(Label orderPriceLabel) {
		this.orderPriceLabel = orderPriceLabel;
	}

	/**
	 * @param orderTable
	 *            the orderTable to set
	 */
	public void setOrderTable(TableView<Order> orderTable) {
		this.orderTable = orderTable;
	}

	/**
	 * @param orderTypeLabel
	 *            the orderTypeLabel to set
	 */
	public void setOrderTypeLabel(Label orderTypeLabel) {
		this.orderTypeLabel = orderTypeLabel;
	}
}
