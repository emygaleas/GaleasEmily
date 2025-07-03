public class Producto {
    public String codigo, nombre, detalle;
    public double precioUnitario;
    public int stock;

    public Producto(String codigo, String nombre, String detalle, double precioUnitario, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.detalle = detalle;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }
}
