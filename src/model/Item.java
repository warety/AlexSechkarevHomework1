package model;

public class Item {
    private String name;
    private int id;

    public Item() {
    }

    public Item(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

}
