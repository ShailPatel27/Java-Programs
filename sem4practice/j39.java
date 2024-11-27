package sem4practice;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.*;
public class j39 extends Application{
    public void start(Stage primaryStage){
        FlowPane fp = new FlowPane();
        Rectangle rect = new Rectangle(50, 50, 200, 200);
        fp.getChildren().add(rect);

        rect.setOnMouseClicked(e->rect.setFill(Color.RED));
        Scene s = new Scene(fp, 600, 750);
        primaryStage.setScene(s);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
