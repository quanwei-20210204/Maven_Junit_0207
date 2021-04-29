package org.vic;

import java.io.*;

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

    public void write(){
        File writeFile = new File("C:\\Users\\i075523\\Desktop\\temp\\CSVFolder\\write.csv");

        try{
            BufferedWriter writeCSV = new BufferedWriter(new FileWriter(writeFile));
            for (int i = 0; i < 5; i++){
                writeCSV.newLine();
                writeCSV.write("new user" + i + ", male ," + (18+i));
            }

            writeCSV.flush();
            writeCSV.close();

        }catch(Exception e){
            System.out.println("not right.");
        }
    }

}
