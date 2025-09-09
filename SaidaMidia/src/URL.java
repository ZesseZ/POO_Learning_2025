import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class URL {
        String url = "https://youtube.com/shorts/LmkzPhaW-t4?si=_cScSDeVUqNYQ2Hk";

        public void openUrl() {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                try {

                    URI uri = new URI(url);

                    Desktop.getDesktop().browse(uri);

                    System.out.println("O navegador foi aberto com sucesso!");

                } catch (IOException | URISyntaxException e) {
                    e.printStackTrace();
                    System.err.println("Erro ao tentar abrir o link.");
                }
            } else {
                System.err.println("Ação de navegação não é suportada no seu sistema.");
            }
        }
    }