/*
 * Copyright (c) 2018. Garvit Kothari
 */

package Main.gui;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class s1controller implements Initializable{

    public String fname;
    public  String fileName;

    @FXML
    private ResourceBundle resources;

    @FXML
    public Label lbl;

    @FXML
    private URL location;

    @FXML
    private Button button1;

    @FXML
    void onClickFileChose(ActionEvent event) throws IOException, InvalidFormatException {

        JFileChooser chooser=new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Excel Files Only", "csv", "xlsx", "xls");
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        File f =chooser.getSelectedFile();
        String filename= f.getAbsolutePath();
        fileName=filename;
        fname=f.getName();
        lbl.setText(filename);



    }


@FXML
public FXMLLoader fxmlLoader;
    @FXML
    void onClick(ActionEvent event) throws IOException{
        fxmlLoader= new FXMLLoader(getClass().getResource("diff_s2.fxml"));
        Parent root= fxmlLoader.load();
        s2controller s2 = fxmlLoader.getController();
        s2.loadFName((String)fname, (String)fileName);

        Scene scene=new Scene(root, 700, 500);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }





    @Override
    public void initialize(URL location, ResourceBundle resources) {



    }
}
