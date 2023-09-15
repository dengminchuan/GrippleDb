//-*- coding =utf-8 -*-
//@Time : 2023/9/15
//@Author: 邓闽川
//@File  GrippleDbStartUP.java
//@software:IntelliJ IDEA
package me.devedmc.grippledb;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class GrippleDbStartUp {
    public static void main(String[] args) {
        startup(args);
    }

    private static void startup(String[] args) {
        parseCommandArgs(args);
    }
    //解析命令行参数
    private static void parseCommandArgs(String[] args) {
        Options options = new Options();
        options.addOption("m",true,"set the start mod (single or cluster)");
        DefaultParser defaultParser = new DefaultParser();
        try {
            CommandLine cmd = defaultParser.parse(options, args);
            if(cmd.hasOption("m")){
                cmd.getOptionValue("m");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
