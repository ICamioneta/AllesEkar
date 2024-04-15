package allesekar;

import org.json.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class jsonHandler 
{
    //params, or locations for local jsons
    public static final String WEAPON_CARD = "weapon_card.json";
    public static final String ARMOUR_CARD = "armour_card.json";
    public static final String UNIT_CARD = "unit_card.json";

    public static class WeaponCard
    {

        //needs failsafe for bad input or no name object for input attribute
        public static List<String> getNameArray(String Attribute)
        {
            int attribute = 0;
            switch (Attribute) {
                case "damage_types":
                    attribute = 0;
                    break;
                case "ranges":
                    attribute = 1;
                    break;
                case "attack_types":
                    attribute = 3;
                    break;
                case "special rules":
                    attribute = 4;
                    break;
            }

            List<String> list = new ArrayList<String>();
            JSONArray weaponCard = readJson(WEAPON_CARD);

            JSONArray jsonArray = weaponCard.getJSONArray(attribute);
            for (int i = 0; i < jsonArray.length(); i++) 
            {
                JSONObject damageTypeObj = jsonArray.getJSONObject(i);
                String name = damageTypeObj.getString("name");
                list.add(name);
            }

            return list;
        }
    }


    public static JSONArray readJson(String filename)
    {
        String content = "";
        try{
            content = new String(Files.readAllBytes(Paths.get(filename)));
        } catch (IOException e) {e.printStackTrace();}
        return new JSONArray(content);
    }

}
