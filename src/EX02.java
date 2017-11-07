import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;

public class EX02 extends JFrame{
    public EX02(){
        initComp();
    }

    private int sw = getToolkit().getScreenSize().width;
    private int sh = getToolkit().getScreenSize().height;
    private int fw = 900 , fh = 600;

    private JLabel jla = new JLabel("OAQ");
    private JButton jbtB = new JButton("+++");
    private JButton jbtS = new JButton("---");

    private void initComp(){
        this.setBounds(sw / 2 - fw / 2 , sh / 2 - fh / 2 , fw , fh);
        this.setLayout(null);

        jla.setBackground(Color.GREEN);
        jla.setBounds(fw / 2 - 50 , fh / 2 - 50 , 100 , 100);
        jla.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(jla);
    }
}
