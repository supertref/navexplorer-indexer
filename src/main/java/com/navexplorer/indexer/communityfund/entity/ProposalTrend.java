package com.navexplorer.indexer.communityfund.entity;

import lombok.Data;

@Data
public class ProposalTrend {
    private int votesYes;
    private int votesNo;
    private int segment;
    private int start;
    private int end;
    private int blocksCounted;
}
