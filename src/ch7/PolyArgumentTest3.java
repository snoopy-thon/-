package ch7;
// 예제 7-23
import java.util.*;
class Product23 {
    int price;
    int bonusPoint;

    Product23(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    Product23(){
        price = 0;
        bonusPoint = 0;
    }
}

class Tv23 extends Product23{
    Tv23(){ super(100);}
    public String toString() { return "Tv"; }
}

class Computer23 extends Product23{
    Computer23() {super(200);}
    public String toString() { return "Computer"; }
}

class Audio23 extends Product23{
    Audio23() { super(50); }
    public String toString() { return "Audio"; }
}

class Buyer23{
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();     // 구입한 제품을 저장하는데 사용될 Vector 객체

    void buy(Product23 p){
        if(money < p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void refund(Product23 p){
        if(item.remove(p)){
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품하셨습니다.");
        } else{
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        if(item.isEmpty()){
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        for (int i=0; i<item.size(); i++){
            Product23 p = (Product23)item.get(i);
            sum += p.price;
            itemList += (i==0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}
public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer23 b = new Buyer23();
        Tv23 tv = new Tv23();
        Computer23 com = new Computer23();
        Audio23 audio = new Audio23();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }

}
