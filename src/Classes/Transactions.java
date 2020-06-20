package Classes;

import Interfaces.Transaction;

import java.util.ArrayList;

public class Transactions implements Transaction {

    public void ElevatorToFloorTransaction(Elevator elevator, Floor floor){
        ArrayList<User> tempPassengers= new ArrayList<>();

        if(elevator.passengers.size()!=0){
            for(int j=0;j<elevator.passengers.size();j++){
                if(elevator.passengers.get(j).GetDestination()==elevator.GetCurrentFloor()) {
                    elevator.passengers.get(j).SetDestinationRandom(elevator.GetCurrentFloor());                        // Рандомим выходящему пассажиру новый требуемый этаж
                    elevator.passengers.get(j).SetCurrentFloor(elevator.GetCurrentFloor());                             // Устанавливаем ему новый текущий этаж.
                    floor.awaiting.add(elevator.passengers.get(j));
                    elevator.SetCurrentCapacity(elevator.GetCurrentCapacity()+1);
                    System.out.println("Человек вышел из лифта. В лифте " + elevator.GetCurrentCapacity()+" места");
                }
                else
                    tempPassengers.add(elevator.passengers.get(j));
            }
            elevator.passengers=new ArrayList<>();
            elevator.passengers.addAll(0,tempPassengers);
        }
    }

    public void FloorToElevatorTransaction(Elevator elevator, Floor floor){
        ArrayList<User> tempAwaiting= new ArrayList<>();
        if(floor.awaiting!=null){
            for(int j=0;j<floor.awaiting.size() ;j++){
                if((floor.awaiting.get(j).GetCurrentFloor()<floor.awaiting.get(j).GetDestination())==
                        elevator.GetDirection() && elevator.GetCurrentCapacity()>0){
                    if(elevator.GetDirection() && floor.awaiting.get(j).GetDestination()>elevator.GetMaxFloor()){
                        elevator.SetMaxFloor(floor.awaiting.get(j).GetDestination());                                   // Смена следующего необходимого этажа в зависимости от
                    }                                                                                                   // направления движения лифта
                    if(!elevator.GetDirection() && floor.awaiting.get(j).GetDestination()<elevator.GetMaxFloor()){
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
            floor.awaiting= new ArrayList<>();
            floor.awaiting.addAll(0, tempAwaiting);
        }

    }

}
