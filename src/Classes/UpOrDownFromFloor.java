package Classes;

import java.util.ArrayList;

public class UpOrDownFromFloor {

    public boolean UpOrDown(ArrayList<User> awaiting){
    int count=0;
	for(int i=0;i<awaiting.size();i++){
        if(awaiting.get(i).GetDestination()>awaiting.get(i).GetCurrentFloor())
            count++;

        else
            count--;
    }
	if(count<0)
            return false;
	return true;}
}
