package model;

import java.util.ArrayList;

public class ListItems {


    private ArrayList<Item> itemList = new ArrayList<Item>();

    public ListItems() {
        itemList.add(Item.builder().id(1).name("Ноутбуки").build());
        itemList.add(Item.builder().id(2).name("ПК").build());
        itemList.add(Item.builder().id(3).name("Комплектующие").build());

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
