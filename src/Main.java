import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/* This is the main class to initialize the graphic eidit software
 * and loading the FXML files and its controllers' objects.*/
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/designPaint.fxml"));
        primaryStage.setTitle("Paint");
        primaryStage.getIcons().add(new Image("file:icons/logo.png"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setMinWidth(1000);
        primaryStage.setMinHeight(700);
        primaryStage.show();
    }

    /*Launches the application.*/
    public static void main(String[] args) {
        launch(args);
    }
}