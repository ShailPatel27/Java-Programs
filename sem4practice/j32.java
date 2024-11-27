//hbox
package sem4practice;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.application.*;
import javafx.stage.*;
public class j32 extends Application{
    public void start(Stage primaryStage){
        HBox h = new HBox();
        Button b1 = new Button("one");
        Button b2 = new Button("two");
        Button b3 = new Button("three");
        Button b4 = new Button("four");
        Button b5 = new Button("five");
        h.getChildren().addAll(b1, b2, b3, b4, b5);

        Scene s = new Scene(h, 200, 100);
        primaryStage.setScene(s);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
