package dad.geo;

import dad.geo.controller.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
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
}
