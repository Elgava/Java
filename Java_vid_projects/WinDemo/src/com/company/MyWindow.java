package com.company;

import java.awt.*;
//import java.awt.Frame; instead of *
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {
    public MyWindow(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("sansSerif", Font.BOLD,18);
        Font sansSerifSmall = new Font("sansSerif", Font.BOLD, 18);
        g.setFont(sansSerifLarge);
        g.drawString("The complete Java Developer Course", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("by Tim Buchalka", 60, 100);
    }
}
