package io.github.airanchordtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CertificateResponse {

    private String ca_pub_key;
    private String signature;

}
