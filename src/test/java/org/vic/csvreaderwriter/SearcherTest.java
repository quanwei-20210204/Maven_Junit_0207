package org.vic.csvreaderwriter;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SearcherTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

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
    public void searchString_On_Column() {
        File csvFile = new File("src/test/resources/testcol.csv");
        List<File> fileList = new ArrayList<>();
        fileList.add(csvFile);
        Searcher searcher = new Searcher();
        List<String> testList = searcher.searchString(fileList,"male","gender");
        //System.out.println(testList);
        Assert.assertEquals(2,testList.size());
    }


    @Test    //(expected=RuntimeException.class)
    public void searchString_On_Column_should_show_error() {
        File csvFile = new File("src/test/resources/testcol.csv");
        List<File> fileList = new ArrayList<>();
        fileList.add(csvFile);
        Searcher searcher = new Searcher();
        //exception.expect(RuntimeException.class);
        exception.expectMessage("no such column");
        List<String> testList = searcher.searchString(fileList,"male","error");
    }

    @Test
    public void readCSVLines() {
        File csvFile = new File("src/test/resources/test.csv");
        Searcher searcher = new Searcher();
        List<String> testList = searcher.readCSVLines(csvFile);
        Assert.assertEquals(9,testList.size());
    }
}