package org.vic.csvreaderwriter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CSVFilesCollector {

    private List<File> filesList = new ArrayList<>();

    public List<File> collectFiles(File csvFile){
        File csv = csvFile;

        if(!csv.isDirectory()){

            filesList.add(csv);

        }else if (csv.isDirectory()){

            File[] filesArray = csv.listFiles();

            for(int i = 0; i<filesArray.length; i++){

                if(!filesArray[i].isDirectory()){

                    filesList.add(filesArray[i]);

                }else if(filesArray[i].isDirectory()){

                    collectFiles(filesArray[i]);

                }
            }

        }
        return filesList;
    }

}
