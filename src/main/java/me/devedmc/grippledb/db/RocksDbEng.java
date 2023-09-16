//-*- coding =utf-8 -*-
//@Time : 2023/9/16
//@Author: 邓闽川
//@File  rocksdb.java
//@software:IntelliJ IDEA
package me.devedmc.grippledb.db;

import lombok.extern.slf4j.Slf4j;
import org.rocksdb.Options;
import org.rocksdb.RocksDB;
@Slf4j
public class RocksDbEng {
    protected RocksDB rocksDB;
    public RocksDbEng(){
        RocksDB.loadLibrary();
        log.info("load rocksdb library");
    }
}
