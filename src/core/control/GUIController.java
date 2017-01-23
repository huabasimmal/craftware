package core.control;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import core.entity.Order;
import core.entity.masterdata.Material;
import core.entity.masterdata.Measure;
import core.gui.OrderGUIController;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GUIController {

	private ObservableList<Material> materialList;
	private ObservableList<Measure> measureList;
	private ObservableList<Order> orderList;
	private Stage primaryStage;
	private BorderPane rootLayout;
	private Scene scene;

	public GUIController(Stage primaryStage) {
		setPrimaryStage(primaryStage);
	}

	/**
	 * @return the materialList
	 */
	public ObservableList<Material> getMaterialList() {
		return materialList;
	}

	/**
	 * @return the measureList
	 */
	public ObservableList<Measure> getMeasureList() {
		return measureList;
	}

	/**
	 * @return the orderList
	 */
	public ObservableList<Order> getOrderList() {
		return orderList;
	}

	/**
	 * Returns the main stage.
	 * 
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	/**
	 * @return the rootLayout
	 */
	public BorderPane getRootLayout() {
		return rootLayout;
	}

	/**
	 * @return the scene
	 */
	public Scene getScene() {
		return scene;
	}

	/**
	 * Initializes the root layout.
	 */
	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("../gui/RootGUI.fxml"));
			loader.setResources(ResourceBundle.getBundle("lang.gui", new Locale("de", "DE")));
			setRootLayout((BorderPane) loader.load());

			// Show the scene containing the root layout.
			setScene(new Scene(rootLayout));
			getScene().getStylesheets().add("/css/stylesheet.css");
			getPrimaryStage().setScene(scene);
			getPrimaryStage().show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param materialList
	 *            the materialList to set
	 */
	public void setMaterialList(ObservableList<Material> materialList) {
		this.materialList = materialList;
	}

	/**
	 * @param measureList
	 *            the measureList to set
	 */
	public void setMeasureList(ObservableList<Measure> measureList) {
		this.measureList = measureList;
	}

	/**
	 * @param orderList
	 *            the orderList to set
	 */
	public void setOrderList(ObservableList<Order> orderList) {
		this.orderList = orderList;
	}

	/**
	 * @param primaryStage
	 *            the primaryStage to set
	 */
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	/**
	 * @param rootLayout
	 *            the rootLayout to set
	 */
	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout = rootLayout;
	}

	/**
	 * @param scene
	 *            the scene to set
	 */
	public void setScene(Scene scene) {
		this.scene = scene;
	}

	/**
	 * Shows the person overview inside the root layout.
	 */
	public void showOrderOverview() {
		try {
			// Load order overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("../gui/OrderGUI.fxml"));
			loader.setResources(ResourceBundle.getBundle("lang.gui", new Locale("de", "DE")));
			AnchorPane orderOverview = (AnchorPane) loader.load();
			rootLayout.setCenter(orderOverview);
			OrderGUIController orderGUIController = loader.getController();
			orderGUIController.setGuiController(this);
			orderGUIController.getOrderTable().setItems(getOrderList());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
