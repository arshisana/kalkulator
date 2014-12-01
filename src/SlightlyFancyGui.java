/**
 *  Created by Tonje Stolpestad on 01.12.14
 */

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SlightlyFancyGUI extends JFrame implements ActionListener{
    JPanel myPanel;
    JButton myButton;
    JLabel myLabel;

    public SlightlyFancyGUI(){
        //constructor
        myPanel = new JPanel();
        myButton = new JButton("OK");
        // myButton.addActionListener(this);
        myLabel = new JLabel();

        myPanel.add(myButton);
        myPanel.add(myLabel);
        this.add(myPanel);

    }

    @Override
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == myButton){
            myLabel.setText("My Button Clicked");
        }
    }


}
