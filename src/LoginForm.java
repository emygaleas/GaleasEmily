import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class LoginForm extends JFrame{
    private JPanel loginPanel;
    private JTextField usuarioField;
    private JPasswordField contraseniaField;
    private JButton ingresarButton;
    private JButton limpiarButton;

    public LoginForm(){
        setTitle("Inicio de Sesión");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(loginPanel);
        setVisible(true);

        ingresarButton.addComponentListener(new ComponentAdapter() {
        });
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuarioField.getText();
                String contrasenia = String.valueOf(contraseniaField.getPassword());

                if (usuario.trim().isEmpty() || contrasenia.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"LLENE LOS CAMPOS");
                    return;
                }

                if (usuario.equals("galeas") && contrasenia.equals("esfot123")){
                    JOptionPane.showMessageDialog(null,"ACCESO CONCEDIDO");
                    new MenuForm();
                    dispose();
                }
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuarioField.setText("");
                contraseniaField.setText("");
            }
        });
    }
}
