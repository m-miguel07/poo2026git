public class item {
    /*
    ===============
    == ATRIBUTOS ==
    ===============
    */

     int    codigo; 
    String descripcion;
    prifloat  stock_min;
    private float  stock_act;
    private float  precio;
    /*
    =================
    == CONSTRUCTOR == - Recibe los datos leidos y los "ensambla" en el objeto,
    =================   basicamente asignar los campos de un registro en función de parametros de entrada
    */

    public item (int codigo, String descripcion, float stock_min, float stock_act, float precio) {
        this.codigo      = codigo;
        this.descripcion = descripcion;
        this.stock_min   = stock_min;
        this.stock_act   = stock_act;
        this.precio      = precio;
    }

    /*
    =============
    == METODOS ==
    =============
    */

    public int obtener_codigo() {
        return this.codigo;
    }
    
}
