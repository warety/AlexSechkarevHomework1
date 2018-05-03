package model;

import java.util.ArrayList;

public class ListItems {


    private ArrayList<Item> itemList = new ArrayList<Item>();

    public ListItems() {
        itemList.add(new Item(1, "Ноутбуки"));
        itemList.add(new Item(2,"ПК"));
        itemList.add(new Item(3,"Комплектующие"));

    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }
}
