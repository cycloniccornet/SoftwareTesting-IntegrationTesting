package stepdefinitions;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileManager {
    File dummyFile = new File("C://Users//patr5//IdeaProjects//Software Testing - Integration testing persitant//src//main//resources//DummyData.csv");
    public String fetchAllData() throws IOException {
        String fileData = FileUtils.readFileToString(dummyFile, "utf-8");
        return fileData;
    }
}
