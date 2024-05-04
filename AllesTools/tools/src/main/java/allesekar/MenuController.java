package allesekar;

import java.io.IOException;
import javafx.fxml.FXML;

public class MenuController 
{
    @FXML
    private void toUnitCards() throws IOException
    {
        App.setRoot("unitCards");
    }
    @FXML
    private void toWeaponCards() throws IOException
    {
        App.setRoot("weaponCards");
    }
    @FXML
    private void toArmourCards() throws IOException
    {
        App.setRoot("armourCards");
    }
    @FXML
    private void toSettings() throws IOException
    {
        App.setRoot("settings");
    }
}
