import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;

public class test extends JFrame{
    JPanel nPanel = new JPanel();
    JLabel quote = new JLabel("Never a question of would I, should I, kiss my son on the forehead and kiss your ass goodbye");
    JButton mButton = new JButton("I guess");
    public static void main(String[] args){
        new test();
    }

    public test(){
        this.setSize(640,480);
        //this.setLocationRelativeTo(null);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dm = tk.getScreenSize();
        int xPos = (dm.width / 2) - (this.getWidth() / 2);
        int yPos = (dm.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos,yPos);
        this.setTitle("End");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mButton.setBounds(200,200,300,900);
        quote.setToolTipText("As luck would have it, I settled into the role of the good guy");
        ListenForButton lForButton = new ListenForButton();
        mButton.addActionListener(lForButton);
        nPanel.add(quote);
        nPanel.add(mButton);
        this.add(nPanel);
        this.setVisible(true);
    }
    private class ListenForButton implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== mButton){
                quote.setText("Luck is on your side");
            }
        }
    }
}
