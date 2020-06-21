package Classes;

public class BuildingInfo {                                             // Класс содержащий не изменяемую на протяжении действия
    private static int storeysNum;                                      // программы информацию. Облегчает доступ из объектов
    public void SetStoreysNum(int num){                                 // других классов                
        storeysNum=num;
    }              
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
