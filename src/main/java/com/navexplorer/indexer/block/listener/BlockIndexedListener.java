package com.navexplorer.indexer.block.listener;

import com.navexplorer.indexer.address.indexer.AddressIndexer;
import com.navexplorer.indexer.block.entity.Block;
import com.navexplorer.indexer.block.event.BlockIndexedEvent;
import com.navexplorer.indexer.block.indexer.SignalIndexer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class BlockIndexedListener implements ApplicationListener<BlockIndexedEvent> {
    @Autowired
    SignalIndexer signalIndexer;

    @Autowired
    AddressIndexer addressIndexer;

    @Override
    public void onApplicationEvent(BlockIndexedEvent event) {
        Block block = event.getBlock();

        signalIndexer.indexBlock(block);
        addressIndexer.indexBlock(block);
    }
}
