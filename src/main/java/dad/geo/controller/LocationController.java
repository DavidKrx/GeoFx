package dad.geo.controller;
	import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
	import javafx.scene.image.ImageView;
	import javafx.scene.layout.GridPane;
public class LocationController implements Initializable{

	    @FXML
	    private GridPane locationView;

		@FXML
	    private Label latitudLabel;

	    @FXML
	    private Label longitudLabel;

	    @FXML
	    private Label cityLabel;

	    @FXML
	    private Label languageLabel;

	    @FXML
	    private Label locationLabel;

	    @FXML
	    private ImageView banderasImageView;

	    @FXML
	    private Label callingCodeLabel;

	    @FXML
	    private Label timezoneLabel;

	    @FXML
	    private Label currencyLabel;

	    @FXML
	    private Label zipCodeLabel;
		
	    public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}
		 public LocationController() throws IOException {
				// TODO Auto-generated constructor stub
			
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LocationView.fxml"));
				loader.setController(this);
				loader.load();
			}
	    public GridPane getLocationView() {
			return locationView;
		}

		public void setLocationView(GridPane locationView) {
			this.locationView = locationView;
		}

	}
