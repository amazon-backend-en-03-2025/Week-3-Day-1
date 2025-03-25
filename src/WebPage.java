import java.util.Random;

public class WebPage {


    public void renderPage() {
        try {
            renderHeader();
        } catch (Exception e) {
            System.out.println("Temporary element and error occurred");
        }

        try {
            renderBody();
        } catch (Exception e) {
            System.out.println("Temporary element and error occurred");
        }

        try {
            renderFooter();
        } catch (Exception e) {
            System.out.println("Temporary element and error occurred");
        }


    }

    public void renderHeader() {
        System.out.println("This is my header");
    }

    public void renderBody() {
        System.out.println("This is my body");

    }

    public void renderFooter() {

        Random r = new Random();
        int randomNumber = r.nextInt(100);
        if (randomNumber < 50) {
            throw new RuntimeException("Sorry element not available");
        } else {
            System.out.println("This is my footer");
        }


    }


}
