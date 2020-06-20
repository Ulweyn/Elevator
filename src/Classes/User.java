package Classes;

import Interfaces.Passenger;

public class User implements Passenger {
    private int destination;                                                            // Destination
    public void SetDestination(int wantTo){
        this.destination=wantTo;
    }
    public int GetDestination(){
        return destination;
    }

    private int currentFloor;                                                           // Current floor
    public void SetCurrentFloor(int placedAt){
        this.currentFloor=placedAt;
    }
    public int GetCurrentFloor(){
        return currentFloor;
    }
    public int GetDestinationRandom(int currentFloor){                                  // When user was created or when he left elevator, he need
        int destination=currentFloor;                                                   // to chose destination. I've decided to make it random.
        while(destination==currentFloor){                                             // Change destination until it's no longer the same as current floor.
            destination=(int)(Math.random()*((new BuildingInfo()).GetStoreysNum()));
        }
        return destination;
    }

    public User(int currentFloor) {
        SetCurrentFloor(currentFloor);
        SetDestination(GetDestinationRandom(currentFloor));
    }
    public User(){}


}
