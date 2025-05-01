package application;


import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
public class Main extends Application {
    //    basic add Varibles
    static int speed = 5;
    static int foodcolor = 0;
    static int width = 25;
    static int height = 25;
    static int foodX = 0;
    static int foodY = 0;
    static int cornersize = 30;
    static List<Corner> snake = new ArrayList<>();


    public static class Corner {
        int x;
        int y;

        public Corner(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}