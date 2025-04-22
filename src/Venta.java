import java.util.HashMap;

public class Venta {
    private HashMap<Producto, Integer> productosVendidos;

    public Venta() {
        productosVendidos = new HashMap<>();
    }

    public void agregarProductoVendido(Producto producto, int cantidad) {
        productosVendidos.put(producto, cantidad);
        producto.reducirCantidad(cantidad);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productosVendidos.keySet()) {
            int cantidad = productosVendidos.get(p);
            total += cantidad * p.getPrecio();
        }
        return total;
    }

    public void mostrarVenta() {
        System.out.println("Resumen de la venta:");
        for (Producto p : productosVendidos.keySet()) {
            int cantidad = productosVendidos.get(p);
            System.out.println(p.getNombre() + " x" + cantidad + " = $" + (cantidad * p.getPrecio()));
        }
        System.out.println("Total: $" + calcularTotal());
    }
}
