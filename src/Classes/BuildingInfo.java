package Classes;

public class BuildingInfo {                                             // Класс содержащий не изменяемую на протяжении действия
    private static int storeysNum;                                      // программы информацию. Облегчает дотступ из объектов
    public void SetStoreysNum(int num){                     
        storeysNum=num;
    }              // других классов
    public int GetStoreysNum(){
        return storeysNum;
    }

    private static int elevatorCapacity;
    public void SetElevatorCapacity(int num){
        elevatorCapacity=num;
    }
    public int GetElevatorCapacity(){
        return elevatorCapacity;
    }
}
