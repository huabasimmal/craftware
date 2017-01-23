package core;

import core.control.CoreController;
import core.control.GUIController;
import javafx.application.Application;
import javafx.stage.Stage;

public class ApplicationLauncher extends Application {
	private CoreController core;
	private GUIController gui;

	@Override
	public void start(Stage primaryStage) {
		setCore(new CoreController());
		setGui(new GUIController(primaryStage));
		getGui().getPrimaryStage().setTitle("craftware " + getClass().getPackage().getImplementationVersion());
		getGui().initRootLayout();
		getGui().showOrderOverview();
	}

	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * @return the core
	 */
	public CoreController getCore() {
		return core;
	}

	/**
	 * @param core
	 *            the core to set
	 */
	public void setCore(CoreController core) {
		this.core = core;
	}

	/**
	 * @return the gui
	 */
	public GUIController getGui() {
		return gui;
	}

	/**
	 * @param gui
	 *            the gui to set
	 */
	public void setGui(GUIController gui) {
		this.gui = gui;
	}

}
