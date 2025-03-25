public class WebBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebPage page = new WebPage();

        while (true) {
            page.renderPage();
            for (int i = 0; i < 5; i++) {
                System.out.println();
            }
            Thread.sleep(2000);
        }
    }
}
