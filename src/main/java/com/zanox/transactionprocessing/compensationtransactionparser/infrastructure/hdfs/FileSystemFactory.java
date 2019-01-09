package com.zanox.transactionprocessing.compensationtransactionparser.infrastructure.hdfs;

import org.apache.commons.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;
import java.util.logging.Logger;

public class FileSystemFactory {

//    String HDFS_URI = "hdfs://namenodedns:port/user/hdfs/folder/file.csv";
//
//    public FileSystemFactory()
//    {
//
//    }
//
//    public FileSystem init()
//    {
//        // ====== Init HDFS File System Object
//        Configuration conf = new Configuration();
//        // Set FileSystem URI
//        conf.set("fs.defaultFS", HDFS_URI);
//        // Because of Maven
//        conf.set("fs.hdfs.impl", org.apache.hadoop.hdfs.DistributedFileSystem.class.getName());
//        conf.set("fs.file.impl", org.apache.hadoop.fs.LocalFileSystem.class.getName());
//        // Set HADOOP user
//        System.setProperty("HADOOP_USER_NAME", "hdfs");
//        System.setProperty("hadoop.home.dir", "/");
//        //Get the filesystem - HDFS
//        FileSystem fs = FileSystem.get(URI.create(HDFS_URI), conf);
//
//        return fs;
//    }
}
