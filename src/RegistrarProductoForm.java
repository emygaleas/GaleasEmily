import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarProductoForm extends JFrame{
    private JPanel registroPanel;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JButton volverButton;
    private JTextField codigoField;
    private JTextField nombreField;
    private JTextField detalleField;
    private JTextField precioField;
    private JTextField stockField;
    
    public RegistrarProductoForm(){
        setTitle("Registrar Producto");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(registroPanel);
        setVisible(true);

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigoP = codigoField.getText();
                String nombreP = nombreField.getText();
                String detalleP = detalleField.getText();
                String precioP = precioField.getText();
                String stockP = stockField.getText();

                //validacion si están vacios
                if (codigoP.trim().isEmpty() || nombreP.trim().isEmpty() || detalleP.trim().isEmpty() || precioP.trim().isEmpty() || stockP.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Por favor, llene los campos.");
                    return;
                }

                // agregar producto si tienen precio y stock validos
                try {
                    double precioPD = Double.parseDouble(precioP); //precio Producto Double
                    int stockPI = Integer.parseInt(stockP); //stock Producto Int
                    if ((precioPD>0 && precioPD<9999.99) && (stockPI>0 && stockPI<999)){
                        JOptionPane.showMessageDialog(null,"Producto agregado correctamente.");
                        Producto p = new Producto(codigoP,nombreP,detalleP,precioPD,stockPI);
                        new MenuForm();
                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(null,"Ingrese valores válidos.");
                    }

                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"Debe ingresar números válidos.");
                }

            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                codigoField.setText("");
                nombreField.setText("");
                detalleField.setText("");
                precioField.setText("");
                stockField.setText("");
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
