import control.CubeControl;
import model.CubeModel;
import view.CubeView;

import javax.swing.*;

public class Main {
    private static JFrame mainForm;
    private static CubeView view;
    private static CubeModel model;
    private static CubeControl control;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                mainForm = new MainForm();
            }
        });
    }
}
