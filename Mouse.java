public class Mouse {
    public static void main(String[] args) {
        for (;;) {
            Window.out.background("white");

            // Get mouse input
            int x = Window.mouse.getX();
            int y = Window.mouse.getY();

            // Draw ball over mouse location
            Window.out.color("red");
            Window.out.circle(x, y, 50);

            Window.frame();
        }
    }
}
