package bt_java2;

import java.util.Scanner;
import java.lang.Math;

public class BT_Java2 {

    public static void main(String[] args) {
        Scanner roy = new Scanner(System.in);
        //int a, b;
        //float n;
        //MAIN x = new MAIN();
        String[] st;
        //a = roy.nextInt();
        //n = roy.nextFloat();
        //x.DoiSo(n);
        //b = roy.nextInt();
        //String s = roy.nextLine();
        //System.out.println(x.CheckDX(s));
        //x.CheckDX(s);
        //x.SoThanThiet(a, b);
        //x.QuasiamicablePair(a, b);
        //x.GapGiay(a, b);
        //System.out.println(x.Fibonacci(a));
        //x.TeamPUBG(a);
        //System.out.println(x.GhepSo(a));
        //x.GhepSo(a);
        //x.SoCP(a);
        MaTran x = new MaTran();
        int m, n;
        //Nhap m, n
        System.out.println("Nhap m, n");
        m = roy.nextInt();
        n = roy.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Nhap ma tran: ");
        x.NhapMT(a, m, n);
        x.SapXep(a, m, n);
        //System.out.println("Xuat ma tran");
        //x.XuatMT(a, m, n);
    }
    
}


class MAIN {
    
    public int TongUoc(int n){
        int S = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                S = S + i;
            }
        }
        return S;
    }
    
    public void SoThanThiet(int a, int b){
        MAIN x = new MAIN();
        if(x.TongUoc(a) == b && x.TongUoc(b) == a){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
    public void QuasiamicablePair(int a, int b){
        if(TongUoc(b) == (a + 1) && TongUoc(a) == (b + 1)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
    public void GapGiay(int a, int b){
        int S = a;
        for(int i = 1; i <= b; i++){
            S = S * 2;
            if(S == b){
                //return i;
                System.out.println(i);
                break;
            }
            else if(S > b){
                System.out.println(i - 1);
                break;
            }
        }
    }
    
    public int Fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else{
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
    
    public void TeamPUBG(int n){
        int min, max;
        if(n < 4){
            min = 1;
            max = n;
        }
        else if(n > 25){
            max = 25;
            if(n % 4 != 0){
                min = n / 4 + 1;
            }
            else {
                min = n / 4;
            }
        }
        else{
            max = n;
            if(n % 4 != 0){
                min = n / 4 + 1;
            }
            else {
                min = n / 4;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    
    public void GhepSo(int n){
        int S;
        int a, b, c, d;
        a = n / 1000;
        b = (n / 100) % 10;
        c = (n / 10) % 10;
        d = n % 10;
        S = (a * 10 + d) + (b * 10 + c);
        System.out.print(a);
        System.out.print(d);
        System.out.print(" + ");
        System.out.print(b);
        System.out.print(c);
        System.out.println(" = " + S);
    }
    
    public void SoCP(int n){
        double x = Math.sqrt(n);
        if(x - (int)x == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
    public int CheckDX(String s){
        String x = "";
        for(int i = s.length() - 1; i >= 0; i--){
            x = x + s.charAt(i);
        }
        if(s.equals(x)){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public void DoiXung(String str[], int n){
        Scanner ro = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            str[i] = ro.nextLine();
        }
        for(int i = 0; i < n; i++){
            CheckDX(str[i]);
        }
    }
    
    public int UCLN(int a, int b) {
        int tmp;
        while(b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
}
    
    public void DoiSo(float n){
        n = n * 10;
        int x = UCLN((int)n, 10);
        n = (int)n / x;
        System.out.println((int)n + "/" + 10/x);
    }
}

class MaTran{
    
    public void NhapMT(int a[][], int m, int n){
        Scanner roy = new Scanner(System.in);
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j){
                //System.out.println("Nhap phan tu thu " + i + j);
                a[i][j] = roy.nextInt();
            }
        }
    }
    
    public void XuatMT(int a[][], int m, int n){
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void SapXep(int a[][], int m, int n){
        int tich1, tich2;
        for(int k = 0; k < m - 1; k++){
        for(int i = 0; i < m - 1; i++){
            tich1 = 1;
            tich2 = 1;
            for(int j = 0; j < n; j++){
                tich1 *= a[i][j];
                tich2 *= a[i+1][j];
            }
            if(tich1 > tich2){
                for(int j = 0; j < n; j++){
                    int q = a[i][j];
	            a[i][j] = a[i+1][j];
	            a[i+1][j] = q;
                }
            }
        }
        }
        
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
        
}

