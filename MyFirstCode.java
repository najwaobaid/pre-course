package myfirstproject;

public class MyFirstCode {
    public static void main(String[] args) {
        //  FemaleClothesClothes mClothes = new MenClothes();

       
        Clothes generalClothes= new Clothes("H&M",30,"blue","Jacket");
        FemaleClothes femaleClothes = new FemaleClothes("Outfitters",32,"black","Cargo");
        MenClothes maleClothes = new MenClothes();
     

        femaleClothes.category();
        generalClothes.price();
        femaleClothes.price();
        maleClothes.price();
     
    }
}

class Clothes{
    String brandName;
    int sizek;
    int lenght;
    String type;
    int price;
    String quality;
    int stock;
    String owner;


    void price() {
    System.out.println("Clothes: Normal price");
}
    Clothes() {
    }

    Clothes(String brand, int size, String color, String type) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.type = type;
    
    }

    void display(){
    System.out.print("stock"+stock);
}
}



class MenClothes extends Clothes {


void price() {
    System.out.println("Men's Clothes: Cheaper");
}

    void category() {
        System.out.println("Category: Men's Clothes " + brand);
    }
}

class FemaleClothes extends Clothes {

  
void price() {
    System.out.println("Female's Clothes: Expensive");
}
  FemaleClothes() {
    }
    FemaleClothes(String brand, int size, String color, String type) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.type = type;
    
    }


    
    void category() {
        System.out.println("Category: Female's Clothes " + brand);
    }
}

class ChildClothes extends Clothes {

    void category() {
        System.out.println("Category: Chlid's Clothes ");
    }
}



