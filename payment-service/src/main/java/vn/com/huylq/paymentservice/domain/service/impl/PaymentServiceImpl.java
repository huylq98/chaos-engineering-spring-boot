package vn.com.huylq.paymentservice.domain.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import vn.com.huylq.paymentservice.domain.dto.request.AccountingRequest;
import vn.com.huylq.paymentservice.domain.dto.request.PaymentRequest;
import vn.com.huylq.paymentservice.domain.dto.request.ThirdPartyRequest;
import vn.com.huylq.paymentservice.domain.dto.response.AccountingResponse;
import vn.com.huylq.paymentservice.domain.dto.response.PaymentResponse;
import vn.com.huylq.paymentservice.domain.dto.response.ThirdPartyResponse;
import vn.com.huylq.paymentservice.domain.port.AccountingPort;
import vn.com.huylq.paymentservice.domain.port.ThirdPartyPort;
import vn.com.huylq.paymentservice.domain.service.PaymentService;

@Service
@RequiredArgsConstructor
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    private final AccountingPort accountingPort;
    private final ThirdPartyPort thirdPartyPort;

    @Override
    public PaymentResponse processPayment(PaymentRequest request) {
        if (request.isInternal()) {
            return handleInternalPayment(request);
        }
        return handleExternalPayment(request);
    }

    private PaymentResponse handleInternalPayment(PaymentRequest request) {
        try {
            AccountingRequest accountingRequest = AccountingRequest.builder()
                    .payerId(request.getPayerId())
                    .payeeId(request.getPayeeId())
                    .amount(request.getAmount())
                    .build();
            AccountingResponse accountingResponse = accountingPort.executePayment(accountingRequest);
            return PaymentResponse.builder()
                    .errorCode(accountingResponse.getErrorCode())
                    .errorMessage(accountingResponse.getErrorMessage())
                    .build();
        } catch (Exception e) {
            log.error("Error while processing payment request", e);
            return PaymentResponse.builder()
                    .errorCode(e.getClass().getSimpleName())
                    .errorMessage(e.getMessage())
                    .build();
        }
    }

    private PaymentResponse handleExternalPayment(PaymentRequest request) {
        try {
            ThirdPartyRequest thirdPartyRequest = ThirdPartyRequest.builder()
                    .payerId(request.getPayerId())
                    .payeeId(request.getPayeeId())
                    .amount(request.getAmount())
                    .build();
            ThirdPartyResponse thirdPartyResponse = thirdPartyPort.executePayment(thirdPartyRequest);
            return PaymentResponse.builder()
                    .errorCode(thirdPartyResponse.getErrorCode())
                    .errorMessage(thirdPartyResponse.getErrorMessage())
                    .build();
        } catch (Exception e) {
            log.error("Error while processing payment request", e);
            return PaymentResponse.builder()
                    .errorCode(e.getClass().getSimpleName())
                    .errorMessage(e.getMessage())
                    .build();
        }
    }
}
