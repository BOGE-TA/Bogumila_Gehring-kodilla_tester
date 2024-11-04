public class Notebook {
    int weight;
    int price;
    public Notebook(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }
    public void checkPrice(){
        if (this.price <900) {
            System.out.println("This notebook is cheap.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }
}