package Classes;

public class RandomNumFloors {

    public int GetNum() {                           // Функция выдающая случайное кол-во этажей согласно условию задачи.
        return (int)(Math.random()*16+5);
    }
}
