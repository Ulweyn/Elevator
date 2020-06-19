package Classes;

import java.util.ArrayList;

public class Elevator {

    private int capacity=5;//общая вместимость лифта
    public int GetCapacity()
    {
        return capacity;
    }
    private int currentFloor;

    private int currentCapacity;//сколько человек может еще зайти в лифт
    private int maxFloor=1;//по умолчанию равен 2 этажу(сдвиг на единицу по отношению к отображаемому на экране), далее будет изменятся в зависимости от заходящих пассажиров
    private boolean direction;//Направление движения лифта true - вверх, false - вниз.
    public void SetDirection(boolean direction)//используется только для теста
    {
        this.direction=direction;
    }
    public boolean GetDirection(){
        return direction;
    }
    public ArrayList<User> passengers;

}
