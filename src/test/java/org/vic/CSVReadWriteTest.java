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

import static org.junit.Assert.*;

public class CSVReadWriteTest {

   /* private PrintStream originalOut;
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
    }*/

    @Test
    public void read() {
        File csvFile = new File("C:\\Users\\i075523\\Desktop\\temp\\CSVFolder\\read.csv");
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        int no = csvReadWrite.read(csvFile);
        Assert.assertEquals(8,no);
    }

    @Test
    public void read_all_files_in_directory(){
        File filePath = new File("C:\\Users\\i075523\\Desktop\\temp\\CSVFolder");
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        int no = csvReadWrite.read(filePath);
        Assert.assertEquals(12,no);

    }

    @Ignore
    public void isDirectory(){
        File filePath = new File("C:\\Users\\i075523\\Desktop\\temp\\CSVFolder");
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        boolean result = csvReadWrite.isDirectiory(filePath);
        Assert.assertEquals(true,result);
    }

    @Ignore
    public void need_show_error_message(){
            File csvFile = new File("C:\\Users\\i075523\\Desktop\\temp\\CSVFolder\\readInvalid.csv");
            CSVReadWrite csvReadWrite = new CSVReadWrite();
            int no = csvReadWrite.read(csvFile);
            //assertEquals("wrong\r\n", out.toString());
    }

    @Test
    public void write(){
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        csvReadWrite.write();
    }
}