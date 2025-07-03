import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FacturaForm extends JFrame{
    private JPanel facturaPanel;
    private JTextField codigoField;
    private JTextField cantidadField;
    private JButton volverButton;
    private JButton calcularButton;
    private JLabel productoInfo;
    private JLabel subtotalC;
    private JLabel totalC;
    private JLabel precioInfo;

    public FacturaForm(){
        setTitle("Registrar Producto");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(facturaPanel);
        setVisible(true);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = codigoField.getText();
                String cantidad = cantidadField.getText();

                if (codigo.trim().isEmpty() || cantidad.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Por favor, llene los campos.");
                    return;
                }

                try {
                    productoInfo.setText(producto);
                    precioInfo.setText(String.valueOf(precio));
                    int cantidadP = Integer.parseInt(cantidad);
                    if (cantidadP<= stock && codigo.equals(codigoP)){
                        double iva = 0.15;
                        double subtotal = precio * iva;
                        double total = subtotal + precio;
                        subtotalC.setText(String.format("%.2f",subtotal));
                        totalC.setText(String.format("%.2f",total));
                        return;
                    }
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"Ingrese valores válidos.");
                }

            }
        });

        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MenuForm();
                dispose();
            }
        });
    }

}
