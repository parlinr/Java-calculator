/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Geoff
 */
public class FXMLDocumentController implements Initializable {
    
    float data = 0f;//set float data
    int operation = -1;//integer set for operation
     @FXML
    private Button add;//FXML add button

    @FXML
    private Button nine;//FXML nine button

    @FXML
    private Button six;//FXML six button

    @FXML
    private Button one;//FXML one button

    @FXML
    private Button subtract;//FXML subtract button

    @FXML
    private TextField display;//FXML display button

    @FXML
    private Button seven;//FXML seven button

    @FXML
    private Button two;//FXML two button

    @FXML
    private Button three;//FXML three button

    @FXML
    private Button eight;//FXML eight button

    @FXML
    private Button zero;//FXML zero button

    @FXML
    private Button equal;//FXML equal button

    @FXML
    private Button four;//FXML four button

    @FXML
    private Button divide;//FXML divide button

    @FXML
    private Button decimal;//FXML decimal button

    @FXML
    private Button multiply;//FXML multiply button

    @FXML
    private Button five;//FXML five button
    
    @FXML
    private Button clear;//FXML clear button

    @FXML
    void handleButtonAction(ActionEvent event) {
        if (event.getSource()== one)
        { display.setText(display.getText() + "1");//set text to 1 when one button pressed
        }else if (event.getSource()== two)
        {display.setText(display.getText() + "2");//set text to 2 when two button pressed
        }else if (event.getSource()== three)
        {display.setText(display.getText() + "3");//set text to 3 when three button pressed
        }else if (event.getSource()== four)
        {display.setText(display.getText() + "4");//set text to 4 when four button pressed
        }else if (event.getSource()== five)
        {display.setText(display.getText() + "5");//set text to 5 when five button pressed
        }else if (event.getSource()== six)
        {display.setText(display.getText() + "6");//set text to 6 when six button pressed
        }else if (event.getSource()== seven)
        {display.setText(display.getText() + "7");//set text to 7 when seven button pressed
        }else if (event.getSource()== eight)
        {display.setText(display.getText() + "8");//set text to 8 when eight button pressed
        }else if (event.getSource()== nine)
        {display.setText(display.getText() + "9");//set text to 9 when nine button pressed
        }else if (event.getSource()== zero)
        {display.setText(display.getText() + "0");//set text to 0 when zero button pressed
        }else if (event.getSource()== decimal)
        {display.setText(display.getText() + ".");//set text to . when decimal button pressed
        }else if (event.getSource()== clear)
        {display.setText(" ");// set text to  when the clear button pressed
        }else if (event.getSource()== add)
        {data = Float.parseFloat(display.getText());
        operation = 1;//Addition
        display.setText("");
        }else if (event.getSource()== subtract)
        {data = Float.parseFloat(display.getText());
        operation = 2;//Subtraction
        display.setText("");
        }else if (event.getSource()== multiply)
        {data = Float.parseFloat(display.getText());
        operation = 3;//Multiplication
        display.setText("");
        }else if (event.getSource()== divide)
        {data = Float.parseFloat(display.getText());
        operation = 4;//Division
        display.setText("");
        }else if (event.getSource() == equal)
        {Float secondOperand = Float.parseFloat(display.getText());
        switch(operation){//switch statement used for math
            case 1://Addition
                Float ans = data + secondOperand;
                display.setText(String.valueOf(ans));break;
            case 2://Subtraction
                ans = data - secondOperand;
                display.setText(String.valueOf(ans));break;
            case 3://Multiplication
                ans = data * secondOperand;
                display.setText(String.valueOf(ans));break;
            case 4://Division
                ans = 0f;
                try{
                ans = data / secondOperand;
                }catch (Exception e){display.setText("Error");}
                display.setText(String.valueOf(ans));break;
        }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
