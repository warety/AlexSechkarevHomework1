package model;

public class OrderAndItems {
    private int id;
    private Item item;
    private Order order;

    public OrderAndItems (int id, Item item, Order order) {
        this.id = id;
        this.item = item;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
