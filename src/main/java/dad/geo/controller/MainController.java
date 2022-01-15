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
	    
	    	//Location
	    	locat.setLatitudPro(geoService.listBreeds(ip.getValue()).getLatitude().toString());
	    	locat.setLongitudPro(geoService.listBreeds(ip.getValue()).getLongitude().toString());
	    	
	    	locat.setLocationPro(geoService.listBreeds(ip.getValue()).getCountryName().concat(" ("
	    			.concat(geoService.listBreeds(ip.getValue()).getCountryCode())+")"));
	    	locat.setImagePro(new Image("/images/96x64/"+geoService.listBreeds(ip.getValue()).getCountryCode().concat(".png")));
	    	System.out.print(geoService.listBreeds(ip.getValue()).getCountryCode());
	    	locat.setCityPro(geoService.listBreeds(ip.getValue()).getCity().toString().concat("(".concat(geoService.listBreeds(ip.getValue()).getRegionName())+")"));
	    	
	    	locat.setZipCodePro(geoService.listBreeds(ip.getValue()).getZip().toString());
	    	
	    	locat.setLanguagePro(geoService.listBreeds(ip.getValue()).getLocation().getLanguages().get(0).getName().concat("(".concat(
	    			geoService.listBreeds(ip.getValue()).getLocation().getLanguages().get(0).getCode())).concat(")"));
	    	
	    	locat.setTimezonePro(geoService.listBreeds(ip.getValue()).getTimeZone().getCode());
	    	locat.setCallingCodePro("+".concat(geoService.listBreeds(ip.getValue()).getLocation().getCallingCode()));
	    	locat.setCurrencyPro(geoService.listBreeds(ip.getValue()).getCurrency().getName().concat("(".concat(geoService.listBreeds(ip.getValue()).getCurrency().getSymbol())+")"));
	    	
	    	//Connection
	    	connect.setIpPro(geoService.listBreeds(ip.getValue()).getIp());
	    	connect.setIspPro(geoService.listBreeds(ip.getValue()).getConnection().getIsp());
	    	connect.setTypePro(geoService.listBreeds(ip.getValue()).getType());
	    	connect.setAsnPro(geoService.listBreeds(ip.getValue()).getConnection().getAsn().toString());
	    	connect.setHostnamePro(geoService.listBreeds(ip.getValue()).getHostname());
	    	//Secury
	    	secury.setProxyPro(geoService.listBreeds(ip.getValue()).getSecurity().getIsProxy());
	    	secury.setTorPro(geoService.listBreeds(ip.getValue()).getSecurity().getIsTor());
	    	secury.setCrawlerPro(geoService.listBreeds(ip.getValue()).getSecurity().getIsCrawler());
	    	secury.setThreatLevelPro(geoService.listBreeds(ip.getValue()).getSecurity().getThreatLevel());
	   
	    			if(geoService.listBreeds(ip.getValue()).getSecurity().getThreatTypes()==null) {
	    			 	secury.setSecurityPro("This IP is safe. No threats have been detected.");
	    				secury.setPotentialTypesPro("No threats have been detected for this IP address.");
	    			}else {
	    				secury.setSecurityPro("This IP isnt safe. Threats have been detected.");
	    				secury.setPotentialTypesPro("Threats have been detected for this IP address. Carefull!");
	    			}		
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
