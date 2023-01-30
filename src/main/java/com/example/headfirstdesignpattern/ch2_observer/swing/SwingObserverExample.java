package com.example.headfirstdesignpattern.ch2_observer.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("할까? 말까?");
        button.addActionListener(event ->
                System.out.println("하지 마! 아마 후회할 걸?"));
        button.addActionListener(event ->
                System.out.println("그냥 저릴러 버려!!"));
    }

/*    class AngelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("하지 마! 아마 후회 할 걸?");
        }
    }

    class DevilListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("그냥 저질러 버렷!!!");
        }
    }*/

}
