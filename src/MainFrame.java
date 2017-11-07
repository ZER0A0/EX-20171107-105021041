import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    public MainFrame(){
        initComp();
    }

    private int sw = getToolkit().getScreenSize().width;
    private int sh = getToolkit().getScreenSize().height;
    private int fw = 600 , fh = 600;

    private Container cp;

    private JButton jbt1 = new JButton("01");
    private JButton jbt2 = new JButton("02");
    private JButton jbt3 = new JButton("03");
    private JButton jbt4 = new JButton("04");
    private JButton jbt5 = new JButton("05");
    private JButton jbt6 = new JButton("06");

    private void initComp(){
        this.setBounds(sw / 2 - fw / 2 , sh / 2 - fh / 2 -100 , fw , fh);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        cp = this.getContentPane();
        cp.setLayout(new GridLayout(3,2,3,3));
        cp.add(jbt1);
        cp.add(jbt2);
        cp.add(jbt3);
        cp.add(jbt4);
        cp.add(jbt5);
        cp.add(jbt6);

        jbt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EX01 ex01 = new EX01();
                ex01.setVisible(true);
            }
        });
        jbt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EX02 ex02 = new EX02();
                ex02.setVisible(true);
            }
        });
        jbt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EX03 ex03 = new EX03();
                ex03.setVisible(true);
            }
        });
    }
}
