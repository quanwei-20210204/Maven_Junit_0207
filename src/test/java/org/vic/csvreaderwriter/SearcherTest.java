package org.vic.csvreaderwriter;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SearcherTest {

    @Test
    public void searchString() {
        File csvFile = new File("src/test/resources/test.csv");
        List<File> fileList = new ArrayList<>();
        fileList.add(csvFile);
        Searcher searcher = new Searcher();
        List<String> testList = searcher.searchString(fileList,"Zhang");
        Assert.assertEquals(1,testList.size());
    }

    @Test
    public void readCSVLines() {
        File csvFile = new File("src/test/resources/test.csv");
        Searcher searcher = new Searcher();
        List<String> testList = searcher.readCSVLines(csvFile);
        Assert.assertEquals(9,testList.size());
    }
}