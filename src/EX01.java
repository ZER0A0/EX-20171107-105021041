import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EX01 extends JFrame{
    public EX01(){
        initComp();
    }

    private int sw = getToolkit().getScreenSize().width;
    private int sh = getToolkit().getScreenSize().height;
    private int fw = 900 , fh = 600;

    private JLabel jla = new JLabel("OAO");
    private JButton jbt1 = new JButton("A");
    private JButton jbt2 = new JButton("W");
    private JButton jbt3 = new JButton("S");
    private JButton jbt4 = new JButton("D");
    private int jlaw = fw / 2 - 50 , jlah = fh / 2 - 100;

    private void initComp(){
        this.setBounds(sw / 2 - fw / 2 , sh / 2 - fh / 2 , fw , fh);
        this.setLayout(null);

        jla.setBounds(jlaw , jlah ,100,100);
        jla.setHorizontalAlignment(SwingConstants.CENTER);
        jbt1.setBounds(fw / 4 - 225, fh - 100 , 225 , 100);
        jbt2.setBounds(fw / 4, fh - 100 , 225 , 100);
        jbt3.setBounds(fw / 4 + 225, fh - 100 , 225 , 100);
        jbt4.setBounds(fw / 4 + 450, fh - 100 , 225 , 100);
        this.add(jla);
        this.add(jbt1);
        this.add(jbt2);
        this.add(jbt3);
        this.add(jbt4);

        jbt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jla.setBounds(jlaw-=15, jlah ,100,100);
            }
        });
        jbt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jla.setBounds(jlaw, jlah-=15,100,100);
            }
        });
        jbt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jla.setBounds(jlaw, jlah+=15 ,100,100);
            }
        });
        jbt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jla.setBounds(jlaw+=15, jlah ,100,100);
            }
        });

    }
}
