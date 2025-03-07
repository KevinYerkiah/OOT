import javax.swing.JFrame;
import javax.swing.JLabel;

public class helloworld extends JFrame{
    public static void main(String[] args) {
        new helloworld();

    }
    helloworld(){
        JLabel jlbhelloworld =new JLabel("Hello World");
        add(jlbhelloworld);
        this.setSize(100,100);
        //pack();
        setVisible(true);
        
    }

}