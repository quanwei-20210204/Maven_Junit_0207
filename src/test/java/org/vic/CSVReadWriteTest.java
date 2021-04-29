package org.vic;

import org.junit.Test;

import static org.junit.Assert.*;

public class CSVReadWriteTest {

    @Test
    public void read() {
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        csvReadWrite.read();
    }

    @Test
    public void write(){
        CSVReadWrite csvReadWrite = new CSVReadWrite();
        csvReadWrite.write();
    }
}