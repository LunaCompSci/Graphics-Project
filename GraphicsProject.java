import java.awt.Color;
import java.awt.Graphics; 
public class GraphicsProject {
    public static final int LINE_INCREMENT = 7;
    public static final int PART1_DRAWING_PANEL_SIZE = 400;
    public static final int PART2_DRAWING_PANEL_SIZE = 600;
    
    public static void main(String[] args){
        Color COLOR_1 = Color.GREEN;
        Color COLOR_2 = Color.BLUE; 
        Color COLOR_3 = Color.BLACK; 
        Color COLOR_4 = Color.RED;
        
        part1(COLOR_1, COLOR_2);
        part2(COLOR_3, COLOR_4);
    }
    public static void part1(Color COLOR_1, Color COLOR_2){
        DrawingPanel panel = new DrawingPanel(PART1_DRAWING_PANEL_SIZE, PART1_DRAWING_PANEL_SIZE);
        panel.setBackground(Color.LIGHT_GRAY); 
        Graphics graphics = panel.getGraphics();        
        
        int startXLL = 0;
        int startYLL = 0;
        int endXLL = 0;
        int endYLL = 400;

        int startXLR = 0; 
        int startYLR = 400;
        int endXLR = 400;
        int endYLR = 400;

        int startXUpL = 400;
        int startYUpL = 0; 
        int endXUpL = 0;
        int endYUpL = 0;

        int startXUpR = 400;
        int startYUpR = 400; 
        int endXUpR = 400;
        int endYUpR = 0;

        for (int i = 0; i < 400; i += LINE_INCREMENT){ 
            graphics.setColor(COLOR_2); 
            graphics.drawLine(startXLL,startYLL, endXLL,endYLL);
            startYLL += LINE_INCREMENT;
            endXLL += LINE_INCREMENT;
            graphics.setColor(COLOR_1);
            graphics.drawLine(startXLR,startYLR,endXLR,endYLR);
            startXLR += LINE_INCREMENT;
            endYLR -= LINE_INCREMENT; 
            graphics.setColor(COLOR_1);
            graphics.drawLine(startXUpL,startYUpL,endXUpL,endYUpL);
            startXUpL -= LINE_INCREMENT;
            endYUpL += LINE_INCREMENT;
            graphics.setColor(COLOR_2); 
            graphics.drawLine(startXUpR,startYUpR,endXUpR,endYUpR);
            startYUpR -= LINE_INCREMENT;
            endXUpR -= LINE_INCREMENT; 
        }
    }

    public static void part2(Color COLOR_3, Color COLOR_4){
        DrawingPanel canvas = new DrawingPanel(PART2_DRAWING_PANEL_SIZE,PART2_DRAWING_PANEL_SIZE);
        Graphics graphics = canvas.getGraphics(); 
        drawString(graphics, COLOR_3, COLOR_4); 
        drawOval(graphics, COLOR_3, COLOR_4); 
    }

    public static void drawOval(Graphics graphics, Color COLOR_3, Color COLOR_4){
        graphics.setColor(COLOR_3);
        graphics.drawOval(237,157,100,100);
        graphics.drawOval(275,222,10,20);
        graphics.setColor(COLOR_4); 
        graphics.drawOval(169,287,5,5);
    }

    public static void drawString(Graphics graphics, Color COLOR_3, Color COLOR_4){
        graphics.drawLine(281,258,281,438);
        graphics.drawLine(281,308,217,345);
        graphics.drawLine(281,308,343,334);
        graphics.drawLine(283,437,211,500);
        graphics.drawLine(283,437,349,506);
        graphics.drawLine(261,188,264,208);
        graphics.drawLine(303,190,302,212);
        graphics.setColor(COLOR_4); 
        graphics.drawLine(175,195,171,275);
    }       
}
