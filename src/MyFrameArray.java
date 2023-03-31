import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class MyFrameArray extends JFrame implements ActionListener {
    JTextArea nome=new JTextArea();
    JTextArea cognome=new JTextArea();
    JTextArea indirizzo=new JTextArea();
    JButton registra=new JButton("REGISTRATI");
    JLabel n=new JLabel("Inserisci il nome: ");
    JLabel co=new JLabel("Inserisci il cognome: ");
    JLabel i=new JLabel("Inserisci indirizzo: ");
    JTextArea risultato=new JTextArea();

    public MyFrameArray(){
        super("Modulo Registrazione");
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());

        c.add(n);
        c.add(nome);
        c.add(co);
        c.add(cognome);
        c.add(i);
        c.add(indirizzo);

        nome.setPreferredSize(new Dimension(265, 18));
        cognome.setPreferredSize(new Dimension(250, 18));
        indirizzo.setPreferredSize(new Dimension(250, 18));

        c.add(registra);
        registra.addActionListener(e -> lista());

        setSize(400,200);
        setVisible(true);
        setResizable(false);
    }

    public void lista(){
        String a[]=new String[3];
        a[0]=(nome.getText());
        a[1]=(cognome.getText());
        a[2]=(indirizzo.getText());
        System.out.println(Arrays.toString(a));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==registra){
            lista();
        }
    }
}