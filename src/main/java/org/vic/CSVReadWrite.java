package org.vic;

import java.io.*;

public class CSVReadWrite {


    public int read(File csvFile){
        try{
            File csv = csvFile;
            int lineNum = 0;


            if(!csv.isDirectory()){
                BufferedReader textFile = new BufferedReader(new FileReader(csv));

                String lineData = "";

                while((lineData = textFile.readLine())!= null){
                    //System.out.println(lineData);
                    lineNum++;
                }
            }else if (csv.isDirectory()){
                File[] fileList = csv.listFiles();

                for(int i = 0; i<fileList.length; i++){
                    csv = fileList[i];
                    BufferedReader textFile = new BufferedReader(new FileReader(csv));

                    String lineData = "";

                    while((lineData = textFile.readLine())!= null){
                        System.out.println(lineData);
                        lineNum++;
                    }
                }

            }

            return lineNum;
        }catch(Exception e){
            System.out.println("wrong");
        }
        return -1;

    }

    public void readCSVLines(File csvFile){
        try{
            BufferedReader textFile = new BufferedReader(new FileReader(csvFile));

            String lineData = "";
            int lineNum = 0;

            while((lineData = textFile.readLine())!= null){
                //System.out.println(lineData);
                lineNum++;
            }
        }catch(Exception ex){

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
