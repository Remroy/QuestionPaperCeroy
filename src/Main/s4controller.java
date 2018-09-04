package Main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.ResourceBundle;



public class s4controller implements Initializable {

    @FXML
    String fname;

    public void countWorksheet(String filename, String testName, Integer setNumber, int diffPercentage)
    {
        fname=filename;
        System.out.println("File Name:"+fname+"\n Test Name:" + testName  + "\nSet Number:" + setNumber +"\nDifficulty Percentage:"+diffPercentage);
        //Excel Print in Console for Test
       /* try
        {
            File file = new File(filename);
            Workbook wb= WorkbookFactory.create(new FileInputStream(file));
            System.out.println("Number of Sheets:" + wb.getNumberOfSheets());
        }catch (Exception e)
        {
            System.out.println(e);
        }
       System.out.println("\n" + filename);*/
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
