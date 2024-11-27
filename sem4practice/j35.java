//GridPane
package sem4practice;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.*;

public class j35 extends Application{
    public void start(Stage primaryStage){
        GridPane gp = new GridPane();
        Button b1 = new Button("one");
        Button b2 = new Button("two");
        Button b3 = new Button("three");
        Button b4 = new Button("four");
        Button b5 = new Button("five");
        
        gp.add(b1, 0, 0);
        gp.add(b2, 0, 1);
        gp.add(b3,1, 0);
        gp.add(b4, 1, 1);
        gp.add(b5, 2, 0);
        

        Scene s = new Scene(gp, 250, 300);
        primaryStage.setScene(s);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
