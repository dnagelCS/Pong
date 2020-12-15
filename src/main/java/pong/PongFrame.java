package pong;

import javax.swing.*;
import java.awt.*;

public class PongFrame extends JFrame {

    public PongFrame(PongView pongView, PaddleKeyListener paddleListener) throws HeadlessException {
        super();
        setSize((int) Environment.WIDTH, (int) Environment.HEIGHT + 30);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pong");
        setLayout(new BorderLayout());

        add(pongView, BorderLayout.CENTER);
        addKeyListener(paddleListener);
    }
}
