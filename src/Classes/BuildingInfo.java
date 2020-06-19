package Classes;

public class BuildingInfo {                     // Класс включающий в себя информацию о здании.
    private static int storeysNum;
    public void SetStoreysNum(int num){
        storeysNum=num;
    }
    public int GetStoreysNum(){
        return storeysNum;
    }
}
