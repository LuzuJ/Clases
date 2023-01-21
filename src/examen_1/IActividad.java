/**
 * 
 */
public interface IActividad {
    public void addAmigo();
    public void addAmigoDe();
    /**
     * Presentar los amigos
     * @param p: la personana a presentar
     * @param n: el nivel
     */
    public void showAmigos(Persona p, int n);
}
