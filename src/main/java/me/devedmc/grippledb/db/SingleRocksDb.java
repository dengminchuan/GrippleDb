//-*- coding =utf-8 -*-
//@Time : 2023/9/16
//@Author: 邓闽川
//@File  SingleRocksDb.java
//@software:IntelliJ IDEA
package me.devedmc.grippledb.db;

import lombok.extern.slf4j.Slf4j;
import org.rocksdb.Options;
import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;
@Slf4j
public class SingleRocksDb extends RocksDbEng{

    String dir="singleRocksdb";
    public SingleRocksDb(){
        Options options = new Options();
        options.setCreateIfMissing(true);
        try {
            rocksDB = RocksDB.open(options,dir);
            System.out.println(new String(rocksDB.get("123".getBytes())));
        } catch (RocksDBException e) {
            log.error("open rocksdb failed");
            throw new RuntimeException(e);
        }

    }
}
