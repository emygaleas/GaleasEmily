import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerProductoForm extends JFrame {
    private JPanel verPanel;
    private JButton regresarButton;
    private JLabel codigoP;
    private JLabel nombreP;
    private JLabel detalleP;
    private JLabel stockP;

    public VerProductoForm(){//String codigo, String nombre, String detalle, int stock){
        setTitle("Mostrar Producto");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(verPanel);
        setVisible(true);

        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuForm();
                dispose();
            }
        });
    }
}
