import Classes.Building;
import Classes.ElevatorActions;
import Classes.RandomNumFloors;
import Classes.Transactions;

import java.util.Scanner;

public class ElevatorRun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Building building = new Building(new RandomNumFloors().GetNum(), 5);
        while(true)                                                                                     // Цикл, в котором проходит передвижение лифта и обмен пассажирами с этажами
        {                                                                                               // Не уверен надо ли выносить его в отдельный метод, потому оставил тут.
            System.out.println("Вы на "+(building.GetElevator().GetCurrentFloor()+1) + " этаже");

            building.GetFloors().get(building.GetElevator().GetCurrentFloor()).AwaitingLog();

            new Transactions().ElevatorToFloorTransaction(building.GetElevator(),
                    building.GetFloors().get(building.GetElevator().GetCurrentFloor()));

            new Transactions().FloorToElevatorTransaction(building.GetElevator(),
                    building.GetFloors().get(building.GetElevator().GetCurrentFloor()));

            building.GetFloors().get(building.GetElevator().GetCurrentFloor()).AwaitingLog();

            if(building.GetElevator().GetDirection())
                new ElevatorActions().GoUp(building.GetElevator(),
                        building.GetFloors().get(building.GetElevator().GetCurrentFloor()));
            else
                new ElevatorActions().GoDown(building.GetElevator(),
                        building.GetFloors().get(building.GetElevator().GetCurrentFloor()));

            int a=in.nextInt();
            if(a==0)
            {
                break;                                                                                  // Просто точка остановки. Лифт в идеале не прекращает работать в принципе
            }
        }

        in.close();

    }
}
