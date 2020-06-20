package Classes;

import Interfaces.Passenger;

public class User implements Passenger {
    private int destination;                                                            // Этаж назначения
    public void SetDestination(int wantTo){
        this.destination=wantTo;
    }
    public int GetDestination(){
        return destination;
    }

    private int currentFloor;                                                           // Текущий этаж
    public void SetCurrentFloor(int currentFloor){
        this.currentFloor=currentFloor;
    }
    public int GetCurrentFloor(){
        return currentFloor;
    }
    public void SetDestinationRandom(int currentFloor){                                 // Когда пользователь создан или вышел из лифта ему нужно
        destination=currentFloor;                                                       // выбрать следующий этаж назначения. Используем эту функцию.
        while(destination==currentFloor){                                               // Меняем этаж назначения пока он не будет отличатся от текущего этажа.
            destination=(int)(Math.random()*((new BuildingInfo()).GetStoreysNum()));
        }
    }

    public User(int currentFloor) {
        SetCurrentFloor(currentFloor);
        SetDestinationRandom(currentFloor);
    }
    public User(){}


}
