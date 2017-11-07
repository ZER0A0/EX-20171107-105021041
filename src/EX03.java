import javax.swing.*;

public class EX03 extends JFrame{
    public EX03(){
        initComp();
    }

    private int sw = getToolkit().getScreenSize().width;
    private int sh = getToolkit().getScreenSize().height;
    private int fw = 900 , fh = 600;

    private void initComp(){
        this.setBounds(sw / 2 - fw / 2 , sh / 2 - fh / 2 , fw , fh);

    }
}
