package vn.com.huylq.accountingservice.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentRequest {

    private String paymentId;
    private String payerWalletId;
    private String payeeWalletId;
    private BigDecimal amount;
}
