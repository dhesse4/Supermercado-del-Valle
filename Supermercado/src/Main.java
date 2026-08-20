import java.time.LocalDate;

public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Bienvenido al Super!\n");
        Producto producto1 = new Producto("A-550", "Papas Lays", 10.25, 4);
        Producto producto2 = new Producto("B-310", "Leche LALA 6 unidades", 52.99, 4);
        Producto producto3 = new Producto("C-910", "Coca Cola 3 lts.", 19.99, 4);
        Producto producto4 = new Producto("D-470", "Zucaritas", 30.99, 4);

        Factura factura1 = new Factura(4501, LocalDate.of(2026, 8, 10), "Maria", 4);
        Factura factura2 = new Factura(3101, LocalDate.of(2025, 11, 23), "Andres", 4);
        Factura factura3 = new Factura(4001, LocalDate.of(2026, 4, 16), "Jose", 4);
        
        Producto[] productos = {producto1,producto2,producto3,producto4};

        Factura[] facturas = {factura1,factura2,factura3};

        DetalleFactura detalle1 = new DetalleFactura(productos[0], facturas[0], 5);
        DetalleFactura detalle2 = new DetalleFactura(productos[1], facturas[0], 1);
        DetalleFactura detalle3 = new DetalleFactura(productos[2], facturas[0], 1);
        DetalleFactura detalle4 = new DetalleFactura(productos[1], facturas[1], 1);
        DetalleFactura detalle5 = new DetalleFactura(productos[3], facturas[1], 3);
        DetalleFactura detalle6 = new DetalleFactura(productos[0], facturas[2], 10);
        DetalleFactura detalle7 = new DetalleFactura(productos[2], facturas[2], 3);

        System.out.println("Total de la factura no.1: " + facturas[0].calcularTotal());
        System.out.println("\nTotal de la factura no.2: " + facturas[1].calcularTotal());
        System.out.println("\nTotal de la factura no.3: " + facturas[2].calcularTotal());

        
        Producto productoMenor = sacarMinimo(productos);
        System.out.println("\nEl producto que menos genero fue:  \n" + productoMenor.toString());

        Factura facturaMayor = sacarMaximo(facturas);
        System.out.println("La factura con el mayor total fue:  \n" + facturaMayor.toString());


    }

    public static Producto sacarMinimo(Producto[] productos)
    {
        double minimo = 10000000.00;
        int posicion = -1;

        for (int i = 0; i < productos.length; i++)
        {
            if (productos[i] != null)
            {
                if (productos[i].calcularIngresosTotales() < minimo)
                {
                    minimo = productos[i].calcularIngresosTotales();
                    posicion = i;
                }
            }
        }

        return productos[posicion];
    }

    public static Factura sacarMaximo(Factura[] facturas)
    {
        double maximo = 0.0;
        int posicion = -1;

        for (int i = 0; i < facturas.length; i++)
        {
            if (facturas[i] != null)
            {
                if (facturas[i].calcularTotal() > maximo)
                {
                    maximo = facturas[i].calcularTotal();
                    posicion = i;
                }
            }
        }

        if (posicion == -1)
        {
            return null;
        }

        return facturas[posicion];
    }


}
