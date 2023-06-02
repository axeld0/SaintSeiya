package Model.JSON;

import Model.Enum.SpecialTechniques;
import Model.Saints.AthenaSaint;
import Model.Saints.BronzeSaints;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONControler {

    public static void SetToJSON (BronzeSaints <AthenaSaint> saints)
    {
        try
        {
            JSONArray jsonArray = new JSONArray();
            for(AthenaSaint saint : saints.getBronzeSaints())
            {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("Name", saint.getName());
                jsonObject.put("Constelation", saint.getConstelation());
                jsonObject.put("Age", saint.getAge());
                jsonObject.put("Height", saint.getAge());
                jsonObject.put("Birthday", saint.getBirthday());
                jsonObject.put("Bloodtype", saint.getBloodtype());
                jsonObject.put("Birthplace", saint.getBirthplace());
                jsonObject.put("Hp", saint.getHp());
                jsonObject.put("Power", saint.getPower());
                JSONArray jsonArrayTech = new JSONArray();
                for(SpecialTechniques s : saint.getSpecialTechinques())
                {
                    jsonArrayTech.put(s.getShout());
                }
                jsonObject.put("Special Techniques" , jsonArrayTech);
                jsonArray.put(jsonObject);
                JSONSave.save(jsonArray, "Athena's Saints.");
            }
        }
        catch (JSONException e)
        {
            System.out.println("Nope.");
        }
    }
}
