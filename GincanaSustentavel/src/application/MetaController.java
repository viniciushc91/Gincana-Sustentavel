package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MetaController {

	@FXML
	TextField metaField;

	@FXML
	Button metaOK;

	@FXML
	Button metaCancela;

	private Controller parentController;

	public void setParentController(Controller parentController) {
		this.parentController = parentController;
	}

	public void definirMeta() {

		try {
			// Attempt to parse the text from metaField into an Integer
			int meta = Integer.valueOf(metaField.getText());
			parentController.setMeta(meta);

			// Close the stage
			Stage stage = (Stage) metaOK.getScene().getWindow();
			stage.close();

		} catch (NumberFormatException e) {
			// Handle the case where the user entered a non-integer value
			// You can display an error message or take other appropriate action here
			e.printStackTrace(); // For debugging purposes
			// Or some other appropriate default value
		}
	}

	public void cancela() {
		Stage stage = (Stage) metaCancela.getScene().getWindow();
		stage.close();
	}



}
