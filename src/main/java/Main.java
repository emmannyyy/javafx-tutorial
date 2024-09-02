import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.image.Image; //for images
import javafx.scene.layout.Region;

import java.io.IOException;

public class Main extends Application {

    //add Duke
    //private Duke duke = new Duke();

    @Override
    public void start(Stage stage) { //stage is the primary stage that JavaFX provides
        try {
            //FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            //AnchorPane ap = fxmlLoader.load();
            MainWindow mainWindow = new MainWindow(stage);
            Scene scene = new Scene(mainWindow);
            stage.setScene(scene);
            //fxmlLoader.<MainWindow>getController().setDuke(duke);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
