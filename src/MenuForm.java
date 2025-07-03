import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuForm extends JFrame {
    private JPanel menuPanel;
    private JButton registroButton;
    private JButton ventasButton;
    private JButton verProductosButton;

    public String codigo, nombre, detalle;
    public double precioUnitario;
    public int stock;

    public MenuForm(){
        setTitle("Menú de Opciones");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(menuPanel);
        setVisible(true);


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
