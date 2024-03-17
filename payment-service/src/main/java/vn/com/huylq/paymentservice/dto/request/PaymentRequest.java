package vn.com.huylq.paymentservice.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@Data
public class PaymentRequest {

    private String paymentId;
    private String payerId;
    private String payeeId;
    private BigDecimal amount;
}
