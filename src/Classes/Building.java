package Classes;



public class Building {
    private Elevator elevator;

    public Elevator GetElevator() {
        return elevator;
    }

    /*private ArrayList<Floor> floors;

    public ArrayList<Floor> GetFloors() {
        return floors;
    }*/


    public Building(int elevNum){

        new BuildingInfo().SetStoreysNum(elevNum);
        //elevator=new Elevator();
        //new FillBuildingWithStoreys().
        System.out.println("Здание создано. \nВ здании " +new BuildingInfo().GetStoreysNum()+ " этажей");
    }


}
