import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProducto(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public void mostrarProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public void mostrarProductosBajoStock(int limite) {
        for (Producto p : productos) {
            if (p.getCantidad() <= limite) {
                System.out.println("⚠ Producto con poco stock: " + p);
            }
        }
    }

    public void reducirStock(String nombre, int cantidad) {
        Producto p = buscarProducto(nombre);
        if (p != null) {
            if (p.getCantidad() >= cantidad) {
                p.reducirCantidad(cantidad);
                System.out.println("\nStock reducido exitosamente.");
            } else {
                System.out.println("\nError: Stock insuficiente para el producto " + nombre);
            }
        } else {
            System.out.println("\nError: Producto no encontrado.");
        }

    }

    public void aumentarStock(String nombre, int cantidad) {
        Producto p = buscarProducto(nombre);
        if (p != null) {
            p.aumentarCantidad(cantidad);
            System.out.println("\nStock aumentado exitosamente.");
        } else {
            System.out.println("\nError: Producto no encontrado.");
        }
    }
}