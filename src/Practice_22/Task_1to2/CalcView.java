package Practice_22.Task_1to2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CalcView {
    public void updateResult(JTextField example, Double result){
        example.setText(String.valueOf(result));
    }
}

