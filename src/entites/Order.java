package entites;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment = new Date();
    private OrderStatus status;

    private Client client;
    private List<OrderItem> item = new ArrayList<>();

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdfh = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Order() {
    }

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Date getMoment() {
        return moment;
    }

    public List<OrderItem> getItem() {
        return item;
    }

    public Client getClient() {
        return client;
    }

    public void addItem(OrderItem item) {
        this.item.add(item);
    }

    public void removeItem(OrderItem item) {
        this.item.remove(item);
    }

    public Double total() {
        double sum = 0;
        for (OrderItem o : item) {
            sum += o.subTotal();
        }
        return sum;
    }
}
