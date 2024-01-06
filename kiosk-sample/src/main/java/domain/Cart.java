package domain;

import java.util.List;

public class Cart {

    List<Order> orderList;

    public Cart(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void addOrder(Order order){
        orderList.add(order);
    }
//    public void removeOrder(Order order){
//        orderList.remove(order);
//    }
    public void cancelOrder(){
        orderList.clear();
    }

    public double calculateTotalprice(){
        double totalPrice = 0;
        for (Order order : orderList) {
            totalPrice += order.calculatePrice();
        }
        return totalPrice;
    }

}
