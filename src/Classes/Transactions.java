package Classes;

import java.util.ArrayList;

public class Transactions {

    public void ElevatorToFloorTransaction(Elevator elevator, Floor floor){
        ArrayList<User> tempPassengers= new ArrayList<User>();

        if(elevator.passengers.size()!=0){
            for(int j=0;j<elevator.passengers.size();j++){
                if(elevator.passengers.get(j).GetDestination()==elevator.GetCurrentFloor()) {
                    elevator.passengers.get(j).SetDestination(elevator.GetCurrentFloor());//рандомим выходящему пассажиру новый требуемый этаж
                    elevator.passengers.get(j).SetCurrentFloor(elevator.GetCurrentFloor());
                    floor.awaiting.add(elevator.passengers.get(j));
                    elevator.SetCurrentCapacity(elevator.GetCurrentCapacity()+1);;
                    System.out.println("Человек вышел из лифта. В лифте " + elevator.GetCurrentCapacity()+" места");
                }
                else
                    tempPassengers.add(elevator.passengers.get(j));
            }
            elevator.passengers=new ArrayList<User>();
            elevator.passengers.addAll(0,tempPassengers);
        }
    }

    public void FloorToElevatorTransaction(Elevator elevator, Floor floor){
        ArrayList<User> tempAwaiting= new ArrayList<User>();
        if(floor.awaiting!=null){
            for(int j=0;j<floor.awaiting.size() ;j++){
                if((floor.awaiting.get(j).GetCurrentFloor()<floor.awaiting.get(j).GetDestination())==
                        elevator.GetDirection() && elevator.GetCurrentCapacity()>0){
                    if(elevator.GetDirection()==true && floor.awaiting.get(j).GetDestination()>elevator.GetMaxFloor()){
                        elevator.SetMaxFloor(floor.awaiting.get(j).GetDestination());
                    }
                    if(elevator.GetDirection()==false && floor.awaiting.get(j).GetDestination()<elevator.GetMaxFloor()){
                        elevator.SetMaxFloor(floor.awaiting.get(j).GetDestination());
                    }
                    elevator.passengers.add(floor.awaiting.get(j));
                    elevator.SetCurrentCapacity(elevator.GetCurrentCapacity()-1);
                    System.out.println("Человек зашел в лифт. Ему нужно на "+
                            (elevator.passengers.get(elevator.passengers.size()-1).GetDestination()+1)+
                            " этаж. Осталось " + elevator.GetCurrentCapacity()+" места");
                }
                else
                    tempAwaiting.add(floor.awaiting.get(j));
            }
            floor.awaiting= new ArrayList<User>();
            floor.awaiting.addAll(0, tempAwaiting);
        }

    }

}
