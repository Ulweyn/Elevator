package Classes;

import java.util.ArrayList;

public class Floor {
    private int numOfFloor;
    public void SetNumOfFloor(int num) {
        numOfFloor=num;
    }
    public int GetNumOfFloor() {
        return numOfFloor;
    }
    private int amountOfAwaiting;
    public void SetAmountOfAwaiting(int num) {
        amountOfAwaiting=num;
    }
    public void SetAmountOfAwaitigRand() {
        amountOfAwaiting=(int)(Math.random()*11);
    }
    public int GetAmountOfAwaiting() {
        return amountOfAwaiting;
    }

    public ArrayList<User> awaiting;

    private void FillAwaiting() {                                                           // Функция заполнения этажа ожидающими.
        if(amountOfAwaiting!=0){
            for(int i=0;i<amountOfAwaiting;i++){
                awaiting.add(i,new User(numOfFloor));
            }

        }
    }

    public void AwaitingLog() {                                                             // Показываем сколько людей хочет вверх, сколько вниз
        int up=0;
        int down=0;
        if(awaiting!=null) {
            for(int i=0;i<awaiting.size();i++) {
                if(awaiting.get(i).GetDestination()>awaiting.get(i).GetCurrentFloor())
                    up++;
                else
                    down++;
            }
        }
        System.out.println("На этаже находится "+up+" человек, " +
                "которым нужно вверх и "+down+", которым нужно вниз");
    }

    public Floor(int numOfFloor) {
        SetNumOfFloor(numOfFloor);
        SetAmountOfAwaitigRand();
        awaiting= new ArrayList<>();
        FillAwaiting();                                                                     // В этом конструкторе заполнение этажа происходит при создании этажа.

    }
    public Floor(){}
}
