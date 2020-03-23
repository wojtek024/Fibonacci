public class Fibonacci {
    public static void main(String[] args){
        int a_2 = 3;
        int a_1 = 5;
        int a = 0;
        int n = 5;
        for(int i=1;i<=n;i++){
            a = a_2 + a_1;
            System.out.println(i+"-ta liczba to: "+a);
            a_2 = a_1;
            a_1 = a;
        }
    }


}
