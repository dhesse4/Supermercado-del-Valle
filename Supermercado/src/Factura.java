import java.time.LocalDate;

public class Factura 
{
    private Integer numero;
    private LocalDate fecha;
    private String nombreCliente;
    private DetalleFactura[] detalles;

    public Factura
    (
        Integer numero,
        LocalDate fecha,
        String nombreCliente,
        int cantidadDetalles
    )
    {
        this.numero = numero;
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.detalles = new DetalleFactura[cantidadDetalles];
    }

    public Integer getNumero()
    {
        return this.numero;
    }
    public void setNumero(Integer numero)
    {
        this.numero = numero;
    }

    public LocalDate getFecha()
    {
        return this.fecha;
    }
    public void setFecha(LocalDate fecha)
    {
        this.fecha = fecha;
    }

    public String getNombre()
    {
        return this.nombreCliente;
    }
    public void setNombre(String nombre)
    {
        this.nombreCliente = nombre;
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

    public double calcularTotal()
    {
        double suma = 0.0; 

        for (int i = 0; i < this.detalles.length; i++) 
        {
            if (this.detalles[i] != null) 
            {
                suma += this.detalles[i].calcularSubtotal();
            }
        }

        return suma;
    }

    @Override
    public String toString() 
    {
        return "Factura:\n" +
                "Numero= " + numero + "\n" +
                "Fecha= " + fecha + "\n" +
                "Cliente= " + nombreCliente + "\n";
    }
}
