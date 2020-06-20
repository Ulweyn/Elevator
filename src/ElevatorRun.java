import Classes.Building;
import Classes.ElevatorActions;
import Classes.Floor;
import Classes.Transactions;

import java.util.Scanner;

public class ElevatorRun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Building building = new Building(10, 5);
        while(true)
        {
            System.out.println("Вы на "+(building.GetElevator().GetCurrentFloor()+1) + " этаже");
            building.GetFloors().get(building.GetElevator().GetCurrentFloor()).AwaitingLog();
            new Transactions().ElevatorToFloorTransaction(building.GetElevator(),
                    building.GetFloors().get(building.GetElevator().GetCurrentFloor()));
            building.GetFloors().get(building.GetElevator().GetCurrentFloor()).AwaitingLog();//Люди вышли из лифта и этаж, который им требуется поменялся. Следовательно они могут опять туда зайти и поехать дальше. Также дублируем этот лог, чтобы показать изменения в случае миграций пассажиров.
            new Transactions().FloorToElevatorTransaction(building.GetElevator(),
                    building.GetFloors().get(building.GetElevator().GetCurrentFloor()));





            if(building.GetElevator().GetDirection()==true)
                new ElevatorActions().GoUp(building.GetElevator(),
                        building.GetFloors().get(building.GetElevator().GetCurrentFloor()));
            else
                new ElevatorActions().GoDown(building.GetElevator(),
                        building.GetFloors().get(building.GetElevator().GetCurrentFloor()));

            int a=in.nextInt();
            if(a==0)
            {
                break;//Просто точка остановки. Лифт в идеале не прекращает работать в принципе
            }
        }

        in.close();

    }
}
