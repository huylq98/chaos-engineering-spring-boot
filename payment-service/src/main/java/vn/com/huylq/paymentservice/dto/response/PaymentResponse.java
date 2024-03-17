package vn.com.huylq.paymentservice.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PaymentResponse {

    private String errorCode;
    private String errorMessage;
}
