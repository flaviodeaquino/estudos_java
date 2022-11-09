import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeiraTela {
    private JButton button_msg;
    JPanel panelMain;
    private JTextField textField1;

    public PrimeiraTela() {
        button_msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Hello World!");
            }
        });
    }
}
