package org.vic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CSVReadWrite {

    public void read(){
        File csv = new File("C:\\Users\\i075523\\Desktop\\temp\\CSVFolder\\read.csv");

        try{
            BufferedReader textFile = new BufferedReader(new FileReader(csv));

            String lineData = "";

            while((lineData = textFile.readLine())!= null){
                System.out.println(lineData);
            }
        }catch(Exception e){
            System.out.println("wrong");
        }

    }



}
