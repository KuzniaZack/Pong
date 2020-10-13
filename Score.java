package Pong;

import java.awt.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Score extends Rectangle{

    static int game_width;
    static int game_height;
    int player1;
    int player2;

    Score(int height, int width){
        Score.game_height = height;
        Score.game_width = width;


    }

    public void draw(Graphics g){
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));
        g.drawLine(500, 0, 500, game_height);

        g.drawString(String.valueOf(player1/10) + String.valueOf(player1%10), 250, 50);
        g.drawString(String.valueOf(player2/10) + String.valueOf(player2%10), 750, 50);

    }
}
