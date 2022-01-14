package dad.geo.controller;
	import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.geo.api.GeoService;
import dad.geo.model.All;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
	import javafx.scene.control.Tab;
	import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

	public class MainController implements Initializable{
		private StringProperty ip=new SimpleStringProperty();
		
		private GeoService geoService=new GeoService();
		private ConnectionController connect=new ConnectionController();
		private LocationController locat=new LocationController();
		private SecurityController secury=new SecurityController();
	    
		@FXML
	    private BorderPane view;

		@FXML
	    private Tab locationTab;

	    @FXML
	    private Tab connectionTab;

	    @FXML
	    private Tab securityTab;

	    @FXML
	    private TextField IPTextfield;

	    @FXML
	    private Button checkIpButt;

	    @FXML
	    void OncheckIpAction(ActionEvent event) throws Exception {
	    	System.out.print(geoService.listBreeds(ip.getValue()).getConnection());
	    	System.out.print(geoService.listBreeds(ip.getValue()).getCity());
	    }
		
	    public void initialize(URL location, ResourceBundle resources) {
			ip.bind(IPTextfield.textProperty());
			
			connectionTab.setContent(connect.getConnectionView());
			locationTab.setContent(locat.getLocationView());
			securityTab.setContent(secury.getSecurityView());
		}
		 public MainController() throws IOException {
			// TODO Auto-generated constructor stub
		
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
			loader.setController(this);
			loader.load();
		}

	    public BorderPane getView() {
			return view;
		}

		public void setView(BorderPane view) {
			this.view = view;
		}
	}
