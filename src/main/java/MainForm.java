import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JMenuBar mainMenu;

    public MainForm() {
        setSize(500, 546);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        createMenu();
        createWorkPanel();

        revalidate();
    }

    private void createMenu() {
        mainMenu = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        mainMenu.add(menuFile);
        JMenuItem menuFileExit = new JMenuItem("Exit");
        menuFile.add(menuFileExit);
        menuFileExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setJMenuBar(mainMenu);
    }
    private void createWorkPanel() {

    }
}
