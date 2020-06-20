package Classes;


import java.util.ArrayList;

public class Building{
    private Elevator elevator;

    public Elevator GetElevator(){
        return elevator;
    }

    private ArrayList<Floor> floors;

    public ArrayList<Floor> GetFloors(){
        return floors;
    }


    public Building(int numFloors, int elevCapacity){

        new BuildingInfo().SetStoreysNum(numFloors);
        new BuildingInfo().SetElevatorCapacity(elevCapacity);
        elevator=new Elevator();
        floors = new FillBuildingWithFloors().Fill();
        System.out.println("Здание создано. \nВ здании " +new BuildingInfo().GetStoreysNum()+ " этажей");
    }
    public Building(){}


}
