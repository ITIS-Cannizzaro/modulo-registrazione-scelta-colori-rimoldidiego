import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class MyFrameArrayList extends JFrame implements ActionListener {
    JTextArea nome=new JTextArea();
    JTextArea cognome=new JTextArea();
    JTextArea indirizzo=new JTextArea();
    JButton registra=new JButton("REGISTRATI");
    JButton stampa=new JButton("STAMPA");
    JLabel n=new JLabel("Inserisci il nome: ");
    JLabel co=new JLabel("Inserisci il cognome: ");
    JLabel i=new JLabel("Inserisci indirizzo: ");
    JTextArea risultato=new JTextArea();
    ArrayList list=new ArrayList<String>();

    public MyFrameArrayList(){
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

        c.add(stampa);
        stampa.addActionListener(e -> stampa());

        setSize(400,200);
        setVisible(true);
        setResizable(false);
    }

    public void lista(){
        list.add(nome.getText());
        list.add(cognome.getText());
        list.add(indirizzo.getText());
    }

    public void stampa(){
        System.out.println(list);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==registra){
            lista();
        }
        if(e.getSource()==stampa){
            stampa();
        }
    }
}