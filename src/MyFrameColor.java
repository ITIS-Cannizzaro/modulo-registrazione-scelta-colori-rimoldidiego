import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameColor extends JFrame implements ActionListener {
    JButton red=new JButton("RED");
    JButton green=new JButton("GREEN");
    JButton blue=new JButton("BLUE");

    public MyFrameColor(){
        super("Scelta Colore");
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());

        c.add(red);
        red.addActionListener(e -> rosso());

        c.add(green);
        green.addActionListener(e -> verde());

        c.add(blue);
        blue.addActionListener(e -> blu());

        setSize(400,200);
        setVisible(true);
        setResizable(false);
    }

    public void rosso(){
        getContentPane().setBackground(Color.red);
    }

    public void verde(){
        getContentPane().setBackground(Color.green);
    }

    public void blu(){
        getContentPane().setBackground(Color.blue);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==red){
            rosso();
        }
        if(e.getSource()==green){
            verde();
        }
        if(e.getSource()==blue) {
            blu();
        }
    }
}