package ni.edu.uam.evaluacion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

        @Override
        public void start(Stage stage) {
            cambiarVentana(stage, "/sistema/view/menu.fxml", "Menú Principal");
        }

        public static void cambiarVentana(Stage stage, String fxmlPath, String titulo) {
            try {
                FXMLLoader loader = new FXMLLoader(MainApp.class.getResource(fxmlPath));
                Parent root = loader.load();
                stage.setTitle(titulo);
                stage.setScene(new Scene(root));
                stage.centerOnScreen();
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            launch(args);
        }
    }
}
