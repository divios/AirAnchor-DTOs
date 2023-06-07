package io.github.airanchordtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionPayload {

    private String batcher_public_key;
    private CertificationRequest certificate_request;
    private CertificateResponse certificate_authority_response;
    private String nonce;
    private String data;

}
