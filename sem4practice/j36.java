//FlowPane
package sem4practice;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.*;
public class j36 extends Application {
    public void start(Stage primaryStage)
    {
        FlowPane fp = new FlowPane();
        Button b1 = new Button("one");
        Button b2 = new Button("two");
        Button b3 = new Button("three");
        Button b4 = new Button("four");
        Button b5 = new Button("five");

        Rectangle rect = new Rectangle(50, 50, 200, 200);

        fp.getChildren().addAll(b1, b2, b3, b4, b5, rect);

        Scene s = new Scene(fp, 250, 300);
        primaryStage.setScene(s);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
