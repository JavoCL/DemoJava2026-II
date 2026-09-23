package Biblioteca;

public class Periodico extends Recurso implements Mostrable
{
    // region ATRIBUTOS

    private String empresa;
    private int paginas;
    private int precio;

    // endregion

    // region GETTERS Y SETTERS

    public String getEmpresa() {
        return empresa;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // endregion

    // region CONSTRUCTORES

    public Periodico(String nuevoId, String nuevoTitulo, String nuevaFecha,
                     String nuevaEmpresa, int nuevasPaginas, int nuevoPrecio) throws ParametroVacioException, FormatoFechaException
    {
        super(nuevoId, nuevoTitulo, nuevaFecha);

        this.setEmpresa(nuevaEmpresa);
        this.setPaginas(nuevasPaginas);
        this.setPrecio(nuevoPrecio);
    }

    // endregion

    // region METODOS

    @Override
    public void Mostrar()
    {
        String mensaje = "El periódico se mostró a un usuario. Lo debe devolver al termino del día al encargado.";
    }

    @Override
    public String toString() {
        return "Periodico{" +
                "empresa='" + empresa + '\'' +
                ", paginas=" + paginas +
                ", precio=" + precio +
                '}';
    }



    /* --------------------------------------------
    METODOS EJEMPLO PARA CADENA DE EXCEPCIONES

    public void MetodoEjemplo1() throws ParametroVacioException, FormatoFechaException
    {
        // ....
        // ....
        // ....
        // ....

        this.setFecha("20/01/88");
    }

    public void MetodoEjemplo2() throws ParametroVacioException, FormatoFechaException
    {
        // ....
        // ....
        // ....// ....

        // ....

        MetodoEjemplo1();

    }*/

    // endregion
}
