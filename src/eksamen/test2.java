package eksamen;

public class test2 {
    public static void main(String[] args) {
        for(int i=0;i<=1000; i+=10){
            System.out.print(i + " ");

        }
        System.out.println(" ");
        int x= 0;
        while(x<=1000){

            System.out.print(x + " ");
            x+=10;
        }
        System.out.println(" ");
        for(int i=10; i>-11; i--){
            if(i == -10){
                System.out.print(i);
                continue;
            }
            System.out.print(i + ", ");

        }

    }
}
