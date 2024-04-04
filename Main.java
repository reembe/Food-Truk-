import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.*;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException, FontFormatException {
        //printing in console for dramatic effect (and for requirements) very useful features
        ArrayList<String> list = new ArrayList();

        list.add("food");
        list.add("truk");
        list.add("time");
        System.out.println("game: " + list);

        System.out.println(list.size());
        System.out.println(list.add("fun"));
        list.add(0, "food game");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.set(1,"play food truk"));
        System.out.println(list.remove(0));

        for(String str: list){
            System.out.println(str);
        }

        ArrayList<Integer> array = new ArrayList();
        array.add(1); array.add(2); array.add(2);
        array.add(3); array.add(3);
        
            for(int i = array.size() - 1; i >= 0; i--)
            {
                if(array.get(i) == 2) array.remove(i);
            }
            System.out.println(array);

            
        int n = array.size();

        // selection sort

        for (int i = 0; i < n - 1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
            {
                if (list.get(j).compareToIgnoreCase(list.get(minIndex)) < 0)
                {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                String temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
        System.out.println(array);

        //insertion sort

        for (int i = 1; i < n; i++) {
            String h = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j).compareToIgnoreCase(h) > 0)
            {
                array.set(j + 1, array.get(j));
                j = j - 1;
            }
            list.set(j + 1, h);
        }
        System.out.println(array);

        Breakfast fd = new Breakfast(9, "pancakes", true);
        Breakfast fds = new Breakfast();
        Food fdss = new Food();
        Food fdsz = new Food();

        Food[][] foodlist1 = {{fd, fdss}, {fdss, fdsz}};

        int[][] intlist =  {{2,3,2,3,2,3}, 
                            {2,2,2,2,2,2}, 
                            {3,2,2,4,32,}};

        // row-major 

        for (int r = 0; r < intlist.length; r++) {
            for (int c = 0; c < intlist[r].length; c++) {
                System.out.print(intlist[r][c] + " ");
            }
            System.out.println();
        }

        // column-major order

        int[][] intlist1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int c = 0; c < intlist1[0].length; c++) {
            for (int r = 0; r < intlist1.length; r++) {
                System.out.print(intlist1[r][c] + " ");
            }
            System.out.println();
        }

        // nested iteration

        for (int r = 0; r <  intlist.length; r++) {
            for (int c = 0; c < intlist[r].length; c++) {
                System.out.print(intlist[r][c] + " ");
            }
            System.out.println();
        }

        // enhanced for loops

        for (int[] r : intlist) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        System.out.println(fd.getName());

        foodSentence(fds);

        fds.eat();

       Food ob = new Breakfast();

       ArrayList<Food> foodlist = new ArrayList();
       foodlist.add(fd);
       foodlist.add(fds);
       foodlist.add(fdss);

       Food[] foods = {fd,fds,fdss};
        
        MyFrame myFrame = new MyFrame();
    }

    public String toString(){
        return "this is the main class";
    }

    public static String foodSentence(Food f)
    {
        return "this is a food: " + f.getName();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return false;
        
    }



   
}
