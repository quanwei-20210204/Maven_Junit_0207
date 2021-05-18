package org.vic.csvreaderwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class ResultWriter {
    public void writeResult(List<String> resultList, File resultCSV){
        List<String> toWriteList = resultList;
        try{
            BufferedWriter writeCSV = new BufferedWriter(new FileWriter(resultCSV));
            for (int i = 0; i < toWriteList.size(); i++){
                writeCSV.write(toWriteList.get(i)+",");
                writeCSV.newLine();
            }

            writeCSV.flush();
            writeCSV.close();

        }catch(Exception e){
            System.out.println("not right.");
        }
    }
}
