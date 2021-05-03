package org.vic;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CSVReadWrite {


    public int read(File csvFile,String searchValue){
        try{
            File csv = csvFile;
            int lineNum = 0;


            if(!csv.isDirectory()){

                lineNum = readCSVLines(csv,searchValue);

            }else if (csv.isDirectory()){

                File[] fileList = csv.listFiles();

                for(int i = 0; i<fileList.length; i++){
                    csv = fileList[i];
                    lineNum += readCSVLines(csv,searchValue);
                }
            }
            return lineNum;
        }catch(Exception e){
            System.out.println("wrong");
        }
        return -1;
    }

    public int readCSVLines(File csvFile,String searchString) {
        try {
            BufferedReader textFile = new BufferedReader(new FileReader(csvFile));
            String lineData = "";
            int times = 0;
            while ((lineData = textFile.readLine()) != null) {
                times += searchString(lineData,searchString);
            }
            System.out.println(times);
            return times;
        } catch (Exception ex) {
            System.out.println("wrong");
        }
        return -1;
    }

    public int searchString(String parentString,String childString){
        int count=0;
        int StartIndex=0;

        while(parentString.indexOf(childString,StartIndex)!=-1){
            StartIndex = parentString.indexOf(childString,StartIndex);
            StartIndex += childString.length();
            count++;
        }
        return count;
    }

    public void readCSVLines_(File csvFile,String regex) {
        try {
            regex = "[N][a]";
            BufferedReader textFile = new BufferedReader(new FileReader(csvFile));
            Pattern pattern = Pattern.compile(regex);
            String lineData = "NameHello";
            Matcher matcher = pattern.matcher(lineData);
            System.out.println(matcher.find());
            //regex = "[1-9]\\d{4,14}";
            regex = "[N]*";

            System.out.println();



            //System.out.println(lineData.matches(regEx));
            //System.out.println(matcher.matches());

            int lineNum = 0;
/*
            while ((lineData = textFile.readLine()) != null) {
                Matcher matcher = pattern.matcher(lineData);
                boolean rs = matcher.matches();
                System.out.println(rs);
            }*/
        } catch (Exception ex) {

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
