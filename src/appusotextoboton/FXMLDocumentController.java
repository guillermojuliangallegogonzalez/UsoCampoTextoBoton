package appusotextoboton;

import CampoTextoBoton.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author guillermogallegogonzalez
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private CampoTextoBoton campoTextoBoton1;
    @FXML
    private CampoTextoBoton campoTextoBoton2;

    public void cambioTextoLabel(Label etiqueta, CampoTextoBoton campoTextoBoton) {
        etiqueta.setText("Se ha grabado: " + campoTextoBoton.getText());
    }

    public void cambioTextoLabel2(Label etiqueta, CampoTextoBoton campoTextoBoton) {
        etiqueta.setText("Se ha grabado: " + campoTextoBoton.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    private void cambioTextoLabel(MouseEvent event) {
        this.label.setText("Se ha grabado: " + campoTextoBoton1.getText());
    }

    @FXML
    private void cambioTextoLabel2(MouseEvent event) {
        this.label.setText("Se ha grabado: " + campoTextoBoton2.getText());
    }

}
