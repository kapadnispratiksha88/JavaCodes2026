

import java.util.Scanner;


public class pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();

        int num=rows;
        int ilc=0;
        int splc=0;
        for(int i=1;i<=rows*2-1;i++){
            if(i<=rows){
                num--;
            ilc=i*2-i;
            splc=rows-i;
            }
            else{
                num--;
                splc++;
                ilc-=2;

            }
            for(int k=1;k<=splc;k++){
                System.out.println(num + "\t");
            }
            for(int j=1;j<=ilc;j++){
                System.out.println(num);
            }
System.out.println();
        }
    }

    
}
