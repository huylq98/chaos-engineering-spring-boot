package vn.com.huylq.paymentservice.infrastructure.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import vn.com.huylq.paymentservice.domain.dto.request.AccountingRequest;
import vn.com.huylq.paymentservice.domain.dto.response.AccountingResponse;
import vn.com.huylq.paymentservice.domain.port.AccountingPort;
import vn.com.huylq.paymentservice.infrastructure.feign.AccountingClient;

@Component
@RequiredArgsConstructor
public class AccountingClientAdapter implements AccountingPort {

    private final AccountingClient accountingClient;

    @Override
    public AccountingResponse executePayment(AccountingRequest request) {
        return accountingClient.executeAccounting(request);
    }
}
