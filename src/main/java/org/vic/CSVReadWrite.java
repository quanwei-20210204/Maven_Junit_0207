package org.vic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CSVReadWrite {


    public List<String> read(File csvFile,String searchValue){

            File csv = csvFile;
            int lineNum = 0;
            List<String> searchResult = new ArrayList<>();

            if(!csv.isDirectory()){

                searchResult = readCSVLines(csv,searchValue);

            }else if (csv.isDirectory()){

                File[] fileList = csv.listFiles();

                for(int i = 0; i<fileList.length; i++){
                    csv = fileList[i];
                    searchResult.addAll(readCSVLines(csv,searchValue));
                }
            }
            return searchResult;

    }

    public List<String> readCSVLines(File csvFile,String searchString) {
        try {
            BufferedReader textFile = new BufferedReader(new FileReader(csvFile));
            List<String> resultList = new ArrayList<String>();
            String lineData = "";
            while ((lineData = textFile.readLine()) != null) {
                resultList.addAll(searchString(lineData,searchString));
            }
            System.out.println(resultList);
            return resultList;
        } catch (Exception ex) {
            System.out.println("wrong at readCSVLines");
        }
        return null;
    }

    public List<String> searchString(String parentString,String childString){
        int count=0;
        int StartIndex=0;
        List<String> lineResult = new ArrayList<>();

        while(parentString.indexOf(childString,StartIndex)!=-1){
            StartIndex = parentString.indexOf(childString,StartIndex);
            StartIndex += childString.length();
            lineResult.add(childString);
        }
        return lineResult;
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
