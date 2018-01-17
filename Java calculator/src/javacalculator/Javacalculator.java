/*
 * Geoffrey Robinson
 * 
 * Problem: Design a calculator with buttons that functions
 * 
 */
package javacalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Geoff
 */
public class javacalculator extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));//Using the FXML document
        
        Scene scene = new Scene(root,Color.TRANSPARENT);// Creating the scene
        
        stage.setScene(scene);//Setting the scene
        stage.show();//Setting the stage
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
