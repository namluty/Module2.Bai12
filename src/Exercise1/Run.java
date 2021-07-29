package Exercise1;

public class Run {
    public static void main(String[] args) {
        Product pd1 = new Product(1,15,"1");
        Product pd2 = new Product(3,18,"2");
        Product pd3 = new Product(5,12,"3");
        Product pd4 = new Product(2,20,"4");
        Product pd5 = new Product(4,17,"5");
        ProductManager huyNam = new ProductManager();
        huyNam.add(pd1);
        huyNam.add(pd2);
        huyNam.add(pd3);
        huyNam.add(pd4);
        huyNam.add(pd5);
        System.out.println();
        huyNam.sortDown();
        huyNam.displayList();
        System.out.println();
        huyNam.sortUp();
        huyNam.displayList();
    }
}
