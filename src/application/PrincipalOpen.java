package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class PrincipalOpen extends Application{


	@Override
	public void start(Stage stage) throws Exception {
		/*AnchorPane anchorPane = (AnchorPane)FXMLLoader.load(this.getClass().getResource("PrincipalOpen.fxml"));
		Scene scene = new Scene(anchorPane);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("OpenJobs");
		primaryStage.show();
		*/
		try {
			Parent root = FXMLLoader.load(getClass().getResource("PrincipalOpen.fxml"));
			Scene scene = new Scene(root);
			
			stage.setScene(scene);
			stage.setTitle("Tela Principal");
			stage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);

	}

}
