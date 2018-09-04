package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;

public class Main extends Application {

    public Stage stage;
    Parent root;

    @Override
    public void start(Stage primaryStage) throws Exception{
    stage=primaryStage;
        root = FXMLLoader.load(getClass().getResource("jPick_s1.fxml"));
        primaryStage.setTitle("SRMIST Question Paper Generator");
        primaryStage.getIcons().add(new Image("Main/res/icon.png"));
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();


    }


    public static void main(String[] args) throws IOException, InvalidFormatException {
        launch(args);







        }
    }

