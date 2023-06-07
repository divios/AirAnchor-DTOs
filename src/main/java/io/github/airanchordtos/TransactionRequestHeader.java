package io.github.airanchordtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionRequestHeader {

    private String sender_public_key;
    private CertificationRequest certificate_request;
    private String nonce;
    private String data_sha512;

}
