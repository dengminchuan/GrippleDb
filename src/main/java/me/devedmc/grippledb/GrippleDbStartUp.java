//-*- coding =utf-8 -*-
//@Time : 2023/9/15
//@Author: 邓闽川
//@File  GrippleDbStartUP.java
//@software:IntelliJ IDEA
package me.devedmc.grippledb;

import lombok.extern.slf4j.Slf4j;
import me.devedmc.grippledb.startup.ClusterStartUp;
import me.devedmc.grippledb.startup.SingleStartUp;
import me.devedmc.grippledb.startup.State;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
@Slf4j
public class GrippleDbStartUp {

    private static State startUp;

    public static void main(String[] args) {
        startup(args);
    }


    private static void startup(String[] args) {
        parseCommandArgs(args);
        startUp.start();


    }
    //解析命令行参数
    private static void parseCommandArgs(String[] args) {
        Options options = new Options();
        options.addOption("m",true,"set the start mod (single or cluster)");
        DefaultParser defaultParser = new DefaultParser();
        try {
            CommandLine cmd = defaultParser.parse(options, args);
            if(cmd.hasOption("m")){
                //获取启动模式
                String mod = cmd.getOptionValue("m");
                switch (mod) {

                    case "cluster"-> {
                        startUp=new ClusterStartUp();
                    }

                    case "single"->{
                        startUp=new SingleStartUp();
                    }
                    default -> {
                        log.info("please choose right start mod");
                        System.exit(0);
                    }

                }

            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
