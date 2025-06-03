package in.arunpandiyan.billingsoftware.service;

import in.arunpandiyan.billingsoftware.io.OrderRequest;
import in.arunpandiyan.billingsoftware.io.OrderResponse;
import in.arunpandiyan.billingsoftware.io.PaymentVerificationRequest;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {

    OrderResponse createOrder(OrderRequest request);

    void deleteOrder(String orderId);

    List<OrderResponse> getLatestOrders();

    OrderResponse verifyPayment(PaymentVerificationRequest request);

    Double sumSalesByDate(LocalDate date);

    Long countByOrderDate(LocalDate date);

    List<OrderResponse> findRecentOrders();
}
