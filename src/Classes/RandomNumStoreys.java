package Classes;

public class RandomNumStoreys {             // Set number of storeys is optional, so i take out this method
    public int GetNum(){                    // from building class
        return (int)(Math.random()*16+5);
    }
}
