package com.sales;

import java.util.Scanner;

public class Main {

public static void main(String[] args){
  
  
   
   Scanner userInput = new Scanner(System.in);
   boolean y=true;
 
   int pos1, cust1, pos2, cust2, pos3, cust3, sales ,cust, average;
   while (y) {
   println("Menghitung : ");
   println("[1] Sales per sift");
   println("[2] Total Cash Drop");
   println("[3] Total Sales\n");
   
   print("Masukan nomer : ");
   
 int x = userInput.nextInt();
   println(" ");
   
   switch (x){
   
   case 1:
   
   println("Total Sales Per Sift : \n");
   
   print("Sales POS 1 =  ");
   pos1 = userInput.nextInt();
   print("Cust POS 1  =  ");
   cust1 = userInput.nextInt();
   println(" ");
   print("Sales POS 2 =  ");
   pos2 = userInput.nextInt();
   print("Cust POS 2  =  ");
   cust2 = userInput.nextInt();
   println(" ");
   print("Sales POS 3 =  ");
   pos3 = userInput.nextInt();
   print("Cust POS 3  =  ");
   cust3 = userInput.nextInt();
   println(" ");
   sales = pos1 + pos2 + pos3;
   cust = cust1 + cust2 + cust3;
   average = sales / cust;
  println("--------------------------");
  System.out.printf("Sales : Rp. %,d\n",sales);
  println("Cust : " + cust);
  System.out.printf("Average : Rp. %,d",average);
  println("\n--------------------------\n");
  break;
  
  case 2:
  
  int cash1,cash2,cash3;
  println("Total Cash Drop : \n");
  print("Cash POS 1 = ");
  cash1=userInput.nextInt();
  print("Cash POS 2 = ");
  cash2=userInput.nextInt();
  print("Cash POS 3 = ");
  cash3=userInput.nextInt();
  println("\n--------------------------");
  int totalCash=cash1+cash2+cash3;
  System.out.printf("Total Cash Drop : Rp. %,d",totalCash);
  println("\n--------------------------");
  break;
  
  case 3:
  
  int total, cust4, average4;
  print("Total Sales     = Rp. ");
   total = userInput.nextInt();
   print("Total Customer =  ");
   cust4 = userInput.nextInt();
   average4 = total/cust4;
   
   println(" ");
   println("--------------------------");
  System.out.printf("Total : Rp. %,d\n",total);
  println("Cust : " + cust4);
  System.out.printf("Average : Rp. %,d",average4);
  println("\n--------------------------\n");
  break;
  
  default :
  println("Maaf nomer yang anda masukan tidak tersedia.\n");
  break;
       }
       
       
      boolean z=true ;
      print("Ingin Melanjutkan [yes/no] : ");
       while(z){
  
  String pilihan=userInput.nextLine();
       switch (pilihan){
         case "yes":
         z=false ;
         break ;
         
         case "no":
         z=false;
         y=false ;
         break;
         
         default :
         System.err.println("Wrong Input.");
         break;
         
         
       }
     }
   }
 }
private static void print(String dataInput){
  System.out.print(dataInput);
}
private static void println(String dataInput2){
  System.out.println(dataInput2);
}
}

