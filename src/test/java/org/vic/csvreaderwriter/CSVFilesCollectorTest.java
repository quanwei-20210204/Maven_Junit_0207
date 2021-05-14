package org.vic.csvreaderwriter;

import junit.framework.Assert;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.junit.Assert.*;

public class CSVFilesCollectorTest {

    @Test
    public void collectFiles() {
        File csvFile = new File("src/test/resources");
        CSVFilesCollector collector = new CSVFilesCollector();
        List<File> filesList = collector.collectFiles(csvFile);
        Assert.assertEquals(3,filesList.size());
    }

}