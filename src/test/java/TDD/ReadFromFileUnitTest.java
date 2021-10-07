package TDD;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import stepdefinitions.FileManager;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class ReadFromFileUnitTest {
    FileManager fileManager = new FileManager();
    File dummyFile = new File("C://Users//patr5//IdeaProjects//Software Testing - Integration testing persitant//src//main//resources//DummyData.csv");

    @Test
    public void Should_ReturnDataFromFile_When_Called() throws IOException {
        String fetchedFileData = fileManager.fetchAllData();
        assertEquals(FileUtils.readFileToString(dummyFile, "utf-8"), fetchedFileData);
    }


}
