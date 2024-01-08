package domain;

import java.util.List;

public class Cart {

    List<Order> orderList;
    private int orderNumber;

    public Cart(List<Order> orderList, int i) {
        this.orderList = orderList;
        this.orderNumber = i;
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void cancelOrder() {
        orderList.clear();
        orderNumber++;
    }

    public double calculateTotalprice() {
        double totalPrice = 0;
        for (Order order : orderList) {
            totalPrice += order.getPrice();
        }
        return Double.parseDouble(String.format("%.1f", totalPrice));
    }
}
