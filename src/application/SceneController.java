package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SceneController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML private Label myLabel;
	@FXML private Label myTitulo;
	@FXML private Label myTitulo1;
	@FXML private Label myDesc;
	@FXML private Label myDesc1;
	@FXML private TextField tfCodigoVaga;
	@FXML private Button btnCarrega;
	String cod;
	
	public void switchPrincipalOpen(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("PrincipalOpen.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchLogin(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}	
	
	public void switchCadastroEmpresa(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("CadastroEmpresa.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}	
	
	public void switchCadastroPessoa(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("CadastroPessoa.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}	
	
	public void switchCadastroVaga(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("CadastroVaga.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}	
	
	public void switchPerfilPessoa(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("PerfilPessoa.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}	
	
	public void switchPerfilEmpresa(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("PerfilEmpresa.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}	
	
	public void carrega(ActionEvent event) {
		
			try {
				//cod = tfCodigoVaga.getText();
				cod = (tfCodigoVaga.getText());
				System.out.println(cod);
				if(cod.equals("Tecnologia")) {
					myTitulo.setText(null);
					myLabel.setText("Tecnologia");
					myTitulo.setText("Analista de sistemas Jr");
					myDesc.setText("Além de mandar bem e gostar de tecnologia, o profissi..");
					//myTitulo1.setText("Desenvolvedor de sistemas Pleno");
					//myDesc1.setText("Além de mandar bem e gostar de tecnologia, o profissi..");
									
				}
				
               else if (cod.equals("Cozinha")) {
					myLabel.setText("Cozinha");
                    myTitulo.setText("Ajudante de Cozinha");
                    myDesc.setText("Breve Descrição...");

		
					}
				else if (cod.equals("comercio")) {
					myTitulo.setText(null);
					myLabel.setText("Comércio");
					myTitulo.setText("Auxiliar de Departamento");
					myDesc.setText("Breve Descrição...");

				} else if (cod.equals("industria")) {
					myTitulo.setText(null);
					myLabel.setText("Industria");
					myTitulo.setText("Engenheiro de Setor");
					myDesc.setText("Breve Descrição...");
					}
				  else if (cod.equals("saude")) {
					myTitulo.setText(null);
					myLabel.setText("Saúde");
					myTitulo.setText("Técnico em Enfermagem");
					myDesc.setText("Breve Descrição...");

				} else if (cod.equals("transporte")) {
					myTitulo.setText(null);
					myLabel.setText("Transportes");
					myTitulo.setText("Engenheiro De Estratégia Logistíca");
					}
				

				else {
					myTitulo.setText(null);
					myLabel.setText("Outras categorias");
				}
			
			}
			catch (NumberFormatException e){
				System.out.println(" Entre apenas com numeros pfv");
				myLabel.setText("Entre só com números nesse campo pfv");
				
			}
			catch(Exception e) {
				System.out.println(e);
				myLabel.setText("Error");
			}
				
			}

}
	
