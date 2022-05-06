public class BoutiqueBagDemo {

    public static void main(String[] args) {
        //Adding to an empty clothing bag
    	
        System.out.println("Testing an empty bag with the default capacity of holding 5 strings");
        System.out.println("");
        BagInterface<String> aClothingBag = new ClothingBag<> ();
        String[] contentsOfBag1 = {"Blue Jeans", "Gray Shirt", "Black Hat", "Black Shoes", "Brown Belt", "White Shoes"};
        testAdd(aClothingBag, contentsOfBag1);

        // Filling empty bag to capacity
        System.out.println("Filling the empty bag to capacity, testing to ensure it stays within its max number of 10 items.");
        System.out.println("");
        aClothingBag = new ClothingBag<>(10);
        String[] contentsOfBag2 = {"Baseball Cap", "Blue Jeans", "Sun Glasses", "Black Shoes", "Red Shirt", "Brown Belt", "Wrist Watch", "Black Socks", "Brown Wallet", "Blue Shirt", "Black Pants"};
        testAdd(aClothingBag, contentsOfBag2);
    }

    //Tests add method
    private static void testAdd(BagInterface<String> aClothingBag, String[] content)
    {
        System.out.print("Adding " + content.length + " items to the bag: ");
        for (int index = 0; index < content.length; index++)
        {
            if(aClothingBag.add(content[index]))
                System.out.print(content[index] + ", ");
            else
                System.out.print("Unable to add " + content[index] + " to the bag.");
        }
        System.out.println();

        displayBag(aClothingBag);
    }

    // Tests array method and displays bag
    private static void displayBag(BagInterface<String> aClothingBag)
    {
        System.out.println("The clothing bag contains the following items:");
        Object[] clothingBag = aClothingBag.toArray();
        for (int index = 0; index < clothingBag.length; index++)
        {
            System.out.print(clothingBag[index] + ", ");
        }
        System.out.println();
    }
}