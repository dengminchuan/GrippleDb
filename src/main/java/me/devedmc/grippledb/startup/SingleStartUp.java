//-*- coding =utf-8 -*-
//@Time : 2023/9/16
//@Author: 邓闽川
//@File  SingleStartUp.java
//@software:IntelliJ IDEA
package me.devedmc.grippledb.startup;

import lombok.extern.slf4j.Slf4j;
import me.devedmc.grippledb.db.SingleRocksDb;

/**
 * 单例模式启动
 */
@Slf4j
public class SingleStartUp extends State{

    private SingleRocksDb rocksDb=new SingleRocksDb();
    @Override
    public void start() {
        log.info("startup grippleDb with single");
    }
}
