import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Raan {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Application");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menu = new JMenuBar();
        JMenu menuHellCli = new JMenu("HolloCli");
        JMenuItem itemHelloEn = new JMenuItem("HelloEn");
        menuHellCli.add(itemHelloEn);
        menu.add(menuHellCli);
        JMenuItem itemHelloRu = new JMenuItem("HelloRu");
        menuHellCli.add(itemHelloRu);

        frame.setJMenuBar(menu);


        itemHelloEn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hello, world!");
            }
        });


        frame.setVisible(true);

    }
}
