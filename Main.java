import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {

  private static void createAndShowGUI() {

    JFrame jFrame = new JFrame("About pets)");
    jFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
    jFrame.setSize(400, 450);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label1 = new JLabel("Hello, I'm Andrii");
    label1.setHorizontalAlignment(JLabel.CENTER);
    label1.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
    jFrame.add(label1);
    
        JLabel label = new JLabel("My lovely dog, GO TO WALK");
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
    jFrame.add(label);

    JLabel photo1 = new JLabel(new ImageIcon("retriever-puppy.gif"));
    //https://replit.com/@AndrieiShievch4/my-app#dogsleep.gif;
    photo1.setHorizontalAlignment(JLabel.CENTER);
    jFrame.add(photo1);

    JButton button = new JButton("NO");
    button.setHorizontalAlignment(JButton.CENTER);
    button.setPreferredSize(new Dimension(250, 50));
    button.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
    jFrame.add(button);

    JButton buttonYES = new JButton("YES");
    buttonYES.setHorizontalAlignment(JButton.CENTER);
    buttonYES.setPreferredSize(new Dimension(250, 50));
    buttonYES.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
    jFrame.add(buttonYES);
    
    JButton button2 = new JButton("Back");
    button2.setHorizontalAlignment(JButton.CENTER);
    button2.setPreferredSize(new Dimension(250, 50));
    button2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
    

    JLabel photo2 = new JLabel(new ImageIcon("dog1.gif"));
    //JLabel photo2 = new JLabel(new ImageIcon("cute-cartoon.gif"));
    photo2.setHorizontalAlignment(JLabel.CENTER);
    photo2.setPreferredSize(new Dimension(320, 350));
    
  
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label.setText("GO TO A WALK(((((");
        jFrame.add(photo2);
        photo1.setVisible(false);
        button.setVisible(false);
        buttonYES.setVisible(false);
        buttonYES.setVisible(false);
        label1.setVisible(false);
        jFrame.add(button2);
      }
            
    });
    
    buttonYES.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label.setText("A WALK)))");
        jFrame.add(photo2);
        photo1.setVisible(false);
        button.setVisible(false);
        buttonYES.setVisible(false);
        buttonYES.setVisible(false);
        label1.setVisible(false);
        jFrame.add(button2);
      }

       
    });
   

    jFrame.setVisible(true);
  }

  public static void main(String[] args) {
    createAndShowGUI();
  }
}