package org.sanjay.lld.design.patterns.structural.flyweight;

import javax.swing.*;
import java.awt.*;

public class DrawingClient extends JFrame {

    private static final long serialVersionUID = -13543564325432532L;
    private final int WIDTH;
    private final int HEIGHT;

    private static final ShapeFactory.ShapeType[] shapes = {
            ShapeFactory.ShapeType.LINE,
            ShapeFactory.ShapeType.OVAL_FILL,
            ShapeFactory.ShapeType.OVAL_NOFILL
    };
    private static final Color[] colors = {Color.RED, Color.GREEN, Color.YELLOW };

    public DrawingClient(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        Container contentPane = getContentPane();

        JButton startButton = new JButton("Draw");
        final JPanel panel = new JPanel();

        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        setSize(WIDTH , HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        startButton.addActionListener((actionEvent) -> {
            Graphics g = panel.getGraphics();
            for(int i = 0; i < 20; ++i) {
                Shape shape = ShapeFactory.getShape(getRandomShape());
                shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(), getRandomHeight(), getRandomColor());
            }
        });
    }

    private Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private int getRandomHeight() {
        return (int) (Math.random() * ( HEIGHT / 10));
    }

    private int getRandomWidth() {
        return (int) (Math.random() * ( WIDTH / 10));
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    private ShapeFactory.ShapeType getRandomShape() {
        return shapes[(int) (Math.random() * shapes.length)];
    }
}
