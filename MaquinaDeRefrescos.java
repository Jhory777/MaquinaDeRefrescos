public class MaquinaDeRefrescos
{
    // Colocar Los Métodos de las propiedades de la clase
    private int costo;
    private int cantidad;
    private int caja;

    public MaquinaDeRefrescos()
    {
    // Inicializar los valores 
    // this referencia a las propiedades
    
    this.costo = 0;
    this.cantidad = 0;
    this.caja = 0;
    
    }
    
    public MaquinaDeRefrescos(int costo, int cantidad, int caja)
    {
        this.costo = costo;
        this.cantidad = cantidad;
        this.caja = caja;
    }
    // Get obtenga datos y devuelva datos
    public int getCosto()
    {
        return costo;
    }
    // Set para actualizar datos 
    public void setCosto(int costo)
    {
        this.costo = costo;
    }
    
    public int getCantidad()
    {
        return cantidad;
    }
    
    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }
    
    public int getCaja()
    {
        return caja;
    }
    
    public void setCaja(int caja)
    {
        this.caja = caja;
    }
    // solicitar refresco dentro de los metodos
    
    public void solicitarRefresco(int dinero)
    {
        if (dinero == this.getCosto() ){
            // entrega del refresco previa verificacion 
            // verificar si hay refrescos 
            if (this.getCantidad() >0) {
                //Entrega del refresco 
                this.setCantidad(getCantidad() - 1);
                this.setCaja(this.getCaja() + dinero);
                System.out.println("..............................");
                System.out.println("Recoje tu refresco");
                System.out.println("Gracias por tu compra");
                System.out.println("..............................");
            }
            else{
                System.out.println("..............................");
                System.out.println("Lo siento, ya no hay refrescos");
                System.out.println("..............................");
            }
        }
        else{
            // implementacion de que la moneda sea diferente a los 5 bs 
            System.out.println("................");
            System.out.println("El costo del refresco es;"+this.getCosto());
            System.out.println("Puedes intentar con otra moneda");
            System.out.println("................");
        }
    }
    
    public void actualizarPrecio(int nuevoCosto)
    {
        this.setCosto(nuevoCosto);
        System.out.println("..............................");
        System.out.println("El costo se actualizó a $"+ this.getCosto());
        System.out.println("..............................");
    }
    
    public void llenarMaquina(int cantidad)
    {
        this.setCantidad(this.getCantidad() + cantidad);
        System.out.println("..............................");
        System.out.println("La maquina tiene" + this.getCantidad() + "refrescos");
        System.out.println("..............................");
    }
    
    public void mostrarEstado()
    {
        System.out.println("..............................");
        System.out.println("Estado de la Maquina");
        System.out.println("Costo del refresco: "+ this.getCosto());
        System.out.println("Cantida de refrescos: "+ this.getCantidad());
        System.out.println("Monto en caja: "+ this.getCaja());
        System.out.println("..............................");
    }
    
}

    
 
