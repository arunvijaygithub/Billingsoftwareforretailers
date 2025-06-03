package in.arunpandiyan.billingsoftware.service;

import com.razorpay.RazorpayException;
import in.arunpandiyan.billingsoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
