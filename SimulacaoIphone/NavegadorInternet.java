public interface NavegadorInternet {
    void abrirPagina(String url);
    void atualizarPagina();
    void navegarParaFrente();
    void navegarParaTras();
    void adicionarAosFavoritos(String url);
}
