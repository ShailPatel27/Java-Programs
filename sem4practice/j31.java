//javafx basic
package sem4practice;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
public class j31 extends Application{
    public void start(Stage primaryStage){
        Button b = new Button("Click me");
        StackPane p = new StackPane();
        p.getChildren().add(b);
        Scene s = new Scene(p, 300, 250);
        primaryStage.setTitle("Demo Program");
        primaryStage.setScene(s);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
