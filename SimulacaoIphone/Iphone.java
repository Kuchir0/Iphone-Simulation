public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    /* interface ReprodutorMusical */
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançando para a próxima música.");
    }

    @Override
    public void retrocederMusica() {
        System.out.println("Retrocedendo para a música anterior.");
    }

    /* interface AparelhoTelefonico */
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero + "...");
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de " + numero + "...");
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Recebendo mensagem: " + mensagem);
    }

    /*  interface NavegadorInternet  */
    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void navegarParaFrente() {
        System.out.println("Navegando para a próxima página.");
    }

    @Override
    public void navegarParaTras() {
        System.out.println("Voltando para a página anterior.");
    }

    @Override
    public void adicionarAosFavoritos(String url) {
        System.out.println("Adicionando " + url + " aos favoritos.");
    }

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        
        /*  Teste ReprodutorMusical */
        meuIphone.tocarMusica();
        meuIphone.pausarMusica();
        meuIphone.avancarMusica();
        meuIphone.retrocederMusica();
        
        /*  Teste AparelhoTelefonico */
        meuIphone.fazerChamada("123456789");
        meuIphone.receberChamada("987654321");
        meuIphone.enviarMensagem("123456789", "Olá, tudo bem?");
        meuIphone.receberMensagem("Olá, estou bem!");

        /*  Teste NavegadorInternet */
        meuIphone.abrirPagina("https://github.com/Kuchir0");
        meuIphone.atualizarPagina();
        meuIphone.navegarParaFrente();
        meuIphone.navegarParaTras();
        meuIphone.adicionarAosFavoritos("https://github.com/Kuchir0");
    }
}

