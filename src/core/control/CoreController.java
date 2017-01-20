package core.control;

public class CoreController {
	private DatabaseController database;
	private MasterdataController masterdata;
	private OrderdataController orderdata;

	public CoreController() {
		setMasterdata(new MasterdataController());
		setOrderdata(new OrderdataController());
//		setDatabase(new DatabaseController());
	}

	/**
	 * @return the database
	 */
	public DatabaseController getDatabase() {
		return database;
	}

	/**
	 * @return the masterdata
	 */
	public MasterdataController getMasterdata() {
		return masterdata;
	}

	/**
	 * @return the orderdata
	 */
	public OrderdataController getOrderdata() {
		return orderdata;
	}

	/**
	 * @param database
	 *            the database to set
	 */
	public void setDatabase(DatabaseController database) {
		this.database = database;
	}

	/**
	 * @param masterdata
	 *            the masterdata to set
	 */
	public void setMasterdata(MasterdataController masterdata) {
		this.masterdata = masterdata;
	}

	/**
	 * @param orderdata
	 *            the orderdata to set
	 */
	public void setOrderdata(OrderdataController orderdata) {
		this.orderdata = orderdata;
	}
}
