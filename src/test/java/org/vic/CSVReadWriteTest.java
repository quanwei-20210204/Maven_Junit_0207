package org.vic;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CSVReadWriteTest {
/*
    private PrintStream originalOut;
    private OutputStream out;

    @Before
    public void setUp() throws Exception {
        originalOut = System.out;
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(originalOut);
    }
*/
    @Test
    public void read() {
        File csvFile = new File("C:\\Users\\i075523\\Desktop\\temp\\CSVFolder\\read.csv");
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        List<String> resultTest = csvReadWrite.read(csvFile,"Name");
        Assert.assertEquals(2,resultTest.size());
    }

    @Test
    public void read_all_files_in_directory(){
        File filePath = new File("C:\\Users\\i075523\\Desktop\\temp\\CSVFolder");
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        List<String> resultTest = csvReadWrite.read(filePath,"male");
        Assert.assertEquals(2,resultTest.size());

    }

    @Test
    public void need_show_error_message(){
            File csvFile = new File("C:\\Users\\i075523\\Desktop\\temp\\CSVFolder\\readInvalid.csv");
            CSVReadWrite csvReadWrite = new CSVReadWrite();
            csvReadWrite.read(csvFile,"age");
            //assertEquals("wrong at readCSVLines\r\n", out.toString());
    }

    @Test
    public void readCSVLines(){
        File csvFile = new File("C:\\Users\\i075523\\Desktop\\temp\\CSVFolder\\read.csv");
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        List<String> fileResult = csvReadWrite.readCSVLines(csvFile,"Name");
        assertEquals(2,fileResult.size());

    }
    @Test
    public void readCSVLines_Search_Chinese(){
        File csvFile = new File("C:\\Users\\i075523\\Desktop\\temp\\CSVFolder\\read.csv");
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        List<String> fileResult = csvReadWrite.readCSVLines(csvFile,"姓名");
        assertEquals(2,fileResult.size());

    }

    @Test
    public void searchString(){
        String parent = "public void Through IndexOf(String parent,String child";
        String child = "String";
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        List<String> resultTest = csvReadWrite.searchString(parent,child);
        Assert.assertEquals(2,resultTest.size());
    }

    @Test
    public void write(){
        File csvFile = new File("C:\\Users\\i075523\\Desktop\\temp\\CSVFolder\\write.csv");
        List<String> list = new ArrayList<>();
        list.add("Name"); list.add("Name");
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        csvReadWrite.write(list,",");
        List<String> testList = csvReadWrite.readCSVLines(csvFile,"Name");
        Assert.assertEquals(2,testList.size());
    }
}