package Classes;

public class BuildingInfo {                                 // A class that includes building information.
    private static int storeysNum;                          // I take it out from building class to easier
    public void SetStoreysNum(int num){                     // getting this information from any other class.
        storeysNum=num;
    }
    public int GetStoreysNum(){
        return storeysNum;
    }

    private static int elevatorCapacity;                    // Same for capacity of elevator.
    public void SetElevatorCapacity(int num){
        elevatorCapacity=num;
    }
    public int GetElevatorCapacity(){
        return elevatorCapacity;
    }
}
