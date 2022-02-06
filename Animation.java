public class Animation {
    public static void main(String[] args) {
        // Give the window a size
        Window.size(800, 600);

        // Animation over 1000 frames
        for (int i = 0; i < 1000; i++) {

            // Clear the frame
            Window.out.background("white");

            Window.out.color("red");
            Window.out.circle(i, i, 50);

            // 10 milliseconds between each frame
            Window.frame(10);
        }
    }
}
