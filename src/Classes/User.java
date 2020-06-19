package Classes;

public class User {
    private int wantTo;                        // Destination
    public void SetWantTo(int wantTo){
        this.wantTo=wantTo;
    }
    public int GetWantTo(){
        return wantTo;
    }

    private int placedAt;                      // Current floor
    public void SetPlacedAt(int placedAt){
        this.placedAt=placedAt;
    }
    public int GetPlacedAt(){
        return placedAt;
    }


}
