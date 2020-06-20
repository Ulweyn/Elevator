package Classes;

import java.util.ArrayList;

public class Elevator {

    private int capacity;                                                   //общая вместимость лифта
    public int GetCapacity(){
        return capacity;
    }
    private int currentFloor;
    public void SetCurrentFloor(int num){
        currentFloor=num;
    }
    public int GetCurrentFloor(){
        return currentFloor;
    }
    private int currentCapacity;                                            //сколько человек может еще зайти в лифт
    public void SetCurrentCapacity(int num){
        currentCapacity=num;
    }
    public int GetCurrentCapacity(){
        return currentCapacity;
    }
    private int maxFloor=1;                                                 // по умолчанию равен 2 этажу(сдвиг на единицу по отношению к отображаемому на экране),
                                                                            // далее будет изменятся в зависимости от заходящих пассажиров

    private boolean direction;                                              // Направление движения лифта true - вверх, false - вниз.
    public void SetDirection(boolean direction) {                           // используется только для теста
        this.direction=direction;
    }
    public boolean GetDirection() {
        return direction;
    }
    public ArrayList<User> passengers;

    public Elevator(int capacity)
    {
        this.capacity=capacity;
        currentFloor=0;                                                     //При создании лифта начинаем с первого этажа
        currentCapacity=capacity;                                           //При создании лифт пуст
        direction=true;
        passengers=new ArrayList<User>();
    }

}
