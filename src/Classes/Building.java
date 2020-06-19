package Classes;

import java.util.ArrayList;

public class Building {
    private int storeys;
    private Elevator elevator;

    public Elevator getElevator() {
        return elevator;
    }

    private ArrayList<Floor> floors;

    public ArrayList<Floor> getFloors() {
        return floors;
    }


    public Building(int ElevNum){
        storeys = ElevNum;
        new BuildingInfo().SetStoreysNum(ElevNum);

        //elevator=new Elevator();
        System.out.println("Здание создано. \nВ здании " +storeys+" этажей");
    }


}
