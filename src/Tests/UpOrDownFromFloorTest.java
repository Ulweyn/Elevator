package Tests;

import Classes.User;
import Classes.UpOrDownFromFloor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UpOrDownFromFloorTest {

    @Test
    void UpOrDownTest() {

        ArrayList<User> awaiting = new ArrayList<>();
        User test = new User();
        test.SetCurrentFloor(1);
        test.SetDestination(2);
        for(int i=0;i<4;i++) {
            awaiting.add(test);
        }
        test = new User();
        test.SetCurrentFloor(1);
        test.SetDestination(0);
        for(int i=0;i<3;i++) {
            awaiting.add(test);
        }
        assertTrue(new UpOrDownFromFloor().UpOrDown(awaiting));
    }

}