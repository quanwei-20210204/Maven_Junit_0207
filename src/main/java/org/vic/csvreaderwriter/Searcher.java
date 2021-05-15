package org.vic.csvreaderwriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Searcher {

    public List<String> searchString(List<File> sourceFilesList, String keyword){

        List<String> lineResult = new ArrayList<>();
        List<String> fileLines = new ArrayList<>();
        String lineData = "";

        boolean b = true;

        for(int i = 0; i < sourceFilesList.size();i++){

            fileLines = readCSVLines(sourceFilesList.get(i));
            Iterator<String> iter = fileLines.listIterator();

            String value ="";
            while (iter.hasNext()) {
                value = iter.next();

                if(b){
                    lineResult.add(value);
                    b = false;
                }else{
                    b = true;
                }

            }

        }

        /*int StartIndex=0;

        while(parentString.indexOf(childString,StartIndex)!=-1){
            StartIndex = parentString.indexOf(childString,StartIndex);
            StartIndex += childString.length();
            lineResult.add(childString);
        }*/
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
}
