public class Producto {
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    //Obtener el nombre del producto
    public String getNombre() {
        return nombre;
    }

    //obtener la cantidad del producto
    public int getCantidad() {
        return cantidad;

    }
    //obtener el precio del producto
    public double getPrecio() {
        return precio;
    }

    //Cambiar la cantidad del producto
    public void setCantidad() {
        this.cantidad = cantidad;
    }

    public void setPrecio() {
        this.precio = precio;
    }

    //metodos
    public void reducirCantidad(int cantidadVendida) {
        if (cantidadVendida <= cantidad) {
            this.cantidad -= cantidadVendida;
        }
    }

    public void aumentarCantidad(int cantidadExtra) {
        this.cantidad += cantidadExtra;
    }

    //Sobrecarga
    @Override
    public String toString() {
        return nombre + " - Cantidad: " + cantidad + " - Precio: $" + precio;
    }
}
