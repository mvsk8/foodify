package ch.zhaw.springboot.models;

public class ListRequest {
    public int purchaseId;
    public int mealId;

    public ListRequest(int purchaseId, int mealId) {
        this.purchaseId = purchaseId;
        this.mealId = mealId;
    }
}
