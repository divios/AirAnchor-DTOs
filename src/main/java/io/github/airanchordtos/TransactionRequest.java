package io.github.airanchordtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionRequest {

    private TransactionRequestHeader header;
    private String signature;
    private String data;

}
