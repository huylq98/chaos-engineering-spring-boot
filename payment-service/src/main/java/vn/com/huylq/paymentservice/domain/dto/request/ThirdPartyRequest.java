package vn.com.huylq.paymentservice.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ThirdPartyRequest {

    private String payerId;
    private String payeeId;
    private BigDecimal amount;
}
