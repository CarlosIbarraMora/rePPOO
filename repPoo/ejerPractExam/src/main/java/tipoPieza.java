public class tipoPieza {
    protected String nombre;
    protected String codigo;
    protected String pais;
    protected int existencia;
    protected float precio;

    public tipoPieza(String nombre, String codigo, String pais, int existencia, float precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.pais = pais;
        this.existencia = existencia;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getPais() {
        return pais;
    }

    public int getExistencia() {
        return existencia;
    }

    public float getPrecio() {
        return precio;
    }
}
