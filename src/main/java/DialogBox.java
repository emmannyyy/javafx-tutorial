import java.io.IOException;
import java.util.Collections;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class DialogBox extends HBox {

    @FXML
    private Label dialog;

    @FXML
    private ImageView displayPicture;

    private DialogBox(String text, Image img) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainWindow.class.getResource("/view/DialogBox.fxml"));
            fxmlLoader.setController(this);
            fxmlLoader.setRoot(this);
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        dialog.setText(text);
        displayPicture.setImage(img);
    }


    private void flip() {
        ObservableList<Node> tmp = FXCollections.observableArrayList(this.getChildren());
        Collections.reverse(tmp);
        getChildren().setAll(tmp);
        setAlignment(Pos.TOP_LEFT);
    }

    public static DialogBox getUserDialog(String s, Image i) {
        DialogBox db = new DialogBox(s,i);
        //create blue background for userDialog
        BackgroundFill userBg = new BackgroundFill(
                Color.LIGHTBLUE,
                new CornerRadii(10),
                new Insets(10,10,10,10)
        );
        db.setBackground(new Background(userBg));
        return db;
    }

    public static DialogBox getDukeDialog(String s, Image i) {
        DialogBox db = new DialogBox(s,i);
        //create blue background for userDialog
        BackgroundFill dukeBg = new BackgroundFill(
                Color.LIGHTGREEN,
                new CornerRadii(10),
                new Insets(10,10,10,10)
        );
        db.setBackground(new Background(dukeBg));
        db.flip();
        return db;
    }
}



