package vn.com.huylq.paymentservice.domain.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("isInternal")
    private boolean isInternal;
}
