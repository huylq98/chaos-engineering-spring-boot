package vn.com.huylq.thirdpartyservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PaymentResponse {

    private String errorCode;
    private String errorMessage;
}
