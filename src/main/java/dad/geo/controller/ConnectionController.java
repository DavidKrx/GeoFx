package dad.geo.controller;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ConnectionController implements Initializable{

    @FXML
    private GridPane connectionView;

	@FXML
    private Label ipLabel;

    @FXML
    private Label typeLabel;

    @FXML
    private Label asnLabel;

    @FXML
    private Label hostnameLabel;

    @FXML
    private Label ispLabel;

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	 public ConnectionController() throws IOException {
			// TODO Auto-generated constructor stub
		
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Connection.fxml"));
			loader.setController(this);
			loader.load();
		}
	
    public GridPane getConnectionView() {
		return connectionView;
	}

	public void setConnectionView(GridPane connectionView) {
		this.connectionView = connectionView;
	}
}