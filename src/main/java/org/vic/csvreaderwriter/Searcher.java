package org.vic.csvreaderwriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Searcher {

    public List<String> searchString(List<File> sourceFilesList, String keyword){

        Matcher matcher = new Matcher();
        List<String> lineResult = new ArrayList<>();
        List<String> fileLines = new ArrayList<>();

        for(int i = 0; i < sourceFilesList.size();i++){

            fileLines = readCSVLines(sourceFilesList.get(i));
            Iterator<String> iter = fileLines.listIterator();

            String value ="";
            while (iter.hasNext()) {
                value = iter.next();

                if(matcher.isMatchedAccurate(value,keyword)){
                    lineResult.add(value);
                }

            }

        }

        return lineResult;
    }

    public List<String> searchString(List<File> sourceFilesList, String keyword, String col){
        Matcher matcher = new Matcher();
        List<String> lineResult = new ArrayList<>();
        List<String> fileLines = new ArrayList<>();
        int colNum = -1;
        //from column to index number
        fileLines = readCSVLines(sourceFilesList.get(0));
        colNum = convertColtoIndex(fileLines.get(0), col);


        for(int i = 0; i < sourceFilesList.size();i++){

            fileLines = readCSVLines(sourceFilesList.get(i));
            Iterator<String> iter = fileLines.listIterator();


            String value ="";
            while (iter.hasNext()) {
                value = iter.next();

                if(matcher.isMatchedOnCol(value,keyword,colNum)){
                    lineResult.add(value);
                }

            }

        }

        return lineResult;

    }

    public List<String> readCSVLines(File csvFile) {
        try {
            BufferedReader textFile = new BufferedReader(new FileReader(csvFile));
            List<String> resultList = new ArrayList<String>();
            String lineData = "";
            while ((lineData = textFile.readLine()) != null) {
                resultList.add(lineData);
            }

            return resultList;
        } catch (Exception ex) {
            System.out.println("wrong at readCSVLines");
        }
        return null;
    }

    public int convertColtoIndex(String header, String col) {
        if(header.contains(col)){
            String[] columnStrings = header.split(",");
            return Arrays.asList(columnStrings).indexOf(col);
        }else{
             System.out.println("no such column.");// throw exception
            return -1;
        }

    }
}
