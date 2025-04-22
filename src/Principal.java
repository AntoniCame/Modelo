public class Principal {
    public static void main(String[] args) {
        // Crear inventario
        Inventario inventario = new Inventario();

        // Agregar productos
        Producto p1 = new Producto("Pan", 10, 1.50);
        Producto p2 = new Producto("Leche", 5, 2.00);
        Producto p3 = new Producto("Huevos", 20, 0.30);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);

        // Mostrar inventario actual
        System.out.println("Inventario actual:");
        inventario.mostrarProductos();

        //Reducir stock
        inventario.reducirStock("Huevos", 16);

        //Añadir mas stock
        inventario.aumentarStock("Leche", 2);


        // Simular una venta
        Venta venta1 = new Venta();
        venta1.agregarProductoVendido(p1, 2); // Vendemos 2 panes
        venta1.agregarProductoVendido(p2, 4); // Vendemos 1 leche

        System.out.println("\nVenta realizada:");
        venta1.mostrarVenta();

        // Mostrar inventario actualizado
        System.out.println("\nInventario después de la venta:");
        inventario.mostrarProductos();

        // Verificar productos con stock bajo
        System.out.println("\nProductos con poco stock:");
        inventario.mostrarProductosBajoStock(4); // Límite de alerta: 4 unidades
    }
}