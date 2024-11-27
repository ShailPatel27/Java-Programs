//BorderPane
package sem4practice;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.*;

public class j37 extends Application{
    public void start(Stage primaryStage){
        BorderPane bp = new BorderPane();
        Button b1 = new Button("one");
        Button b2 = new Button("two");
        Button b3 = new Button("three");
        Button b4 = new Button("four");
        Button b5 = new Button("five");

        bp.setTop(b1);
        bp.setCenter(b2);
        bp.setBottom(b3);
        bp.setLeft(b4);
        bp.setRight(b5);

        Scene s = new Scene(bp, 250, 300);
        primaryStage.setScene(s);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
