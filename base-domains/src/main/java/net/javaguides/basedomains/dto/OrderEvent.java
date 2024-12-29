package net.javaguides.basedomains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {
    private String message;
    private String status;
    private Order order;

    @Override
    public String toString() {
        return "OrderEvent{" +
                "message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", order=" + order +
                '}';
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public Order getOrder() {
        return order;
    }
}
