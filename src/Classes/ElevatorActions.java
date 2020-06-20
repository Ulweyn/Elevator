package Classes;

public class ElevatorActions {
    public void GoUp(Elevator elevator, Floor floor)
    {
        if(elevator.GetCurrentFloor()==new BuildingInfo().GetStoreysNum()-1 ||
                (elevator.passengers.size()==0 && !new UpOrDownFromFloor().UpOrDown(floor.awaiting))){
            elevator.SetDirection(!elevator.GetDirection());                                                        // Меняем направление движения лифта
            System.out.println("Теперь вы направляетесь вниз");
        }
        else {
            if(elevator.GetCurrentFloor()==elevator.GetMaxFloor() &&
                    elevator.GetCurrentCapacity()==new BuildingInfo().GetElevatorCapacity() &&
                    !new UpOrDownFromFloor().UpOrDown(floor.awaiting) &&
                    elevator.GetCurrentFloor()!=new BuildingInfo().GetStoreysNum()) {
                elevator.SetMaxFloor(elevator.GetMaxFloor() + 1);
            }
            elevator.SetCurrentFloor(elevator.GetCurrentFloor()+1);                                            // Либо движемся дальше

        }
    }

    public void GoDown(Elevator elevator, Floor floor)
    {


        if(elevator.GetCurrentFloor()==0 || (elevator.passengers.size()==0 &&
                new UpOrDownFromFloor().UpOrDown(floor.awaiting))) {
            elevator.SetDirection(!elevator.GetDirection());                                                        // Меняем направление движения лифта
            System.out.println("Теперь вы направляетесь вверх");
        }
        else {
            if(elevator.GetCurrentFloor()==elevator.GetMaxFloor() &&
                    elevator.GetCurrentCapacity()==new BuildingInfo().GetElevatorCapacity() &&
                    !new UpOrDownFromFloor().UpOrDown(floor.awaiting) && elevator.GetCurrentFloor()!=0) {
                elevator.SetMaxFloor(elevator.GetMaxFloor() - 1);
            }
            elevator.SetCurrentFloor(elevator.GetCurrentFloor()-1);                                            // Либо движемся дальше

        }
    }

}
