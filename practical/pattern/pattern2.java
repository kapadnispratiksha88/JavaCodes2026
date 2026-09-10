import java.util.Scanner;

class C2w{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows=sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int k=1;k<=rows-i;k++){
                System.out.print("\t");
            }
            int num=rows+i-1;
            for(int j=1;j<=2*i-1;j++){
                if(j<i){
                    System.out.print(num + "\t");
                    num--;
                }
                else{
                    System.out.print(num + "\t");
                    num++;

                }
            }
            System.out.println();
        }
    }
}