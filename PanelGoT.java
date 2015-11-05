
import java.util.Random;
import java.io.*;
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelGoT extends JPanel
{
   DisplayGoT display;
   JButton onums[];
   JButton dnums[];
   JLabel output;
   int used[];
   int a,b,j, turn, opoints, dpoints,one,two,thr,fou,fiv,six,sev,eig,nin,ten;
  // private CalculateButtonHandler cbHandler;
   public PanelGoT()
   {
      setLayout(new BorderLayout());
      
      display = new DisplayGoT();
      add(display, BorderLayout.CENTER);
      
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout());
      add(panel, BorderLayout.SOUTH);
      
      output = new JLabel("------", SwingConstants.CENTER);
      add(output, BorderLayout.NORTH);
      
    /*  JPanel panel1 = new JPanel();
      panel.setLayout(new FlowLayout());
      add(panel1, BorderLayout.NORTH);*/
      
     /* JPanel panel2 = new JPanel();
      panel.setLayout(new FlowLayout());
      add(panel2, BorderLayout.CENTER);*/
      
      JButton button1 = new JButton("Attack");
      button1.addActionListener(new Listener1());
      panel.add(button1);
      
     /* onums = new JButton[10];
      for (int a = 0; a < onums.length; a++){
         int otemp = a + 1;
         String oconvert = Integer.toString(otemp); 
         onums[a] = new JButton(oconvert);
         panel1.add(onums[a]);
      }
      onums[0].addActionListener(new Listener4());
      onums[1].addActionListener(new Listener5());*/
      //panel.add(onums[]);
      
      JButton button2 = new JButton("Defend");
      button2.addActionListener(new Listener2());
      panel.add(button2);
      
      dnums = new JButton[10];
      for (int b = 0; b < dnums.length; b++){
         int dtemp = b + 1;
         String dconvert = Integer.toString(dtemp); 
         dnums[b] = new JButton(dconvert);
         panel.add(dnums[b]);
      }
      dnums[0].addActionListener(new Listener14());
      dnums[1].addActionListener(new Listener15());
      dnums[2].addActionListener(new Listener16());
      dnums[3].addActionListener(new Listener17());
      dnums[4].addActionListener(new Listener18());
      dnums[5].addActionListener(new Listener19());
      dnums[6].addActionListener(new Listener20());
      dnums[7].addActionListener(new Listener21());
      dnums[8].addActionListener(new Listener22());
      dnums[9].addActionListener(new Listener23());
      //panel.add(dnums[]);
   
      JButton button3 = new JButton("Reset");
      button3.addActionListener(new Listener3());
      panel.add(button3);
      
      one = 0;
      two = 0;
      thr = 0;
      fou = 0;
      fiv = 0;
      six = 0;
      sev = 0;
      eig = 0;
      nin = 0;
      ten = 0;
      used = new int[5];
      for (int f = 0; f < used.length; f++){
         used[f] = 0;
      }  
     // turn = 0;
      output.setText("------");

   }
   
   private class Listener1 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
       javax.swing.JOptionPane.showMessageDialog(null, "Feature coming soon!");
       /*  display.attack();
         a=1;*/
      }
   }
   
   private class Listener2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.defend();
         a=1;
      }
   }
   
   private class Listener3 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.reset();
         a=0;
         if (a == 0){
            for (int res = 0; res < dnums.length; res++){
               //onums[res].setBackground(null);
               dnums[res].setBackground(null);
            }
            for (int res2 = 0; res2 < used.length; res2++){
               used[res2] = 0;
            }
         }
         dpoints = 0;
         opoints = 0;
         one = 0;
         two = 0;
         thr = 0;
         fou = 0;
         fiv = 0;
         six = 0;
         sev = 0;
         eig = 0;
         nin = 0;
         ten = 0;
      }
   }
   //Listener4 through Listener13 is Offense
   private class Listener4 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
        javax.swing.JOptionPane.showMessageDialog(null, "Feature coming soon!");
        /* dpoints++;
         display.oone();
         if(a==1){
            onums[0].setBackground(Color.RED);
         }*/

      }
   }
   
   private class Listener5 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
        javax.swing.JOptionPane.showMessageDialog(null, "Feature coming soon!");
        /*
         display.otwo();
         if(a==1){
            onums[1].setBackground(Color.RED);
         }*/
      }
   }
   //Listener14 through Listener23 is Defense
   private class Listener14 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.done();
         if(a == 1){
            dnums[0].setBackground(Color.RED);
         //turn++;
         if (one == 1){
         javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen");
         }
         if (one == 0){
         j = (int)((Math.random()*10)+1);
         System.out.println("panel: " + j);
         while (display.doone(j) == false){
            //javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen: " + j);
            j = (int)((Math.random()*10)+1);
            System.out.println("panel2: " + j);
         }
         System.out.println("The computer chose " + j);
         if (j ==1){
            opoints = opoints +3;
            }
         else if (j == 2){
            opoints = opoints + 2;
         }
         else if (j == 3){
            opoints = opoints + 1;
         }
         used[dpoints] = j;
         dpoints = dpoints + 1;
         System.out.println("opoints: " + opoints);
         System.out.println("dpoints: " + dpoints);
         System.out.println("Numbers used by computer: " + java.util.Arrays.toString(used));
         output.setText("Offense Points: " + opoints + "   " + "Defense Points/Turns Gone: " + dpoints 
         +"   Numbers used by computer: " + java.util.Arrays.toString(used));
         if (opoints >= 5 || dpoints >= 5){
            if (opoints >=5 && dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "It's a Tie! Play again?");
            }
            else if (opoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Offense Wins! Play again?");
            }
            else if (dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Defense Wins! Play again?");
            }
         }
         one = 1;
         }  
         }       
      }
   }
   private class Listener15 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.dtwo();
         if(a == 1){
            dnums[1].setBackground(Color.RED);
         if (two == 1){
         javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen");
         }
         if (two == 0){
         j = (int)((Math.random()*10)+1);
         System.out.println("panel: " + j);
         while (display.doone(j) == false){
            //javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen: " + j);
            j = (int)((Math.random()*10)+1);
            System.out.println("panel2: " + j);
         }
         System.out.println("The computer chose " + j);
         if (j ==2){
            opoints = opoints +3;
            }
         else if (j == 1 || j == 3){
            opoints = opoints + 2;
         }
         else if (j == 4){
            opoints = opoints + 1;
         }
         used[dpoints] = j;
         dpoints = dpoints + 1;
         System.out.println("opoints: " + opoints);
         System.out.println("dpoints: " + dpoints);
         System.out.println("Numbers used by computer: " + java.util.Arrays.toString(used));
         output.setText("Offense Points: " + opoints + "   " + "Defense Points/Turns Gone: " + dpoints 
         +"   Numbers used by computer: " + java.util.Arrays.toString(used));
         if (opoints >= 5 || dpoints >= 5){
            if (opoints >=5 && dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "It's a Tie! Play again?");
            }
            else if (opoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Offense Wins! Play again?");
            }
            else if (dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Defense Wins! Play again?");
            }
         }
         two = 1;
         }
         }
      }
   }
   
   private class Listener16 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.dthr();
         if(a == 1){
            dnums[2].setBackground(Color.RED);
         if (thr == 1){
         javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen");
         }
         if (thr == 0){
         j = (int)((Math.random()*10)+1);
         System.out.println("panel: " + j);
         while (display.doone(j) == false){
            //javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen: " + j);
            j = (int)((Math.random()*10)+1);
            System.out.println("panel2: " + j);
         }
         System.out.println("The computer chose " + j);
         if (j == 3){
            opoints = opoints +3;
            }
         else if (j == 2 || j == 4){
            opoints = opoints + 2;
         }
         else if (j == 1 || j == 5){
            opoints = opoints + 1;
         }
         used[dpoints] = j;
         dpoints = dpoints + 1;
         System.out.println("opoints: " + opoints);
         System.out.println("dpoints: " + dpoints);
         System.out.println("Numbers used by computer: " + java.util.Arrays.toString(used));
         output.setText("Offense Points: " + opoints + "   " + "Defense Points/Turns Gone: " + dpoints 
         +"   Numbers used by computer: " + java.util.Arrays.toString(used));
         if (opoints >= 5 || dpoints >= 5){
            if (opoints >=5 && dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "It's a Tie! Play again?");
            }
            else if (opoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Offense Wins! Play again?");
            }
            else if (dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Defense Wins! Play again?");
            }
         }         
         thr = 1;
         }
         }
      }
   }   
   
   private class Listener17 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.dfou();
         if(a == 1){
            dnums[3].setBackground(Color.RED);
         if (fou == 1){
         javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen");
         }
         if (fou == 0){
         j = (int)((Math.random()*10)+1);
         System.out.println("panel: " + j);
         while (display.doone(j) == false){
            //javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen: " + j);
            j = (int)((Math.random()*10)+1);
            System.out.println("panel2: " + j);
         }
         System.out.println("The computer chose " + j);
         if (j == 4){
            opoints = opoints +3;
            }
         else if (j == 3 || j == 5){
            opoints = opoints + 2;
         }
         else if (j == 2 || j == 6){
            opoints = opoints + 1;
         }
         used[dpoints] = j;
         dpoints = dpoints + 1;
         System.out.println("opoints: " + opoints);
         System.out.println("dpoints: " + dpoints);
         System.out.println("Numbers used by computer: " + java.util.Arrays.toString(used));
         output.setText("Offense Points: " + opoints + "   " + "Defense Points/Turns Gone: " + dpoints 
         +"   Numbers used by computer: " + java.util.Arrays.toString(used));
         if (opoints >= 5 || dpoints >= 5){
            if (opoints >=5 && dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "It's a Tie! Play again?");
            }
            else if (opoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Offense Wins! Play again?");
            }
            else if (dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Defense Wins! Play again?");
            }
         }        
         fou = 1;
         }
         }
      }
   }
   
   private class Listener18 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.dfiv();
         if(a == 1){
            dnums[4].setBackground(Color.RED);
         if (fiv == 1){
         javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen");
         }
         if (fiv == 0){
         j = (int)((Math.random()*10)+1);
         System.out.println("panel: " + j);
         while (display.doone(j) == false){
            //javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen: " + j);
            j = (int)((Math.random()*10)+1);
            System.out.println("panel2: " + j);
         }
         System.out.println("The computer chose " + j);
         if (j == 5){
            opoints = opoints +3;
            }
         else if (j == 4 || j == 6){
            opoints = opoints + 2;
         }
         else if (j == 3 || j == 7){
            opoints = opoints + 1;
         }
         used[dpoints] = j;
         dpoints = dpoints + 1;
         System.out.println("opoints: " + opoints);
         System.out.println("dpoints: " + dpoints);
         System.out.println("Numbers used by computer: " + java.util.Arrays.toString(used));
         output.setText("Offense Points: " + opoints + "   " + "Defense Points/Turns Gone: " + dpoints 
         +"   Numbers used by computer: " + java.util.Arrays.toString(used));
         if (opoints >= 5 || dpoints >= 5){
            if (opoints >=5 && dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "It's a Tie! Play again?");
            }
            else if (opoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Offense Wins! Play again?");
            }
            else if (dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Defense Wins! Play again?");
            }
         }        
         fiv = 1;
         }
         }
      }
   }
   
   private class Listener19 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.dsix();
         if(a == 1){
            dnums[5].setBackground(Color.RED);
         if (six == 1){
         javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen");
         }
         if (six == 0){
         j = (int)((Math.random()*10)+1);
         System.out.println("panel: " + j);
         while (display.doone(j) == false){
            //javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen: " + j);
            j = (int)((Math.random()*10)+1);
            System.out.println("panel2: " + j);
         }
         System.out.println("The computer chose " + j);
         if (j == 6){
            opoints = opoints +3;
            }
         else if (j == 5 || j == 7){
            opoints = opoints + 2;
         }
         else if (j == 4 || j == 8){
            opoints = opoints + 1;
         }
         used[dpoints] = j;
         dpoints = dpoints + 1;
         System.out.println("opoints: " + opoints);
         System.out.println("dpoints: " + dpoints);
         System.out.println("Numbers used by computer: " + java.util.Arrays.toString(used));
         output.setText("Offense Points: " + opoints + "   " + "Defense Points/Turns Gone: " + dpoints 
         +"   Numbers used by computer: " + java.util.Arrays.toString(used));
         if (opoints >= 5 || dpoints >= 5){
            if (opoints >=5 && dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "It's a Tie! Play again?");
            }
            else if (opoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Offense Wins! Play again?");
            }
            else if (dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Defense Wins! Play again?");
            }
         }        
         six = 1;
         }
         }
      }
   }
   
   private class Listener20 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.dsev();
         if(a == 1){
            dnums[6].setBackground(Color.RED);
         if (sev == 1){
         javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen");
         }
         if (sev == 0){
         j = (int)((Math.random()*10)+1);
         System.out.println("panel: " + j);
         while (display.doone(j) == false){
            //javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen: " + j);
            j = (int)((Math.random()*10)+1);
            System.out.println("panel2: " + j);
         }
         System.out.println("The computer chose " + j);
         if (j == 7){
            opoints = opoints +3;
            }
         else if (j == 6 || j == 8){
            opoints = opoints + 2;
         }
         else if (j == 5 || j == 9){
            opoints = opoints + 1;
         }
         used[dpoints] = j;
         dpoints = dpoints + 1;
         System.out.println("opoints: " + opoints);
         System.out.println("dpoints: " + dpoints);
         System.out.println("Numbers used by computer: " + java.util.Arrays.toString(used));
         output.setText("Offense Points: " + opoints + "   " + "Defense Points/Turns Gone: " + dpoints 
         +"   Numbers used by computer: " + java.util.Arrays.toString(used));
         if (opoints >= 5 || dpoints >= 5){
            if (opoints >=5 && dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "It's a Tie! Play again?");
            }
            else if (opoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Offense Wins! Play again?");
            }
            else if (dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Defense Wins! Play again?");
            }
         }        
         sev = 1;
         }
         }
      }
   }
   
   private class Listener21 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.deig();
         if(a == 1){
            dnums[7].setBackground(Color.RED);
         if (eig == 1){
         javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen");
         }
         if (eig == 0){
         j = (int)((Math.random()*10)+1);
         System.out.println("panel: " + j);
         while (display.doone(j) == false){
            //javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen: " + j);
            j = (int)((Math.random()*10)+1);
            System.out.println("panel2: " + j);
         }
         System.out.println("The computer chose " + j);
         if (j == 8){
            opoints = opoints +3;
            }
         else if (j == 7 || j == 9){
            opoints = opoints + 2;
         }
         else if (j == 6 || j == 10){
            opoints = opoints + 1;
         }
         used[dpoints] = j;
         dpoints = dpoints + 1;
         System.out.println("opoints: " + opoints);
         System.out.println("dpoints: " + dpoints);
         System.out.println("Numbers used by computer: " + java.util.Arrays.toString(used));
         output.setText("Offense Points: " + opoints + "   " + "Defense Points/Turns Gone: " + dpoints 
         +"   Numbers used by computer: " + java.util.Arrays.toString(used));
         if (opoints >= 5 || dpoints >= 5){
            if (opoints >=5 && dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "It's a Tie! Play again?");
            }
            else if (opoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Offense Wins! Play again?");
            }
            else if (dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Defense Wins! Play again?");
            }
         }        
         eig = 1;
         }
         }
      }
   }
   
   private class Listener22 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.dnin();
         if(a == 1){
            dnums[8].setBackground(Color.RED);
         if (nin == 1){
         javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen");
         }
         if (nin == 0){
         j = (int)((Math.random()*10)+1);
         System.out.println("panel: " + j);
         while (display.doone(j) == false){
            //javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen: " + j);
            j = (int)((Math.random()*10)+1);
            System.out.println("panel2: " + j);
         }
         System.out.println("The computer chose " + j);
         if (j == 9){
            opoints = opoints +3;
            }
         else if (j == 8 || j == 10){
            opoints = opoints + 2;
         }
         else if (j == 7){
            opoints = opoints + 1;
         }
         used[dpoints] = j;
         dpoints = dpoints + 1;
         System.out.println("opoints: " + opoints);
         System.out.println("dpoints: " + dpoints);
         System.out.println("Numbers used by computer: " + java.util.Arrays.toString(used));
         output.setText("Offense Points: " + opoints + "   " + "Defense Points/Turns Gone: " + dpoints 
         +"   Numbers used by computer: " + java.util.Arrays.toString(used));
         if (opoints >= 5 || dpoints >= 5){
            if (opoints >=5 && dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "It's a Tie! Play again?");
            }
            else if (opoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Offense Wins! Play again?");
            }
            else if (dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Defense Wins! Play again?");
            }
         }        
         nin = 1;
         }
         }
      }
   }
   
   private class Listener23 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.dten();
         if(a == 1){
            dnums[9].setBackground(Color.RED);
         if (ten == 1){
         javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen");
         }
         if (ten == 0){
         j = (int)((Math.random()*10)+1);
         System.out.println("panel: " + j);
         while (display.doone(j) == false){
            //javax.swing.JOptionPane.showMessageDialog(null, "Number already chosen: " + j);
            j = (int)((Math.random()*10)+1);
            System.out.println("panel2: " + j);
         }
         System.out.println("The computer chose " + j);
         if (j == 10){
            opoints = opoints +3;
            }
         else if (j == 9){
            opoints = opoints + 2;
         }
         else if (j == 8){
            opoints = opoints + 1;
         }
         used[dpoints] = j;
         dpoints = dpoints + 1;
         System.out.println("opoints: " + opoints);
         System.out.println("dpoints: " + dpoints);
         System.out.println("Numbers used by computer: " + java.util.Arrays.toString(used));
         output.setText("Offense Points: " + opoints + "   " + "Defense Points/Turns Gone: " + dpoints 
         +"   Numbers used by computer: " + java.util.Arrays.toString(used));
         if (opoints >= 5 || dpoints >= 5){
            if (opoints >=5 && dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "It's a Tie! Play again?");
            }
            else if (opoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Offense Wins! Play again?");
            }
            else if (dpoints >=5){
               javax.swing.JOptionPane.showMessageDialog(null, "Defense Wins! Play again?");
            }
         }        
         ten = 1;
         }
         }
      }
   }
      
 /*  public void displayWinner()
   {
      if (a == 1){
         javax.swing.JOptionPane.showMessageDialog(null, "Offense wins!");
         System.exit(0);
      }
   }*/ 
}

