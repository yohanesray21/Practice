
public class RelationInterfaceTest {

    public static void main(String[] args) {
        Person ps1 = new Person();
        Person ps2 = new Person("Si Ganteng","Simalingkar","Medan",21,'L');
        Person ps3 = new Person(p2);
        System.out.println(ps1.toString());
        System.out.println(ps2.toString());
        System.out.println(ps3.toString());
        
        System.out.println(ps2.isEquals(p1));
        System.out.println(ps2.isEquals(p3));
        
        Subject s1 = new Subject(); 
        Subject s2 = new Subject("112110","PBO",3,50000);
        Subject s3 = new Subject(s2);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        System.out.println(s2.isEquals(s1));
        System.out.println(s2.isEquals(s3));

        Point p1 = new Point(); //nilai x dan y adalah 0(silahkan liat constructor)
        System.out.println(p1.toString()); //cek method toString() pada Point.java
        p1.display(); //cek method display() pada Point.java dan bandingkan

        Point p2 = new Point(2, 3);
        System.out.println(p2.toString());
        p2.display();

        Point p3 = new Point(p2);
        //kita memiliki 3 kosntruktor, salah satunya memiliki parameter berupa objek Point itu sendiri
        //sehingga nilai p3 akan sama dengan objek yang menjadi parameternya(p2)
        System.out.println(p3.toString());
        p3.display();

        //memanggil method untuk membandingkan p1 dengan p2
        //jika p1 lebih besar dari p2 maka nilai yang dikembalikan adalah true, jika tidak nilai yang dikembalikan adalah false
        System.out.println(p1.isGreaterThan(p2));

        //memanggil method untuk membandingkan p1 dengan p2
        //jika p1 lebih kecil dari p2 maka nilai yang dikembalikan adalah true,jika tidak nilai yang dikembalikan adalah false
        System.out.println(p1.isLessThan(p2));

        //memanggil method untuk membandingkan p1 dengan p2
        //jika p1 sama dengan p2 maka nilai yang dikembalikan adalah true,jika tidak nilai yang dikembalikan adalah false
        System.out.println(p1.isEquals(p2));

        Circle c1 = new Circle();
        //lihat pada konstruktor point, konstructor Circle() akan mengeset nilai p1 dengan konstruktor Point()
        //sehingga nilai point adalah 0
        System.out.println("Nilai point pada c1 : " + c1.getP1());
        System.out.println("Keliling = " + c1.getCircumference());

        Circle c2 = new Circle(p2, 3);
        //Nilai point pada c2 adalah p2 sehingga nilai x dan y pada c2 sama dengan p2 yaitu x =2, y=3
        System.out.println("Nilai point pada c2 : " + c2.getP1());
        System.out.println("Keliling = " + c2.getCircumference());

        Circle c3 = new Circle(c2); //sama seperti penjelasan p3
        System.out.println("Nilai point pada c3 : " + c3.getP1());
        System.out.println("Keliling = " + c3.getCircumference());

        Rectangle r1 = new Rectangle();
        System.out.println("Nilai point pada r1 : " + r1.getP1() + r1.getP2());
        System.out.println("Keliling = " + r1.getCircumference());

        Rectangle r2 = new Rectangle(p1, p2);
        System.out.println("Nilai point pada r2 : " + r2.getP1() + r2.getP2());
        System.out.println("Keliling = " + r2.getCircumference());

        Rectangle r3 = new Rectangle(r2);//sama seperti p3
        System.out.println("Nilai point pada r3 : " + r3.getP1() + r3.getP2());
        System.out.println("Keliling = " + r3.getCircumference());
    
    }
}
