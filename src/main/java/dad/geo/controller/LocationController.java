package dad.geo.controller;
	import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
	import javafx.scene.layout.GridPane;
public class LocationController implements Initializable{
	   private StringProperty latitudPro=new SimpleStringProperty();
	   private StringProperty longitudPro=new SimpleStringProperty();
	   private StringProperty cityPro=new SimpleStringProperty();
	   private StringProperty languagePro=new SimpleStringProperty();
	   private StringProperty locationPro=new SimpleStringProperty();
	   private ObjectProperty<Image> imagePro=new SimpleObjectProperty<Image>();
	   private StringProperty callingCodePro=new SimpleStringProperty();
	   private StringProperty timezonePro=new SimpleStringProperty();
	   private StringProperty currencyPro=new SimpleStringProperty();
	   private StringProperty zipCodePro=new SimpleStringProperty();
	    
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
			latitudLabel.textProperty().bind(latitudPro);
			longitudLabel.textProperty().bind(longitudPro);
			cityLabel.textProperty().bind(cityPro);
			languageLabel.textProperty().bind(languagePro);
			locationLabel.textProperty().bind(locationPro);
			callingCodeLabel.textProperty().bind(callingCodePro);
			timezoneLabel.textProperty().bind(timezonePro);
			currencyLabel.textProperty().bind(currencyPro);
			zipCodeLabel.textProperty().bind(zipCodePro);
			
			banderasImageView.imageProperty().bind(imagePro);
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
		public final StringProperty latitudProProperty() {
			return this.latitudPro;
		}
		
		public final String getLatitudPro() {
			return this.latitudProProperty().get();
		}
		
		public final void setLatitudPro(final String latitudPro) {
			this.latitudProProperty().set(latitudPro);
		}
		
		public final StringProperty longitudProProperty() {
			return this.longitudPro;
		}
		
		public final String getLongitudPro() {
			return this.longitudProProperty().get();
		}
		
		public final void setLongitudPro(final String longitudPro) {
			this.longitudProProperty().set(longitudPro);
		}
		
		public final StringProperty cityProProperty() {
			return this.cityPro;
		}
		
		public final String getCityPro() {
			return this.cityProProperty().get();
		}
		
		public final void setCityPro(final String cityPro) {
			this.cityProProperty().set(cityPro);
		}
		
		public final StringProperty languageProProperty() {
			return this.languagePro;
		}
		
		public final String getLanguagePro() {
			return this.languageProProperty().get();
		}
		
		public final void setLanguagePro(final String languagePro) {
			this.languageProProperty().set(languagePro);
		}
		
		public final StringProperty locationProProperty() {
			return this.locationPro;
		}
		
		public final String getLocationPro() {
			return this.locationProProperty().get();
		}
		
		public final void setLocationPro(final String locationPro) {
			this.locationProProperty().set(locationPro);
		}
		
		public final ObjectProperty<Image> imageProProperty() {
			return this.imagePro;
		}
		
		public final Image getImagePro() {
			return this.imageProProperty().get();
		}
		
		public final void setImagePro(final Image imagePro) {
			this.imageProProperty().set(imagePro);
		}
		
		public final StringProperty callingCodeProProperty() {
			return this.callingCodePro;
		}
		
		public final String getCallingCodePro() {
			return this.callingCodeProProperty().get();
		}
		
		public final void setCallingCodePro(final String callingCodePro) {
			this.callingCodeProProperty().set(callingCodePro);
		}
		
		public final StringProperty timezoneProProperty() {
			return this.timezonePro;
		}
		
		public final String getTimezonePro() {
			return this.timezoneProProperty().get();
		}
		
		public final void setTimezonePro(final String timezonePro) {
			this.timezoneProProperty().set(timezonePro);
		}
		
		public final StringProperty zipCodeProProperty() {
			return this.zipCodePro;
		}
		
		public final String getZipCodePro() {
			return this.zipCodeProProperty().get();
		}
		
		public final void setZipCodePro(final String zipCodePro) {
			this.zipCodeProProperty().set(zipCodePro);
		}
		public final StringProperty currencyProProperty() {
			return this.currencyPro;
		}
		
		public final String getCurrencyPro() {
			return this.currencyProProperty().get();
		}
		
		public final void setCurrencyPro(final String currencyPro) {
			this.currencyProProperty().set(currencyPro);
		}
		
		

	}
