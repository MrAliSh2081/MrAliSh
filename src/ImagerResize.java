import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImagerResize{
    public static void main(String[] args) {
        try {
            // Load the original image from file
            File input = new File("src/gui/image/super-mario-bros-animated-movie-delay.jpg");
            BufferedImage originalImage = ImageIO.read(input);

            // Resize the image to 50% of its original size
            int newWidth = (int) (originalImage.getWidth() * 0.5);
            int newHeight = (int) (originalImage.getHeight() * 0.5);
            Image resizedImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

            // Convert the resized image back to a BufferedImage for display
            BufferedImage bufferedResizedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = bufferedResizedImage.createGraphics();
            g2d.drawImage(resizedImage, 0, 0, null);
            g2d.dispose();

            // Display the resized image in a JFrame
            JFrame frame = new JFrame();
            JLabel label = new JLabel(new ImageIcon(bufferedResizedImage));
            frame.getContentPane().add(label);
            frame.pack();
            frame.setVisible(true);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
