package magazzino.entratamerci.controller;

public class StorageController {
	private static final String FILE_ARTICOLI = "articoli.json";
	private static final String FILE_AREE = "aree.json";
	private static final String FILE_FORNITORI = "fornitori.json";
	private static final String FILE_LOCAZIONE = "locazioni.json";
	private static final String FILE_ORDINI = "ordini.json";
	private static final String APP_PATH = System.getProperty("user.dir");
	
	// ==============================PER DEBUG DA IDE=================================
//	private static final String ARTICOLI_PATH = APP_PATH + "\\stored\\" + FILE_ARTICOLI;
//	private static final String AREE_PATH = APP_PATH + "\\stored\\" + FILE_AREE;
//	private static final String FORNITORI_PATH = APP_PATH + "\\stored\\" + FILE_FORNITORI;
//	private static final String LOCAZIONE_PATH = APP_PATH + "\\stored\\" + FILE_LOCAZIONE;
//	private static final String ORDINI_PATH = APP_PATH + "\\stored\\" + FILE_ORDINI;
//	private static final String ORDINE_FXML_PATH = APP_PATH
//			+ "\\src\\main\\resources\\magazzino\\entratamerci\\StoricoOrdini.fxml";
//	private static final String FILE_MENU = APP_PATH
//			+ "\\src\\main\\resources\\magazzino\\entratamerci\\Menu.fxml";
//	private static final String AGG_ORDINE_FXML_PATH = APP_PATH
//			+ "\\src\\main\\resources\\magazzino\\entratamerci\\InserisciOrdine.fxml";
//	private  static final String GIACENZA_PATH = APP_PATH
//			+ "\\src\\main\\resources\\magazzino\\entratamerci\\Giacenza.fxml";
//	private  static final String INSERISCIAGGIORNAARTICOLO_PATH = APP_PATH
//			+ "\\src\\main\\resources\\magazzino\\entratamerci\\InserisciAggiornaArticolo.fxml";
//	private  static final String INSERISCIAGGIORNAFORNITORE_PATH = APP_PATH
//			+ "\\src\\main\\resources\\magazzino\\entratamerci\\InserisciAggiornaFornitore.fxml";
//	private static final String ARTICOLI_FXML_PATH = APP_PATH
//			+ "\\src\\main\\resources\\magazzino\\entratamerci\\AnagraficaArticoli.fxml";
//	private static final String FORNITORI_FXML_PATH = APP_PATH
//			+ "\\src\\main\\resources\\magazzino\\entratamerci\\AnagraficaFornitori.fxml";
	// ==============================PER DEBUG DA IDE=================================
	
	
	// ==================================PER JAR======================================
	private static final String ARTICOLI_PATH = APP_PATH + "\\stored\\" + FILE_ARTICOLI;
	private static final String AREE_PATH = APP_PATH + "\\stored\\" + FILE_AREE;
	private static final String FORNITORI_PATH = APP_PATH + "\\stored\\" + FILE_FORNITORI;
	private static final String LOCAZIONE_PATH = APP_PATH + "\\stored\\" + FILE_LOCAZIONE;
	private static final String ORDINI_PATH = APP_PATH + "\\stored\\" + FILE_ORDINI;
	private static final String ORDINE_FXML_PATH = APP_PATH
			+ "\\fxml\\StoricoOrdini.fxml";
	private static final String FILE_MENU = APP_PATH
			+ "\\fxml\\Menu.fxml";
	private static final String AGG_ORDINE_FXML_PATH = APP_PATH
			+ "\\fxml\\InserisciOrdine.fxml";
	private  static final String GIACENZA_PATH = APP_PATH
			+ "\\fxml\\Giacenza.fxml";
	private  static final String INSERISCIAGGIORNAARTICOLO_PATH = APP_PATH
			+ "\\fxml\\InserisciAggiornaArticolo.fxml";
	private static final String ARTICOLI_FXML_PATH = APP_PATH
			+ "\\fxml\\AnagraficaArticoli.fxml";
	private static final String FORNITORI_FXML_PATH = APP_PATH
			+ "\\fxml\\AnagraficaFornitori.fxml";
	private  static final String INSERISCIAGGIORNAFORNITORE_PATH = APP_PATH
			+ "\\fxml\\InserisciAggiornaFornitore.fxml";
	// ==================================PER JAR======================================
	
	public static String getFornitoriFxmlPath() {
		return FORNITORI_FXML_PATH;
	}

	public static String getOrdineFxmlPath() {
		return ORDINE_FXML_PATH;
	}

	public static String getAggOrdineFxmlPath() {
		return AGG_ORDINE_FXML_PATH;
	}

	public static String getFileMenu() {
		return FILE_MENU;
	}

	public static String getFileArticoli() {
		return FILE_ARTICOLI;
	}

	public static String getFileAree() {
		return FILE_AREE;
	}

	public static String getFileFornitori() {
		return FILE_FORNITORI;
	}

	public static String getFornitoriPath() {
		return FORNITORI_PATH;
	}

	public static String getFileLocazione() {
		return FILE_LOCAZIONE;
	}

	public static String getLocazionePath() {
		return LOCAZIONE_PATH;
	}

	public static String getFileOrdini() {
		return FILE_ORDINI;
	}

	public static String getOrdiniPath() {
		return ORDINI_PATH;
	}

	public static String getArticoliPath() {
		return ARTICOLI_PATH;
	}

	public static String getAreePath() {
		return AREE_PATH;
	}

	public static String getArticoliFxmlPath() {
		return ARTICOLI_FXML_PATH;
	}
	public static String getGiacenzaFxmlPath() {
		return GIACENZA_PATH;
	}

	public static String getInserisciAggiornaArticolo() {
		return INSERISCIAGGIORNAARTICOLO_PATH;
	}
	public static String getInserisciAggiornaFornitore() {
		return INSERISCIAGGIORNAFORNITORE_PATH;
	}
}