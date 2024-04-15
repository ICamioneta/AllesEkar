package allesekar;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class WeaponCardsController implements Initializable {

    @FXML
    private ComboBox<String> damageTypeField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Get the list of damage types from JsonHandler and populate the ComboBox
        List<String> damageTypes = jsonHandler.WeaponCard.getNameArray("damage_types");
        damageTypeField.getItems().addAll(damageTypes);
    }
}
