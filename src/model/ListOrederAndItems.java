package model;

import java.util.ArrayList;

public class ListOrederAndItems {
    private ArrayList<OrderAndItems> orderAndItemsList = new ArrayList<OrderAndItems>();

    public ArrayList<OrderAndItems> getOrderAndItemsList() {
        return orderAndItemsList;
    }

    public void setOrderAndItemsList(ArrayList<OrderAndItems> orderAndItemsList) {
        this.orderAndItemsList = orderAndItemsList;
    }

    public void addOrderAndItemsList(OrderAndItems orderAndItems) {
        this.orderAndItemsList.add(orderAndItems);
    }
}
