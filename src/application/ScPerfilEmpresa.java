package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

//Scene1
public class ScPerfilEmpresa {
	
	@FXML
	TextField tituloTxtField;
	
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	//String titulo, nivel;
	//int codigo;
	public void inserirVaga(ActionEvent event)throws IOException {
		//titulo = tituloTxtField;
		//nivel = nivelTxtField;
		//codigo = codigo +1;
		String username = tituloTxtField.getText();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ScenePrincipalControl.fxml"));
		root = loader.load();
		
		ScenePrincipalControl scenePrincipalControl = loader.getController();
		scenePrincipalControl.displayName(username);
		
		//root = FXMLLoader.load(getClass().getResource("PrincipalOpen.fxml"));
		//stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		//stage.setTitle("Tela Principal");
		stage.show();
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}
	
		
	
}
