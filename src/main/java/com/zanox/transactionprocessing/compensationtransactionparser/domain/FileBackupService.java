package com.zanox.transactionprocessing.compensationtransactionparser.domain;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import org.springframework.context.annotation.Profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Profile({"production", "staging", "development", "default"})
public class FileBackupService {

//    private static final Logger LOGGER = LoggerFactory.getLogger(FileBackupService.class);
//
//    private FileSystem fs;
//    private String path= "${sftp.backup.directory.download}";
//
//    public FileBackupService(FileSystem fs)
//    {
//        this.fs = fs;
//    }
//
//    public void save()
//    {
//        createDirectory();
//    }
//
//    private void createDirectory()
//    {
//        //==== Create folder if not exists
//        Path workingDir = fs.getWorkingDirectory();
//        Path newFolderPath= new Path(path);
//        if(!fs.exists(newFolderPath)) {
//            // Create new Directory
//            fs.mkdirs(newFolderPath);
//            LOGGER.info("Path " + path + " created...");
//        }
//    }
}
