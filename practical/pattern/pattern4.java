import java.util.Scanner;

class C2w{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no.of rows");
        int rows=sc.nextInt();

        int cnt=rows*2-1;
        for(int i=1;i<rows;i++){
            for(int k=1;k<i;k++){
                System.out.println("\t");
            }
            int num=rows-i+1;
            for(int j=1;j<=cnt;j++){
                if(j<=(cnt/2)){
                    System.out.println(num + "\t");
                    num--;
                }
                else{
                    System.out.println(num + "\t");
                    num++;
                }

            }
            System.out.println();
            cnt-=2;
        }
    }
}
