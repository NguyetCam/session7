package assignment7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("assignment7.fxml"));
        primaryStage.setTitle("Assignment 7 - Nguyệt Cầm");
        primaryStage.setScene(new Scene(root, 600, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
