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
@Document(collection = "communityFundProposal")
public class Proposal {
    @NotNull
    @Id
    private String id;

    @Indexed(unique=true)
    private String hash;

    private Integer version;
    private String blockHash;
    private Integer height;
    private String description;
    private Double requestedAmount;
    private Double notPaidYet;
    private Double userPaidFee;
    private String paymentAddress;
    private Long proposalDuration;
    private Integer votesYes;
    private Integer votesNo;
    private Integer votingCycle;
    private String status;
    private ProposalState state;
    private String stateChangedOnBlock;
    private Date expiresOn;
    private Date createdAt;
}
