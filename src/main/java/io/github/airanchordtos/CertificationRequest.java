package io.github.airanchordtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CertificationRequest {

    private CertificateRequestHeader header;
    private String signature;

}
