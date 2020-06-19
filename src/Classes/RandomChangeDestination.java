package Classes;

public class RandomChangeDestination {

    public int GetDestination(int currentFloor){                                        // When user left elevator, he need to chose new destination. I decide to make it randomly.
        int destination=currentFloor;
        while(destination==currentFloor)                                                // Change destination until it's no longer the same as current floor.
        {
            destination=(int)(Math.random()*((new BuildingInfo()).GetStoreysNum()));
        }
        return destination;
    }
}
