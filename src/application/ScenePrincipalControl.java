package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

//Scene2
public class ScenePrincipalControl {
		
	@FXML
	Label nameLabel;
	
	public void displayName(String username) {
		nameLabel.setText("Hello: " + username);
	}


}
