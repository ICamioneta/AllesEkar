package allesekar;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.Files;
import java.nio.channels.*;

class Attribute
{
    String name;
    Integer score;
    Integer cost;
}
class Aptitude
{
    String name;
    Integer mod;
    Integer cost;
    String minAttributeName;
}
class Skill
{
    String name;
    String type;
}

public class UnitCardHandler {
    private Path unitCardPath = Path.of(null, null);
    private JSONObject jsonData;
    private List<Attribute> attributeList;
    private List<Aptitude> aptitudeList;
    private List<Skill> skillList;


    public UnitCardHandler(String filePath)
    {
        this.unitCardPath = Paths.get(filePath);

        try
        {
            lockFile();
            loadData();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private void loadData() throws IOException
    {
        String jsonString = Files.readString(unitCardPath);
        jsonData = new JSONObject(jsonString);

        //load attributes
        JSONArray attributeArray = jsonData.getJSONArray("attributes");
        attributeList = new ArrayList<>();
        for (int i = 0; i < attributeArray.length(); i++) 
        {
            JSONObject attributeObject = attributeArray.getJSONObject(i);
            Attribute attribute = new Attribute();
            attribute.name = attributeObject.getString("name");
            attribute.score = attributeObject.getInt("score");
            attribute.cost = attributeObject.getInt("cost");
            attributeList.add(attribute);
        }

        //load aptitudes
        JSONArray aptitudeArray = jsonData.getJSONArray("aptitudes");
        aptitudeList = new ArrayList<>();
        for (int i = 0; i < aptitudeArray.length(); i++)
        {
            JSONObject aptitudeObject = aptitudeArray.getJSONObject(i);
            Aptitude aptitude = new Aptitude();
            aptitude.name = aptitudeObject.getString("name");
            aptitude.mod = aptitudeObject.getInt("mod");
            aptitude.cost = aptitudeObject.getInt("cost");
            aptitude.minAttributeName = aptitudeObject.getString("min_attribute_name");
            aptitudeList.add(aptitude);
        }

        JSONArray skillArray = jsonData.getJSONArray("skills");
        skillList = new ArrayList<>();
        for (int i = 0; i < skillArray.length(); i++)
        {
            JSONObject skillObject = skillArray.getJSONObject(i);
            Skill skill = new Skill();
            skill.name = skillObject.getString("name");
            skill.type = skillObject.getString("skill");
            skillList.add(skill);
        }

    }

    public JSONObject getData()
    {
        return jsonData;
    }

    private void lockFile() throws IOException
    {
        FileChannel channel = FileChannel.open(unitCardPath, StandardOpenOption.WRITE);
        FileLock lock = channel.lock();
    }

    public void releaseLock() throws IOException
    {
        FileChannel channel = FileChannel.open(unitCardPath, StandardOpenOption.WRITE);
        FileLock lock = channel.lock();
        lock.release();
        channel.close();
    }

    public int getAttributeCost(String name)
    {
        for (Attribute attribute : attributeList)
        {
            if (attribute.name == name)
            {
                return attribute.cost;
            }
        }
        return 0;
    }

    public int getAptitudeCost(String name)
    {
        for (Aptitude aptitude : aptitudeList)
        {
            if (aptitude.name == name)
            {
                return aptitude.cost;
            }
        }
        return 0;
    }
    
}
