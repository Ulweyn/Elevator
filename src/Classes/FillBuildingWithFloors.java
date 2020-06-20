package Classes;

import java.util.ArrayList;

public class FillBuildingWithFloors {                               // Функция заполнения здания этажами.
    public ArrayList<Floor> Fill(){
        ArrayList<Floor> floors = new ArrayList<>();
        for(int i=0;i<new BuildingInfo().GetStoreysNum();i++)
            floors.add(i, new Floor(i));
        return  floors;
    }
}
