public class Producto 
{
    private String codigo;
    private String nombre;
    private Double precioBase;
    private DetalleFactura[] detalles;

    public Producto
    (
        String codigo,
        String nombre,
        Double precioBase,
        int cantidadDetalles)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.detalles = new DetalleFactura[cantidadDetalles];
    }

    public String getCodigo()
    {
        return this.codigo;
    }
    public void setCodigo(String code)
    {
        this.codigo = code;
    }

    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Double getPrecioBase()
    {
        return this.precioBase;
    }
    public void setPrecioBase(Double precio)
    {
        this.precioBase = precio;
    }

    public DetalleFactura[] getDetalles()
    {
        return this.detalles;
    }
    public void setDetalles(DetalleFactura[] detalle)
    {
        this.detalles = detalle;
    }

    public void agregarDetalles(DetalleFactura detalle) 
    {
        for (int i = 0; i < this.detalles.length; i++) 
        {
            if (this.detalles[i] == null) 
            {
                this.detalles[i] = detalle;
                return;
            }
        }
    }

    public double calcularIngresosTotales()
    {
        double ingresos = 0.0;

        for (int i = 0; i < this.detalles.length; i++)
        {
            if (this.detalles[i] != null)
            {
                ingresos += this.detalles[i].calcularSubtotal();
            }
        }

        return ingresos;
    }

    @Override
    public String toString() 
    {
        return "Producto:\n" +
                "Codigo= " + codigo + "\n" +
                "Nombre= " + nombre + "\n" +
                "Precio Base= " + precioBase + "\n";
    }

    
}
