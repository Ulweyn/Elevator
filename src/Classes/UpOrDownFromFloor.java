package Classes;

import java.util.ArrayList;

public class UpOrDownFromFloor {                                                        // Эта функция определяет, куда будет ехать лифт,
                                                                                        // если он будет пуст до достижения верхнего этажаб
    public boolean UpOrDown(ArrayList<User> awaiting){                                  // а на текущем этаже людям нужно ехать в разных направлениях
    int count=0;
        for (User user : awaiting) {
            if (user.GetDestination() > user.GetCurrentFloor())
                count++;
            else
                count--;
        }
	if(count<0)
            return false;
	return true;}
}
