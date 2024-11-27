//basic UI controls
package sem4practice;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.FlowPane;
import javafx.stage.*;
public class j38 extends Application{
    public void start(Stage primaryStage){
        FlowPane fl = new FlowPane();
        Label l = new Label("Hello");
        Button b = new Button("Click Me");
        RadioButton rb1 = new RadioButton("radio 1");
        RadioButton rb2 = new RadioButton("radio 2");
        CheckBox cb1 = new CheckBox("Check a");
        CheckBox cb2 = new CheckBox("Check b");
        TextField tf = new TextField();
        TextArea ta = new TextArea();
        ComboBox comb = new ComboBox();
        ListView lv = new ListView();
        Slider sl = new Slider();
        ScrollBar sb = new ScrollBar();
        
        ToggleGroup g = new ToggleGroup();
        rb1.setToggleGroup(g);
        rb2.setToggleGroup(g);

        comb.getItems().add("a");
        comb.getItems().add("b");
        comb.getItems().add("c");

        lv.getItems().add("1");
        lv.getItems().add("2");
        lv.getItems().add("3");

        fl.getChildren().addAll(l, b, rb1, rb2, cb1, cb2, tf, ta, comb, lv, sl, sb);
        
        Scene s = new Scene(fl, 300, 450);
        primaryStage.setScene(s);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
