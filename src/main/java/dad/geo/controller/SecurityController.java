package dad.geo.controller;

	import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
	import javafx.scene.control.Label;
	import javafx.scene.layout.GridPane;
	
	public class SecurityController implements Initializable{
		private StringProperty  securityPro =new SimpleStringProperty();
		private StringProperty  threatLevelPro =new SimpleStringProperty();
		private StringProperty  potentialTypesPro =new SimpleStringProperty();
		private BooleanProperty proxyPro=new SimpleBooleanProperty();
		private BooleanProperty torPro=new SimpleBooleanProperty();
		private BooleanProperty crawlerPro=new SimpleBooleanProperty();
		@FXML
	    private GridPane securityView;

		@FXML
	    private Label securityLabel;

	    @FXML
	    private CheckBox proxyCheck;

	    @FXML
	    private CheckBox torCheck;

	    @FXML
	    private CheckBox crawlerCheck;

	    @FXML
	    private Label threatLevelLabel;

	    @FXML
	    private Label potentialTypesLabel;
	    
		public void initialize(URL location, ResourceBundle resources) {
			securityLabel.textProperty().bindBidirectional(securityPro);
			threatLevelLabel.textProperty().bind(threatLevelPro);
			potentialTypesLabel.textProperty().bindBidirectional(potentialTypesPro);
			
			proxyCheck.allowIndeterminateProperty().bind(proxyPro);
			torCheck.allowIndeterminateProperty().bind(torPro);
			crawlerCheck.allowIndeterminateProperty().bind(crawlerPro);
		}
		 public SecurityController() throws IOException {
				// TODO Auto-generated constructor stub
			
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SecurityView.fxml"));
				loader.setController(this);
				loader.load();
			}
	    public GridPane getSecurityView() {
			return securityView;
		}

		public void setSecurityView(GridPane securityView) {
			this.securityView = securityView;
		}
		public final StringProperty securityProProperty() {
			return this.securityPro;
		}
		
		public final String getSecurityPro() {
			return this.securityProProperty().get();
		}
		
		public final void setSecurityPro(final String securityPro) {
			this.securityProProperty().set(securityPro);
		}
		
		public final StringProperty threatLevelProProperty() {
			return this.threatLevelPro;
		}
		
		public final String getThreatLevelPro() {
			return this.threatLevelProProperty().get();
		}
		
		public final void setThreatLevelPro(final String threatLevelPro) {
			this.threatLevelProProperty().set(threatLevelPro);
		}
		
		public final StringProperty potentialTypesProProperty() {
			return this.potentialTypesPro;
		}
		
		public final String getPotentialTypesPro() {
			return this.potentialTypesProProperty().get();
		}
		
		public final void setPotentialTypesPro(final String potentialTypesPro) {
			this.potentialTypesProProperty().set(potentialTypesPro);
		}
		
		public final BooleanProperty proxyProProperty() {
			return this.proxyPro;
		}
		
		public final boolean isProxyPro() {
			return this.proxyProProperty().get();
		}
		
		public final void setProxyPro(final boolean proxyPro) {
			this.proxyProProperty().set(proxyPro);
		}
		
		public final BooleanProperty torProProperty() {
			return this.torPro;
		}
		
		public final boolean isTorPro() {
			return this.torProProperty().get();
		}
		
		public final void setTorPro(final boolean torPro) {
			this.torProProperty().set(torPro);
		}
		
		public final BooleanProperty crawlerProProperty() {
			return this.crawlerPro;
		}
		
		public final boolean isCrawlerPro() {
			return this.crawlerProProperty().get();
		}
		
		public final void setCrawlerPro(final boolean crawlerPro) {
			this.crawlerProProperty().set(crawlerPro);
		}
		

	}