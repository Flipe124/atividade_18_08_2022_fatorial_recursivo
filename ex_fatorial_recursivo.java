import java.util.*;
public class ex_fatorial_recursivo {
    public static void main(String[] args){
        int fatorial;
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite um número para calcular seu fatorial:");
        fatorial = scan.nextInt();

        System.out.println(calFatorial(fatorial));

    }
    private  static int calFatorial(int i){
        if (i == 0){
            return 1;
        } else {
            return i * calFatorial(i - 1);
        }
    }
}
