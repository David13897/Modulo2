import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int v1, v2, v3, n;
        System.out.print("introduz 3 numeros\n");

        v1 = scanner.nextInt();
        v2 = scanner.nextInt();
        v3 = scanner.nextInt();
        n = v1;
        if (v1<=v2 && v2<=v3 && v1<=v3){
            n=v3;
        }
        else if (v1<v3 && v3<v2 && v1<v2) {
            n=v2;
        }
        System.out.print("o maior numero é:\n");
        System.out.println(n);

        int[] vetor = {v1,v2,v3};

        for (int i=0; i<2; i++){
            for (int j=0; j<2-i; j++){
                if (vetor[j] > vetor[j+1]){
                    int tmp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = tmp;
                }
            }
        }
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}