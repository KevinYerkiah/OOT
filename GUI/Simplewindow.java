
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Simplewindow implements ActionListener{
    private int count=0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    public Simplewindow(){
        frame = new JFrame();
        panel =new JPanel();
        JButton button=new JButton("Click Me");
        button.setPreferredSize(new Dimension(200,50));
        button.addActionListener(this);
        label =new JLabel("Num Of Clicks: 0");

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(label);

        frame.add(panel,BorderLayout.CENTER);
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();   
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new Simplewindow();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        count=count+1;
        label.setText("Num Of Clicks: "+count);



    }
}