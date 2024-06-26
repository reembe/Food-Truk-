import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyFrame extends JFrame{

    private DragPanel dragPanel = new DragPanel();
    private Menu menu = new Menu();
    public static String currentScreen = "menu";

    private ImageIcon image1 = new ImageIcon(getClass().getResource("/scrollplay.png"));
    private ImageIcon backgroundphoto;
    private JButton scrollbutton;
    private JLabel backgrounds;
    private JLabel title;
    private JLabel title1;

    private JButton button2;
    private JButton button3;

    private static Clip clip;
    public MyFrame() throws IOException, FontFormatException, UnsupportedAudioFileException, LineUnavailableException {

        File font_file = new File("joystix.ttf");
        Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
        Font sizedFont = font.deriveFont(40f);


       File file = new File("foodtruktheme.wav");
       AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
       clip = AudioSystem.getClip();
       clip.open(audioStream);
       clip.start();
       clip.loop(5);


        button2 = new JButton("Quit");
        button2.addActionListener(this::actionPerformed);
        button2.setBounds(1200,700,300,200);
        button2.setBackground(Color.white);
        button2.setForeground(Color.black);
        button2.setFont(sizedFont);
        this.add(button2);

        button3 = new JButton("Play");
        button3.addActionListener(this::actionPerformed);
        button3.setBounds(1200,400,300,200);
        button3.setBackground(Color.white);
        button3.setForeground(Color.black);
        button3.setFont(sizedFont);
        this.add(button3);

        title = new JLabel();
        title.setText("make food");
        title.setBounds(1150,15,10000,100);
        title.setForeground(Color.black);
        title.setFont(sizedFont);

        title1 = new JLabel();
        title1.setText("lock door");
        title1.setBounds(1150,55,10000,100);
        title1.setForeground(Color.black);
        title1.setFont(sizedFont);


        if (currentScreen == "menu"){
            this.add(menu);
        }
        if (currentScreen == "game"){

            this.add(dragPanel);}

        this.setTitle("Food Truk");
        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);

        this.setVisible(true);
    }
    public String toString(){
        return "this is the my frame class";
    }
        

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button3) {

            this.remove(button2);
            this.remove(button3);
            currentScreen= "game";
            this.add(dragPanel);
            this.repaint();
            this.revalidate();

        }


        if(e.getSource()==button2) {
            System.exit(0);

        }
    }

    public boolean equals(Food other)
    {
        return (this.getName() == other.getName());
    }



}