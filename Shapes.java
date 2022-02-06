public class Shapes {
    public static void main(String[] args) {
        int x = 100;
        int y = 100;
        int width = 50;

        // Draw a red square
        Window.out.background("white");
        Window.out.color("red");
        Window.out.square(x, y, width);

        // Draw a single frame for a static image
        Window.frame();
    }
}
