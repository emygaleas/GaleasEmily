import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuForm extends JFrame {
    private JPanel menuPanel;
    private JButton registroButton;
    private JButton ventasButton;
    private JButton verProductosButton;
    private JLabel txtUsuario;

    public MenuForm(String usuario){
        setTitle("Menú de Opciones");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(menuPanel);
        setVisible(true);

        txtUsuario.setText(usuario);


        registroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RegistrarProductoForm();
                dispose();
            }
        });

        ventasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FacturaForm();
                dispose();
            }
        });

        verProductosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VerProductoForm();
                dispose();
            }
        });
    }
}
