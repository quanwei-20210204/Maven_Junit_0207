package org.vic.csvreaderwriter;

import junit.framework.Assert;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ResultWriterTest {

    @Test
    public void writeResult() {
        ResultWriter resultWriter = new ResultWriter();
        File csvFile = new File("src/test/resources/write.csv");
        List<String> testList = new ArrayList<>();
        testList.add("First Line");
        testList.add("Second Line");
        testList.add("Third Line");
        resultWriter.writeResult(testList,csvFile);

        Searcher searcher = new Searcher();

        Assert.assertEquals(3,searcher.readCSVLines(csvFile).size());

    }
}