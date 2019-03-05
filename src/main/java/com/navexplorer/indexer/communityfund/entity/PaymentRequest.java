package com.navexplorer.indexer.communityfund.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@Document(collection = "communityFundPaymentRequest")
public class PaymentRequest {
    @NotNull
    @Id
    String id;

    private Integer version;

    @Indexed(unique=true)
    private String hash;

    private String blockHash;

    @Indexed
    private String proposalHash;

    private String description;

    private Double requestedAmount;

    private Integer votesYes;

    private Integer votesNo;

    private Integer votingCycle;

    @Indexed
    private PaymentRequestState state;

    private String status;

    private String stateChangedOnBlock;

    private String paidOnBlock;

    @Indexed
    private Date createdAt;
}
