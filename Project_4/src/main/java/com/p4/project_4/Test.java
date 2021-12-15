package com.p4.project_4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class Test extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox box = new VBox();
        var tag = new Label("Hello World");
        var color = Paint.valueOf("Red");
        tag.setTextFill(color);
        var font = Font.font(40);
        tag.setFont(font);
        box.getChildren().add(tag);
        Button b = new Button("Push Me");
        box.getChildren().add(b);
        var firstScene = new Scene(box);
        primaryStage.setScene(firstScene);
        primaryStage.setTitle("Doing more");
        primaryStage.setMinWidth(200);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
