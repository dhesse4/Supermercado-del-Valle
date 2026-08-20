public class DetalleFactura 
{
    private Producto producto;
    private Factura factura;
    private Integer cantidad;

    public DetalleFactura
    (
        Producto producto,
        Factura factura,
        Integer cantidad
    )
    {
        this.producto = producto;
        this.factura = factura;
        this.cantidad = cantidad;

        this.producto.agregarDetalles(this);
        this.factura.agregarDetalles(this);
    }

    public Producto geProducto()
    {
        return this.producto;
    }
    public void setProducto(Producto producto)
    {
        this.producto = producto;
    }

    public Factura getFactura()
    {
        return this.factura;
    }
    public void setFactura(Factura factura)
    {
        this.factura = factura;
    }

    public Integer getCantidad()
    {
        return this.cantidad;
    }
    public void setCantidad(Integer cantidad)
    {
        this.cantidad = cantidad;
    }

    public Double calcularSubtotal()
    {
        return this.cantidad * this.producto.getPrecioBase();
    }
}
