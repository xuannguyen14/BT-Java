package bt_javacb;

import java.util.Scanner;
//import java.lang.Math;
        
public class BT_JavaCB {

    public static void main(String[] args) {
        B9 obj = new B9();
        Scanner ij = new Scanner(System.in);
        String s;
        s = ij.nextLine();
        obj.XoaKT(s);
    }
    
}

class B1{
    public int Tong(int a, int b){
        int c;
        c = a + b;
        return c;
    }
    
    public int Hieu(int a, int b){
        int c;
        c = a - b;
        return c;
    }
    
    public int Tich(int a, int b){
        int c;
        c = a * b;
        return c;
    }
    
    public float Thuong(int a, int b){
        float c;
        c = a / b;
        return c;
    }
}

class B2{
    
    public float Chuvi(float dai, float rong){
        float cv;
        cv = (dai + rong) * 2;
        return cv;
    }
    
     public float Dientich(float dai, float rong){
        float dt;
        dt = dai * rong;
        return dt;
    }
}

class B3{
    public static final double PI = 3.14;
    public double ChuviHT(int r){
        double cv;
        cv = PI * r * 2;
        return cv;
    }
    
    public double DientichHT(int r){
        double dt;
        dt = PI * r * r;
        return dt;
    }
}

class B4{
    public void ChanLe(int a){
        if(a % 2 == 0){
            System.out.println("Chan");
        }
        else {
            System.out.println("Le");
        }
    }
}

class B5{
    public void KTSo(int a){
        if(a < 0){
            System.out.println("Am");
        }
        else if(a > 0){
            System.out.println("Duong");
        }
        else{
            System.out.println("Không");
        }
    }
}

class B6_7{
    public int KT_Prime(int a){
        int count = 0;
        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                 count++;
            }
        }
        if(count == 2){
            return 1;
        }
        return 0;
    }
    
    public void A(int N){
        int S = 0;
        for(int i = 1; i <= N; i++){
            System.out.print(i + " ");
            S = S + i;
        }
        System.out.println(S);
    }
    
    public void B(int N){
        int S = 0;
        for(int i = 2; i <= N; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
                S = S + i;
            }
        }
        System.out.println(S);
    }
    
    public void C(int N){
        int S = 0;
        for(int i = 1; i <= N; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
                S = S + i;
            }
        }
        System.out.println(S);
    }
    
    public void D(int N){
        int S = 0;
        for(int i = 1; i <= N; i++){
            if(KT_Prime(i) == 1){
                System.out.print(i + " ");
                S = S + i;
            }
        }
        System.out.println(S);
    }
    
    public void E(int N){
        int count = 0;
        for(int i = 2; count < N; i++){
            if(KT_Prime(i) == 1){
                System.out.println(i + " ");
                count++;
            }
        }
    }
}

class B8{
    public int KT_Prime(int a){
        int count = 0;
        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                 count++;
            }
        }
        if(count == 2){
            return 1;
        }
        return 0;
    }
     
    public void NhapMang(int a[], int n){
        Scanner jin = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            a[i] = jin.nextInt();
        }
    }
         
    public void XuatMang(int a[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
    
    public int TongMang(int a[], int n){
        int s = 0;
        for(int i = 0; i < n; i++){
            s = s + a[i];
        }
        return s;
    }
    
    public void TongChan(int a[], int n){
        int S = 0;
        for(int i = 0; i < n; i++){
            if(a[i] % 2 == 0){
                System.out.print(a[i] + " ");
                S = S + a[i];
            }
        }
        System.out.println(S);
    }
    
    public void TongLe(int a[], int n){
        int S = 0;
        for(int i = 0; i < n; i++){
            if(a[i] % 2 != 0){
                System.out.print(a[i] + " ");
                S = S + a[i];
            }
        }
        System.out.println(S);
    }
    
    public void TongNT(int a[], int n){
        int S = 0;
        for(int i = 0; i < n; i++){
            if(KT_Prime(a[i])== 0){
                System.out.print(a[i] + " ");
                S = S + a[i];
            }
        }
        System.out.println(S);
    }
    
    public void  ThemPT(int a[], int n, int x, int vt){
        if(vt < 0){
            vt = 0;
        }
        else if(vt > n){
            vt = n;
        }
        for(int i = n; i > vt; i--){
            a[i] = a[i-1];
        }
        a[vt] = x;
        ++n;
    }
    
    public void XoaK(int a[], int n, int k){
        if(k < 0){
            k = 0;
        }
        else if(k >= n){
            k = n-1;
        }
        for(int i = k; i < n - 1; i++){
            a[i] = a[i+1];
        }
        --n;
    }
    
    public void CheckX(int a[], int n, int x){
        for(int i = 0; i < n; i++){
            if(a[i] == x){
                System.out.print(i + " ");
            }
        }
    }
}

class B9{
    public int Lenght(String s){
        int length = s.length();
        return length;
    }
    
    public void Xoa(String s ,int vt){
	int n = Lenght(s);
        for(int i = vt; i < n - 1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            a = b;
        }
        char c = s.charAt(n - 1);
        c = '\0';
    }
    
    public void XoaKT(String s){
        int n = Lenght(s);
        for(int i = 0; i < n - 1; i++){
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            if(a == ' ' && b == ' '){
                Xoa(s, i);
                i--;
            }
	}
        if(s.charAt(0) == ' '){
	    Xoa(s,0);
        }
        if(s.charAt(n - 1) == ' '){
	    Xoa(s,n - 1);
        }
        System.out.println(s);
    }
}