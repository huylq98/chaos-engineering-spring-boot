package vn.com.huylq.paymentservice.domain.port;

import vn.com.huylq.paymentservice.domain.dto.request.AccountingRequest;
import vn.com.huylq.paymentservice.domain.dto.response.AccountingResponse;

public interface AccountingPort {
    AccountingResponse executePayment(AccountingRequest request);
}
