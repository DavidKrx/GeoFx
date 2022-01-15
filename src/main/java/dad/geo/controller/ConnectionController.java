package dad.geo.controller;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ConnectionController implements Initializable{
	private StringProperty  ipPro =new SimpleStringProperty();
	private StringProperty typePro=new SimpleStringProperty();
	private StringProperty asnPro=new SimpleStringProperty();
	private StringProperty hostnamePro=new SimpleStringProperty();
	private StringProperty ispPro=new SimpleStringProperty();
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
	  ipLabel.textProperty().bind(ipPro);
	  typeLabel.textProperty().bind(typePro);
	  asnLabel.textProperty().bind(asnPro);
	  hostnameLabel.textProperty().bind(hostnamePro);
	  ispLabel.textProperty().bind(ispPro);
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
	public final StringProperty ipProProperty() {
		return this.ipPro;
	}
	
	public final String getIpPro() {
		return this.ipProProperty().get();
	}
	
	public final void setIpPro(final String ipPro) {
		this.ipProProperty().set(ipPro);
	}
	
	public final StringProperty typeProProperty() {
		return this.typePro;
	}
	
	public final String getTypePro() {
		return this.typeProProperty().get();
	}
	
	public final void setTypePro(final String typePro) {
		this.typeProProperty().set(typePro);
	}
	
	public final StringProperty asnProProperty() {
		return this.asnPro;
	}
	
	public final String getAsnPro() {
		return this.asnProProperty().get();
	}
	
	public final void setAsnPro(final String asnPro) {
		this.asnProProperty().set(asnPro);
	}
	
	public final StringProperty hostnameProProperty() {
		return this.hostnamePro;
	}
	
	public final String getHostnamePro() {
		return this.hostnameProProperty().get();
	}
	
	public final void setHostnamePro(final String hostnamePro) {
		this.hostnameProProperty().set(hostnamePro);
	}
	
	public final StringProperty ispProProperty() {
		return this.ispPro;
	}
	
	public final String getIspPro() {
		return this.ispProProperty().get();
	}
	
	public final void setIspPro(final String ispPro) {
		this.ispProProperty().set(ispPro);
	}
	
}