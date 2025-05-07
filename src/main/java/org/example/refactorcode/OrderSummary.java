package org.example.refactorcode;

public class OrderSummary {

    private Order order;
    private final ReportGenerator reportGenerator;

    private OrderSummary(Order order, String customer) {
        this.order = order;
        reportGenerator = new ReportGenerator();
    }

    void print(String customerName) {
        reportGenerator.printHeader(customerName);
        for (String item : order.items) {
            reportGenerator.printLineItem(item);
        }
        reportGenerator.printTotal(order.total);
    }

}
