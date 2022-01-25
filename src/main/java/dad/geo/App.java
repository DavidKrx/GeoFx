package dad.geo;

import dad.geo.controller.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class App extends Application{
	private MainController control;

	@Override
	public void start(Stage primaryStage) throws Exception {
		control=new MainController();
		//primaryStage.getIcons().add(new Image(getClass().getResource("/images/app-icon-64x64.png").toExternalForm()));		
		primaryStage.setTitle("GeoFx");
		primaryStage.setScene(new Scene(control.getView()));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
   
	public static void confirm(String header, String headerContent) {
		Alert alerta=new Alert(AlertType.INFORMATION);
		alerta.setTitle(header);
		alerta.setHeaderText(headerContent);
		alerta.showAndWait();
	}
    public static void reject(String titulo,String header, String content) {
  		Alert alerta=new Alert(AlertType.ERROR);
  		alerta.setTitle(titulo);
  		alerta.setHeaderText(header);
  		alerta.setContentText(content);
  		alerta.showAndWait();
  	}
}
