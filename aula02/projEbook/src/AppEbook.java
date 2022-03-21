public class AppEbook {
    public static void main(String[] args) {
        Ebook livro = new Ebook("Programar em Java", "Deitel", 300);

        System.out.println(livro.mostrarDados());
        livro.avancarPagina();
        System.out.println(livro.getPaginaAtual());
        livro.voltarPagina();
        livro.voltarPagina();
        System.out.println(livro.getPaginaAtual());

        boolean alterou = livro.irParaPagina(400);
        if (alterou) {
            System.out.println("Foi para a pagina");
        } else {
            System.out.println("Pagina invalida");
        }
    }
}
