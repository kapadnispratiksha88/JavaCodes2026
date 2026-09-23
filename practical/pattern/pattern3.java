import java.util.Scanner;
class C2w{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no.of rows");
        int rows=sc.nextInt();

        int num=1;
        int ilc=0;

        for(int i=1;i<=rows*2-1;i++){
            if(i<=rows){
                ilc=i;
            }
            else{
                ilc--;

            }
            for(int j=1;j<=ilc;j++){
                System.out.println(num +"\t");
            }
            System.out.println();
            num++;


        }

    }
}