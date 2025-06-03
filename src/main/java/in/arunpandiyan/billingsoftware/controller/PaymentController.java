package in.arunpandiyan.billingsoftware.controller;

import com.razorpay.RazorpayException;
import in.arunpandiyan.billingsoftware.io.OrderResponse;
import in.arunpandiyan.billingsoftware.io.PaymentRequest;
import in.arunpandiyan.billingsoftware.io.PaymentVerificationRequest;
import in.arunpandiyan.billingsoftware.io.RazorpayOrderResponse;
import in.arunpandiyan.billingsoftware.service.OrderService;
import in.arunpandiyan.billingsoftware.service.RazorpayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final RazorpayService razorpayService;
    private final OrderService orderService;

    @PostMapping("/create-order")
    @ResponseStatus(HttpStatus.CREATED)
    public RazorpayOrderResponse createRazorpayOrder(@RequestBody PaymentRequest request) throws RazorpayException {
        return razorpayService.createOrder(request.getAmount(), request.getCurrency());
    }

    @PostMapping("/verify")
    public OrderResponse verifyPayment(@RequestBody PaymentVerificationRequest request) {
        return orderService.verifyPayment(request);
    }
}
