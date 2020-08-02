package java_oop;

import java.util.Scanner;
import java.lang.Math;
        
public class Java_oop {

    public static void main(String[] args) {
        Student a = new Student();
        a.Nhap();
        a.Xuat();
        
        
    }
    
}

//   BAI TAP CHUONG 2 

class Point{
    protected float x,y;
    
    public Point(){
        this.x = 0;
        this.y = 0;
    };
    
    public Point(float a,float b){
        this.x = a;
        this.y = b;
    };
    
    public void setX(float a){
        x = a;
    }
    
    public void setY(float a){
        y = a;
    }
    
    public void setXY(float a,float b){
        x = a;
        y = b;
    }
    
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
    
    public void Nhap(){
        Scanner ij = new Scanner(System.in);
        System.out.print("x = ");
        x = ij.nextFloat();
        System.out.print("y = ");
        y = ij.nextFloat();
        
    };
    
    public void Xuat(){
        System.out.println("(" + x + ", " + y + ")");
    };
    
    //Tịnh tiến theo vector v (a,b) : x’ = x + a; y’ = y + b;
    public void TinhTien(float a, float b){
        x += a;
        y += b;
    };
};

class Rectangle{
    private float length;
    private float width;
    
    public Rectangle(){
        this.length = 0;
        this.width = 0;
    };
    
    public Rectangle(float a,float b){
        this.length = a;
        this.width = b;
    };
    
    public void setLength(float a){
        length = a;
    }
    
    public void setWidth(float a){
        width = a;
    }
    
    public void setLW(float a,float b){
        length = a;
        width = b;
    }
    
    public float getlength(){
        return length;
    }
    
    public float getWidth(){
        return width;
    }
    
    public void Nhap(){
        Scanner ij = new Scanner(System.in);
        System.out.print("Length = ");
        length = ij.nextFloat();
        System.out.print("Width = ");
        width = ij.nextFloat();
    };
    
    public void Xuat(){
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
    };
    
    public float DT(){
        float dt;
        dt = length * width;
        return dt;
    }
    
    public float CV(){
        float cv;
        cv = (length + width) * 2;
        return cv;
    }
};

class Circle{
    private float radius;
    
    public static final double PI = 3.14;
    
    public Circle(){
        this.radius = 0;
    };
    
    public Circle(float a){
        this.radius = a;
    };
    
    public void setRadius(float a){
        radius = a;
    }
    
    public float getRadius(){
        return radius;
    }
    
    public void Nhap(){
        Scanner ij = new Scanner(System.in);
        System.out.print("Radius = ");
        radius = ij.nextFloat();
    };
    
    public void Xuat(){
        System.out.println("Radius = " + radius);
    };
    
    public double DT(){
        double dt;
        dt = PI * radius * radius;
        return dt;
    }
    
    public double CV(){
        double cv;
        cv = PI * radius * 2;
        return cv;
    }
};

class SinhVien{
    private String MSV, Name, Class;
    private float Scores1, Scores2, Scores3;
    
    public SinhVien(){
        this.MSV = "";
        this.Name = "";
        this.Class = "";
        this.Scores1 = 0;
        this.Scores2 = 0;
        this.Scores3 = 0;
    }
    
    public SinhVien(String MSV, String Name, String Class, float Scores1, float Scores2, float Scores3){
        this.MSV = MSV;
        this.Name = Name;
        this.Class = Class;
        this.Scores1 = Scores1;
        this.Scores2 = Scores2;
        this.Scores3 = Scores3;
    }
    
    public void setMSV(String MSV){
        this.MSV = MSV;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public void setClass(String Class){
        this.Class = Class;
    }
    
    public void setScores1(float Scores1){
        this.Scores1 = Scores1;
    }
    
    public void setScores2(float Scores2){
        this.Scores2 = Scores2;
    }
    
    public void setScores3(float Scores3){
        this.Scores3 = Scores3;
    }
    
    public String getMSV() {
        return MSV;
    }
    
    public String getName() {
        return Name;
    }
    
    /*public String getClass() {
        return Class;
    }*/

    public float getScores1() {
        return Scores1;
    }
    
    public float getScores2() {
        return Scores2;
    }
    
    public float getScores3() {
        return Scores3;
    }
    
    public void Nhap(){
        Scanner xy = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        MSV = xy.nextLine();
        System.out.print("Nhap ho ten: ");
        Name = xy.nextLine();
        System.out.print("Nhap lop: ");
        Class = xy.nextLine();
        System.out.print("Nhap diem 1: ");
        Scores1 = xy.nextFloat();
        System.out.print("Nhap diem 2: ");
        Scores2 = xy.nextFloat();
        System.out.print("Nhap diem 3: ");
        Scores3 = xy.nextFloat();
    }

    public float DTB(){
        float dtb;
        dtb = (Scores1 + Scores2 + Scores3) / 3;
        return dtb;
    }
    
    public void Xuat(){
        System.out.println("Ma sinh vien: "  + MSV);
        System.out.println("Ho ten: " + Name);
        System.out.println("Lop: " + Class);
        System.out.println("Diem 1: " + Scores1);
        System.out.println("Diem 2: " + Scores1);
        System.out.println("Diem 3: " + Scores1);
    }

    public void XepLoai(float dtb){
        if(dtb >= 9){
            System.out.println("Xuat sac");
        }
        else if(dtb >= 8 && dtb < 9){
            System.out.println("Gioi");
        }
        else if(dtb >= 7 && dtb < 8){
            System.out.println("Kha");
        }
        else if(dtb >= 6 && dtb < 7){
            System.out.println("Trung binh");
        }
        else if(dtb >= 5 && dtb < 6){
            System.out.println("Yeu");
        }
        else{
            System.out.println("Kem");
        }
    }
};

class List_SV{
    private int SiSo;
    private SinhVien Li[] = new SinhVien[SiSo];

    public void Nhap(){
        Scanner ij = new Scanner(System.in);
        System.out.print("Nhap si so: ");
        SiSo = ij.nextInt();
        System.out.print("Nhap thong tin sinh vien: ");
        for(int i = 0; i < SiSo; i++)
           Li[i].Nhap();
    }

    public void Xuat(){
        for(int i = 0; i < SiSo; i++)
           Li[i].Xuat();
    }
    
    public void ThemSV(SinhVien x, int k){
       int i;
       SiSo++;
       for(i = SiSo; i >= k; i--){
           Li[i] = Li[i-1];
       }
        Li[k] = x;
    }
    
    public void XoaSV(int k){
        if(k > SiSo || k < 0) {
            System.out.println("Vi tri khong ton tai!");
        }
        else {
            for(int i = 0; i < SiSo; i++){
                if(i == k){
                    Li[i] = Li[i+1];
                    SiSo--;
                }
	    }
        }
    }
    
    public void FindSV_ma(String matim){
        int check = 0;
        for(int i = 0; i < SiSo; i++){
            if(matim.equals(Li[i].getMSV())) {
                    Li[i].Xuat();
                    check = 1;
            }
        }
        if(check == 0) {
            System.out.println("Khong co sinh vien can tim!");
        }
    }
    
    public void FindSV_ten(String tentim){
        int check = 0;
        for(int i = 0; i < SiSo; i++){
            if(tentim.equals(Li[i].getName())) {
                    Li[i].Xuat();
                    check = 1;
            }
        }
        if(check == 0) {
            System.out.println("Khong co sinh vien can tim!");
        }
    }
};

//   BAI TAP CHUONG 3: KE THUA

class ColorsPoint extends Point{
    private int color;
    
    public ColorsPoint(){
        super();
        this.color = 0;
    }
    
    @Override
    public void Nhap(){
        Scanner xy = new Scanner(System.in);
        super.Nhap();
        System.out.print("Color = ");
        color = xy.nextInt();
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Color:  " + color);
    }
            
}

class Person{
    protected String CMND;
    protected String Name;
    protected String Date;
    protected String Address;
    protected String PhoNum;
    
    public Person(){
        this.CMND = "";
        this.Name = "";
        this.Date = "";
        this.Address = "";
        this.PhoNum = "";
    }
    
    public void setCMND(String CMND){
        this.CMND = CMND;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public void setDate(String Date){
        this.Date = Date;
    }
    
    public void setAddress(String Address){
        this.Address = Address;
    }
    
    public void setPhoNum(String PhoNum){
        this.PhoNum = PhoNum;
    }

    public String getCMND() {
        return CMND;
    }
    
    public String getName() {
        return Name;
    }
    
    public String getDate() {
        return Date;
    }

    public String getAddress() {
        return Address;
    }
    
    public String getPhoNum() {
        return PhoNum;
    }
    
    public void Nhap(){
        Scanner xy = new Scanner(System.in);
        System.out.print("Nhap so CMND: ");
        CMND = xy.nextLine();
        System.out.print("Nhap ho ten: ");
        Name = xy.nextLine();
        System.out.print("Nhap ngay sinh: ");
        Date = xy.nextLine();
        System.out.print("Nhap dia chi: ");
        Address = xy.nextLine();
        System.out.print("Nhap so dien thoai: ");
        PhoNum = xy.nextLine();
    }
    
    public void Xuat(){
        System.out.println("CMND: "  + CMND);
        System.out.println("Ho ten: " + Name);
        System.out.println("Ngay sinh: " + Date);
        System.out.println("Dia chi: " + Address);
        System.out.println("So dien thoai: " + PhoNum);
    }
}

class Student extends Person{
    private String MHS, Class, School;
    
    public Student(){
        super();
        this.MHS = "";
        this.Class = "";
        this.School = "";
    }
    
    @Override
    public void Nhap(){
        Scanner xy = new Scanner(System.in);
        super.Nhap();
        System.out.print("Nhap ma hoc sinh: ");
        MHS = xy.nextLine();
        System.out.print("Nhap lop: ");
        Class = xy.nextLine();
        System.out.print("Nhap truong: ");
        School = xy.nextLine();
    }
    
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Ma hoc sinh: "  + MHS);
        System.out.println("Lop: " + Class);
        System.out.println("Truong: " + School);
    }
}

class DoanThang{
    private Point point1, point2;
    
    public void Nhap(){
        System.out.print("Nhap diem 1: ");
        point1.Nhap();
        System.out.print("Nhap diem 2: ");
        point2.Nhap();
    }
    
    public void Xuat(){
        System.out.println("Doan thang gom hai diem: ");
        point1.Xuat();
        point2.Xuat();
    }
    
    public double KhoangCach(){
        double kc;
        double a, b;
        a = point2.getX() - point1.getX();
        b = point2.getY()- point1.getY();
        //kc = Math.sqrt(Math.pow((point2.getX() - point1.getX()),2) + Math.pow((point2.getY()- point1.getY()),2));
        kc = Math.sqrt(a * a + b * b);
        return kc;
    }
}

class Animal{
    protected String Name;
    
    public Animal(){
        this.Name = "";
    }
    
    public Animal(String Name){
        this.Name = Name;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public String getName() {
        return Name;
    }
}

class Cat extends Animal{
    private int Age;
    private float Weight;
    
    public Cat(){
        super();
        this.Age = 0;
        this.Weight = 0;
    }
    
    public Cat(String Name, int Age, float Weight){
        super(Name);
        this.Age = Age;
        this.Weight = Weight;
    }
    
    public void setAge(int Age){
        this.Age = Age;
    }
    
    public int getAge() {
        return Age;
    }
    
    public void setWeight(float Weight){
        this.Weight = Weight;
    }
    
    public float getWeight() {
        return Weight;
    }
}

// BAI TAP - DA HINH

class SVCQ extends SinhVien{
    private String HeDT;
    
    public SVCQ(){
        super();
        this.HeDT = "";
    }
    
    public SVCQ(String MSV, String Name, String Class, float Scores1, float Scores2, float Scores3, String HeDT){
        super(MSV, Name, Class, Scores1, Scores2, Scores3);
        this.HeDT = HeDT;     
    }
    
    public void setHeDT(String HeDT){
        this.HeDT = HeDT;
    }
    
    public String getHeDT() {
        return HeDT;
    }
}

abstract class Animals {
    protected String Name;
    protected int Age;
    protected float Weight;
    
    public Animals() {
        this.Name = "";
        this.Age = 0;
        this.Weight = 0;
    }
    
    public Animals(String Name, int Age, float Weight) {
        this.Name = Name;
        this.Age = Age;
        this.Weight = Weight;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public String getName() {
        return Name;
    }
    
    public void setAge(int Age){
        this.Age = Age;
    }
    
    public int getAge() {
        return Age;
    }
    
    public void setWeight(float Weight){
        this.Weight = Weight;
    }
    
    public float getWeight() {
        return Weight;
    }
    
    public void Nhap(){
        Scanner xy = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        Name = xy.nextLine();
        System.out.print("Nhap tuoi: ");
        Age = xy.nextInt();
        System.out.print("Nhap can nang: ");
        Weight = xy.nextFloat();
    }
    
    public void Xuat(){
        System.out.println("Ten: "  + Name);
        System.out.println("Tuoi: " + Age);
        System.out.println("Can nang: " + Weight);
    }
    public abstract float Tien_an();
};

class CAT extends Animals{
    private String Type;
    
    public CAT(){
        super();
        this.Type = "Cat";
    }
    
    public void setType(String Type){
        this.Type = Type;
    }
   
    public String getType() {
        return Type;
    }
    
    @Override
    public void Nhap(){
        super.Nhap();
    }
    
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Type: Cat");
    }
    
    @Override
    public float Tien_an(){
        float money;
        money = Weight * (float) 0.05;
        return money;
    }
}
        
class Dog extends Animals{
    private String Type;
    
    public Dog(){
        super();
        this.Type = "Dog";
    }
    
    public void setType(String Type){
        this.Type = Type;
    }
   
    public String getType() {
        return Type;
    }
    
    @Override
    public void Nhap(){
        super.Nhap();
    }
    
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Type: Dog");
    }
    
    @Override
    public float Tien_an(){
        float money;
        money = Weight * (float)0.1;
        return money;
    }
}
        
class Rabbit extends Animals{
    private String Type;
    
    public Rabbit(){
        super();
        this.Type = "Rabbit";
    }
    
    public void setType(String Type){
        this.Type = Type;
    }
   
    public String getType() {
        return Type;
    }
    
    @Override
    public void Nhap(){
        super.Nhap();
    }
    
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Type: Rabbit");
    }
    
    @Override
    public float Tien_an(){
        float money;
        money = Weight * (float)0.2;
        return money;
    }
}

class ListAnimal{
    private int n;
    private Animals LA[] = new Animals[n];
    
    public void Nhap(){
        int x;
        Scanner ro = new Scanner(System.in);
        System.out.print("Nhap so thu cung: ");
        n = ro.nextInt();
        System.out.print("Nhap thong tin thu cung: ");
        for(int i = 0; i < n; i++){
        System.out.println("\n 1.Dog    2.Cat    3.Rabbit");
        x = ro.nextInt();
        if(x == 1){
            LA[i] = new CAT();
        }
        else if(x == 2){
            LA[i] = new Dog();
        }
        else{
            LA[i] = new Rabbit();
        }
        LA[i].Nhap();
        }
    }

    public void Xuat(){
        for(int i = 0; i < n; i++){
           LA[i].Xuat();
        }
    }
    
    public float Tong(){
        float S = 0;
        for(int i = 0; i < n; i++){
            S = S + LA[i].Tien_an();
        }
        return S;
    }
};

abstract class Shape{
    
    public Shape(){
    }
    public abstract void Nhap();
    public abstract void Xuat();
    public abstract float ChuVi();
    public abstract float DienTich();
}

class Triangle extends Shape{
    private float edge1;
    private float edge2;
    private float edge3;
    
    public Triangle(){
        super();
        this.edge1 = 0;
        this.edge2 = 0;
        this.edge3 = 0;
    }
    
    @Override
    public void Nhap(){
        Scanner ro = new Scanner(System.in);
        System.out.print("Edge 1 = ");
        edge1 = ro.nextFloat();
        System.out.print("Edge 2 = ");
        edge2 = ro.nextFloat();
        System.out.print("Edge 3 = ");
        edge3 = ro.nextFloat();
    }
    
    @Override
    public void Xuat(){
        System.out.println("Type: Triangle");
        System.out.print("Edge 1 = " + edge1);
        System.out.print("Edge 2 = " + edge2);
        System.out.print("Edge 3 = " + edge3);
    }
    
    public void setEdge1(float edge1){
        this.edge1 = edge1;
    }
   
    public float getEdge1() {
        return edge1;
    }
    
    public void setEdge2(float edge2){
        this.edge2 = edge2;
    }
   
    public float getEdge2() {
        return edge2;
    }
    
    public void setEdge3(float edge3){
        this.edge3 = edge3;
    }
   
    public float getEdge3() {
        return edge3;
    }
    
    @Override
    public float ChuVi(){
        float cv;
        cv = edge1 + edge2 + edge3;
        return cv;
    }
    
    @Override
    public float DienTich(){
        Triangle y = new Triangle();
        float dt;
        float p = (float)0.5 * y.ChuVi();
        dt = (float)Math.sqrt(p*(p - edge1)*(p - edge2)*(p - edge3));
        return dt;
    }
}

class S_Rectangle extends Shape{
    private float length;
    private float width;
    
    public S_Rectangle(){
        super();
        this.length = 0;
        this.width = 0;
    }
    
    public void setLength(float length){
        this.length = length;
    }
   
    public float getLength() {
        return length;
    }
    
    public void setWidth(float width){
        this.width = width;
    }
   
    public float getWidth() {
        return width;
    }
    
    @Override
    public void Nhap(){
        Scanner ro = new Scanner(System.in);
        System.out.print("Length = ");
        length = ro.nextFloat();
        System.out.print("Width = ");
        width = ro.nextFloat();
    }
    
    @Override
    public void Xuat(){
        System.out.println("Type: Rectangle");
        System.out.print("Length = " + length);
        System.out.print("Width = " + width);
    }
    
    @Override
    public float ChuVi(){
        float cv;
        cv = (length + width) * 2;
        return cv;
    }
    
    @Override
    public float DienTich(){
        S_Rectangle y = new S_Rectangle();
        float dt;
        dt = length * width;
        return dt;
    }
}

class Square extends Shape{
    private float edge;
    
    public Square(){
        super();
        this.edge = 0;
    }
    
    public void setEdge(float edge){
        this.edge = edge;
    }
   
    public float getEdge() {
        return edge;
    }
    
    @Override
    public void Nhap(){
        Scanner ro = new Scanner(System.in);
        System.out.print("Edge = ");
        edge = ro.nextFloat();
    }
    
    @Override
    public void Xuat(){
        System.out.println("Type: Square");
        System.out.print("Edge = " + edge);
    }
    
    @Override
    public float ChuVi(){
        float cv;
        cv = edge * 4;
        return cv;
    }
    
    @Override
    public float DienTich(){
        Square y = new Square();
        float dt;
        dt = edge * edge;
        return dt;
    }
}