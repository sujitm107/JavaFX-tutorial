package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setTitle("Hello World");
        //primaryStage.setScene(new Scene(root, 300, 275));
        //primaryStage.show();

        //create UI elements
        //button.setOnAction
        //put UI elements into layout
        //create the scene and put the layout in the scene

        //scene1

        Label label1 = new Label("This is scene1");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e-> primaryStage.setScene(scene2));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);

        //scene 2

        Button button2 = new Button("Go to scene 1!");
        button2.setOnAction(e-> primaryStage.setScene(scene1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout2, 300, 300);

        primaryStage.setScene(scene2);
        primaryStage.setTitle("This is a title");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }

}
