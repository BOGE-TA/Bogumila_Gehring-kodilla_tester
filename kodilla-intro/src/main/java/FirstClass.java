public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000);
        System.out.println("notebook: " + notebook.weight + " " + notebook.price);
        notebook.checkPrice();

        Notebook heavyNotebook = new Notebook (2000, 1500);
        System.out.println("heavyNotebook.weight: " + heavyNotebook.weight);
        System.out.println("heavyNotebook.price: " + heavyNotebook.price);
        heavyNotebook.checkPrice();

        Notebook oldNotebook = new Notebook (1600, 500);
        System.out.println("oldNotebook.weight: " + oldNotebook.weight);
        System.out.println("oldNotebook.price: " + oldNotebook.price);
        oldNotebook.checkPrice();
        if (notebook.price < 900) {
            System.out.println("This notebook is cheap.");
        } else{
            System.out.println("This notebook is quite expensive.");
        }
    }
}