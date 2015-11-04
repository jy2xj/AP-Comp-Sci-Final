
import java.util.Random;
import java.io.*;
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;

public class DisplayGoT extends JPanel
{
   private JLabel onum;
   private JLabel dnum;
  //JLabel trying;
   private int o, d/*, p*/; 
   int[] track;
   public DisplayGoT()
   {
      setLayout(new GridLayout(1, 8));
      //trying = new JLabel("------", SwingConstants.NORTH);
      String onu = "OFFENSE";
      int o = 0;
      int d = 0;
      onum = new JLabel(onu, SwingConstants.LEFT);
      onum.setFont(new Font("Serif", Font.BOLD, 50));
      add(onum);
      String dnu = "DEFENSE";
      dnum = new JLabel(dnu, SwingConstants.RIGHT);
      dnum.setFont(new Font("Serif", Font.BOLD, 50));
      add(dnum);
      reset();
     /*  onum = new JLabel[8];
       for(int x = 0; x < onum.length; x++)
       {
          onum[x] = new JLabel("", SwingConstants.LEFT);
          onum[x].setFont(new Font("Serif", Font.BOLD, 50));
          add(onum[x]);
       }*/
       track = new int[10];
       for (int x = 0; x < track.length; x++)
       {
         track[x] = x+1;
       }
      
   }
   
  /* public void checkWinner()
   {
      if (off == 5){
         return true;
      }
   } */  
   
   public void attack()
   {
      if (o == 1 || d == 1){
         if (d == 1){
            System.out.println("If you chose defense, reset the game to choose offense");
         }
         else{
            System.out.println("Press the reset button to restart");
         }
      }
      else{
         o = 1;
         d = 0;
         onum.setText("Start!");
      }
   }
   public void defend()
   {
      if (d == 1 || o == 1){
         if (o == 1){
            System.out.println("If you chose offense, reset the game to choose defense");
         }
         else{
            System.out.println("Press the reset button to restart");
         }
      }
      else{
         o = 0;
         d = 1;
         dnum.setText("Start!");
      }
   }
   public void reset()
   {
      o = 0;
      d = 0;
      onum.setText("OFFENSE");
      dnum.setText("DEFENSE");
      track = new int[10];
      for (int z = 0; z < track.length; z++)
      {
        track[z] = z+1;
      }
   }
   //OFFENSE
   public void oone() //offense one
   {
      if (d == 1 || o == 0){
         System.out.println("Invalid Response.");
      }
      else{
      onum.setText("1");
      //off+;
      }
   }
   public void otwo() //offense two
   {
      if (d == 1 || o == 0){
         System.out.println("Invalid Response.");
      }
      else{
      onum.setText("2");
      }
   }
   public void othree() //offense three
   {
      if (d == 1 || o == 0){
         System.out.println("Invalid Response.");
      }
      else{
      onum.setText("3");
      }
   }
   
   public void ofour() //offense four
   {
      if (d == 1 || o == 0){
         System.out.println("Invalid Response.");
      }
      else{
      onum.setText("4");
      }
   }
   
   public void ofive() //offense five
   {
      if (d == 1 || o == 0){
         System.out.println("Invalid Response.");
      }
      else{
      onum.setText("5");
      }
   }
   
   public void osix() //offense six
   {
      if (d == 1 || o == 0){
         System.out.println("Invalid Response.");
      }
      else{
      onum.setText("6");
      }
   }
   
   //DEFENSE
   public void done() //defense one
   {
      if (d == 0 || o == 1){
         System.out.println("Invalid Response.");
      }
      else{
      dnum.setText("1");
      //off+;
      }
   }
   
   public void dtwo()
   {
      if (d==0||o==1){
         System.out.println("Invalid Response.");
      }
      else{
      dnum.setText("2");
      }
   }
   
   public void dthr()
   {
      if (d==0||o==1){
         System.out.println("Invalid Response.");
      }
      else{
      dnum.setText("3");
      }
   }
   
   public void dfou()
   {
      if (d==0||o==1){
         System.out.println("Invalid Response.");
      }
      else{
      dnum.setText("4");
      }
   }
   
   public void dfiv()
   {
      if (d==0||o==1){
         System.out.println("Invalid Response.");
      }
      else{
      dnum.setText("5");
      }
   }

   public void dsix()
   {
      if (d==0||o==1){
         System.out.println("Invalid Response.");
      }
      else{
      dnum.setText("6");
      }
   }

   public void dsev()
   {
      if (d==0||o==1){
         System.out.println("Invalid Response.");
      }
      else{
      dnum.setText("7");
      }
   }
   
   public void deig()
   {
      if (d==0||o==1){
         System.out.println("Invalid Response.");
      }
      else{
      dnum.setText("8");
      }
   }

   public void dnin()
   {
      if (d==0||o==1){
         System.out.println("Invalid Response.");
      }
      else{
      dnum.setText("9");
      }
   }
   
   public void dten()
   {
      if (d==0||o==1){
         System.out.println("Invalid Response.");
      }
      else{
      dnum.setText("10");
      }
   }
   
   public boolean doone(int p) //defense offense one
   {
     // if (d == 0 || o == 1){
       //  System.out.println("Invalid Response.");
      //}
      onum.setText("1");
      boolean truth = false;
      //p = (int)((Math.random()*10)+1);
     // System.out.println(p);
      for (int j = 0; j < track.length; j++){
         if (p == track[j]){
            String pi = Integer.toString(p);
            onum.setText(pi);
            //System.out.print(pi);
            track[j] = 0;
            truth = true;
         }
      }
     return truth;
   }
}
      