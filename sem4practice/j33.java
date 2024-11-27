//VBox
package sem4practice;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.*;
import javafx.application.*;
public class j33 extends Application {
    public void start(Stage primaryStage){
        VBox v = new VBox();
        Button b1 = new Button("one");
        Button b2 = new Button("two");
        Button b3 = new Button("three");
        Button b4 = new Button("four");
        Button b5 = new Button("five");
        v.getChildren().addAll(b1, b2, b3, b4, b5);

        Scene s = new Scene(v, 250, 300);
        primaryStage.setScene(s);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
