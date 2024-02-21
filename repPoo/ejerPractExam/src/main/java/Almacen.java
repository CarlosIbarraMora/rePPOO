public class Almacen extends tipoPieza{
    private tipoPieza[] tiposDePieza;
    public int maximo;
    public int cantReal;
    public Almacen(String nombre, String codigo, String pais, int existencia, float precio, int maximo, int cantReal) {
        super(nombre, codigo, pais, existencia, precio);
        this.maximo = maximo;
        this.cantReal = cantReal;
    }
    private void ordena(){

    }

    public int getCantReal() {
        return cantReal;
    }
    public void adiciona(tipoPieza tipoPieza){

    }
    public tipoPieza[] listaOrden(){

    }
    public String nombreMayor(){

    }
    public float valTotal(){

    }
    public tipoPieza[] listaPais(String pais){

    }
    public tipoPieza datosPieza(String codigo){

    }
}
