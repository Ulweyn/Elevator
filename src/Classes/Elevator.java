package Classes;

import java.util.ArrayList;

public class Elevator {

    private int currentFloor;
    public void SetCurrentFloor(int num){
        currentFloor=num;
    }
    public int GetCurrentFloor(){
        return currentFloor;
    }
    private int currentCapacity;                                                // Сколько человек может еще зайти в лифт
    public void SetCurrentCapacity(int num){
        currentCapacity=num;
    }
    public int GetCurrentCapacity(){
        return currentCapacity;
    }

    private int maxFloor=1;                                                     // По умолчанию равен 2 этажу(сдвиг на единицу по отношению к отображаемому на экране),
    public void SetMaxFloor(int num){                                       // далее будет изменятся в зависимости от заходящих пассажиров
        maxFloor=num;
    }
    public int GetMaxFloor(){
        return maxFloor;
    }

    private boolean direction;                                                  // Направление движения лифта true - вверх, false - вниз.
    public void SetDirection(boolean direction) {                           // используется только для теста
        this.direction=direction;
    }
    public boolean GetDirection() {
        return direction;
    }

    public ArrayList<User> passengers;

    public Elevator()
    {

        currentFloor=0;                                                         // При создании лифта начинаем с первого этажа.
        currentCapacity=new BuildingInfo().GetElevatorCapacity();               // При создании лифт пуст.
        direction=true;
        passengers=new ArrayList<>();
    }

}
