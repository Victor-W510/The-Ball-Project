import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
    private Timer time;
    private JButton Start, End;
    private JPanel myPanel, myPanelTwo;
    private final int Width = 10, Height =10;
    private final int xOriginal = 400, yOriginal = 360;
    private final int getWindowWidth = 800, getWindowHeight = 800;
    Ball b1 = new Ball() , b2 = new Ball(),b3 = new Ball(), b4 = new Ball();
    Ball b5 = new Ball(),b6 = new Ball(), b7 = new Ball(), b8 = new Ball();
    private double AngleWine = 267,  AngleRed = 266, AngleOrange = 265, AngleYellow = 264;
    private double AngleGreen = 263, AngleLightBlue = 262,  AngleBlue = 262, AngleDarkBlue = 262 ;
    

    public Window() {
        this.panel();
        this.panel2();
        this.add(myPanelTwo,BorderLayout.SOUTH);
        this.add(myPanel,BorderLayout.NORTH);
        this.createButton();
        this.create();
        this.setVisible(true);
    }
    public void create (){ 
        // crate  Window*/
        setSize(getWindowWidth,getWindowHeight);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My Amaz-Balls");

        time = new Timer(7,this);
        time.start();
        setResizable(false);
    }
    public void panel2 (){ 
        // Lower Panel + The circle 
        myPanelTwo = new JPanel(){
            @Override
            public void paint (Graphics g ){

               Graphics2D g2 = (Graphics2D) g;

               // Set background " canvas" To Dark Gray
                g2.setColor(Color.DARK_GRAY);
                g2.fillRect(0,0,getWindowWidth,getWindowHeight);

                // Draw the big Circle (520x520), set Color to black
                g2.setColor(Color.BLACK);
                g2.setStroke(new BasicStroke(5));
                g2.drawOval(140,100, 520 , 520);

                //Draw the Vertical line (260 long)
                g2.setStroke(new BasicStroke(3));
                g2.drawRect(400,100,2,260);

                // Draw the Balls
                g2.setColor(new Color(102,0,0));
                g2.fillOval(xOriginal + b1.Cos(225,AngleWine), yOriginal + b1.Sin(225,AngleWine), Width,Height);

                g2.setColor(Color.RED);
                g2.fillOval(xOriginal + b2.Cos(200,AngleRed), yOriginal + b2.Sin(200,AngleRed), Width,Height);

                g2.setColor(Color.ORANGE);
                g2.fillOval(xOriginal + b3.Cos(175,AngleOrange), yOriginal + b3.Sin(175,AngleOrange), Width,Height);

                g2.setColor(Color.YELLOW);
                g2.fillOval(xOriginal + b4.Cos(150,AngleYellow), yOriginal + b4.Sin(150,AngleYellow), Width,Height);

                g2.setColor(Color.GREEN);
                g2.fillOval(xOriginal + b5.Cos(125,AngleGreen), yOriginal + b5.Sin(125,AngleGreen), Width,Height);

                g2.setColor(new Color(51,153,255));
                g2.fillOval(xOriginal + b6.Cos(100,AngleLightBlue), yOriginal + b6.Sin(100,AngleLightBlue), Width,Height);

                g2.setColor(Color.BLUE);
                g2.fillOval(xOriginal + b7.Cos(75,AngleBlue), yOriginal + b7.Sin(75,AngleBlue), Width,Height);

                g2.setColor(new Color(0,0,153));
                g2.fillOval(xOriginal + b8.Cos(50,AngleDarkBlue), yOriginal + b8.Sin(50,AngleDarkBlue), Width,Height);

            }
        };
        myPanelTwo.setPreferredSize(new Dimension(getWindowWidth,getWindowHeight-(getWindowHeight/10)));
    }
    public void panel (){ 
        // Top panel with the Buttons
        
        myPanel = new JPanel();
        myPanel.setPreferredSize(new Dimension(getWindowWidth,getWindowHeight/10));
        myPanel.setLayout(null);
        myPanel.setBackground(Color.DARK_GRAY);

    }
    public void createButton(){

        Start = new JButton("Start");
        Start.setBounds(150,15,200,40);
        Start.addActionListener(this);
        Start.setForeground(Color.BLUE);
        myPanel.add(Start);

        End = new JButton("Pause");
        End.setBounds(450,15,200,40);
        End.setForeground(Color.RED);

        End.addActionListener(this);
        myPanel.add(End);
        //this is a good :)

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        // change direction;
        // Wine 

        if (b1.getbX() > 2 && b1.getbX() < 7 && b1.getbY() == -224){
            AngleWine = -84;
            b1.speed = -b1.speed;
        }
        if (b1.getbX() < -2 && b1.getbX() > -7 && b1.getbY() == -224){
            AngleWine = 267;
            b1.speed = -b1.speed;
        }
        AngleWine = AngleWine - b1.speed;


        // Red 
        if (b2.getbX() > 2 && b2.getbX() < 7 && b2.getbY() == -199){
            AngleRed = -84;
            b2.speed = -b2.speed;
        }
        if (b2.getbX() < -2 && b2.getbX() > -7 && b2.getbY() == -199){
            AngleRed = 266;
            b2.speed = -b2.speed;
        }
        AngleRed = AngleRed - b2.speed;


        // Orange 
        if (b3.getbX() > 2 && b3.getbX() < 7  && b3.getbY() == -174){
            AngleOrange = -83;
            b3.speed = -b3.speed;
        }
        if (b3.getbX() < -2 && b3.getbX() > -7 && b3.getbY() == -174){
            AngleOrange = 265;
            b3.speed = -b3.speed;
        }
        AngleOrange = AngleOrange - b3.speed;

        //Yellow
        if (b4.getbX() > 2 && b4.getbX() < 7  && b4.getbY() == -149){
            AngleYellow = -82;
            b4.speed = -b4.speed;
        }
        if (b4.getbX() < -2 && b4.getbX() > -7 && b4.getbY() == -149){
            AngleYellow = 264;
            b4.speed = -b4.speed;
        }
        AngleYellow = AngleYellow - b4.speed;

        //Green
        if (b5.getbX() > 2 && b5.getbX() < 7 && b5.getbY() == -124){
            AngleGreen = -81;
            b5.speed = -b5.speed;
        }
        if (b5.getbX() < -2 && b5.getbX() > -7 && b5.getbY() == -124){
            AngleGreen = 263;
            b5.speed = -b5.speed;
        }
        AngleGreen = AngleGreen - b5.speed;

        // Light Blue
        if (b6.getbX() > 2 && b6.getbX() < 7 && b6.getbY() == -99){
            AngleLightBlue = -80;
            b6.speed = -b6.speed;
        }
        if (b6.getbX() < -2 && b6.getbX() > -7 && b6.getbY() == -99){
            AngleLightBlue = 262;
            b6.speed = -b6.speed;
        }
        AngleLightBlue = AngleLightBlue - b6.speed;

        // Blue
        if (b7.getbX() > 2 && b7.getbX() < 5 && b7.getbY() == -74){
            AngleBlue = -78;
            b7.speed = -b7.speed;
        }
        if (b7.getbX() < -2 && b7.getbX() > -6 && b7.getbY() == -74){
            AngleBlue = 260;
            b7.speed = -b7.speed;
        }
        AngleBlue = AngleBlue - b7.speed;


        // Dark blue 
        if (b8.getbX() > 2 && b8.getbX() < 6 && b8.getbY() == -49) {
            AngleDarkBlue = -78;
            b8.speed = -b8.speed;

        }
        if (b8.getbX() < -2 && b8.getbX() > -7 && b8.getbY() == -49){
            AngleDarkBlue = 260;
            b8.speed = -b8.speed;
        }
        AngleDarkBlue = AngleDarkBlue - b8.speed;
        
        // Start / Stop
        if (e.getSource() == Start){
            time.start();

        }
        if (e.getSource() == End){
            time.stop();
        }
        repaint();

    }
}

