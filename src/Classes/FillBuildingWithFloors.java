package Classes;

import java.util.ArrayList;

public class FillBuildingWithFloors {
    public ArrayList Fill(){
        ArrayList<Floor> floors = new ArrayList<Floor>();
        for(int i=0;i<new BuildingInfo().GetStoreysNum();i++)
            floors.add(i, new Floor(i));
        return  floors;
    }
}
