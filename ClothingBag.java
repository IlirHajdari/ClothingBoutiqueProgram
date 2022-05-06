public final class ClothingBag<T> implements BagInterface<T>
{
    private final T[] myBag;
    private int numberOfProducts;
    private boolean initialized = false;
    private static final int DEFAULT_CAPACITY = 5;
    private static final int MAX_CAPACITY = 10;

    //Creates empty bag with default size
    public ClothingBag()
    {
        this(DEFAULT_CAPACITY);
    }

    //Creates empty bag with initial capacity
       // @param capacity  The integer capacity desired.
    public ClothingBag(int capacity)
    {
        if (capacity <= MAX_CAPACITY)
        {
            //unchecked cast
            @SuppressWarnings("unchecked")
            T[] tempClothingBag = (T[])new Object[capacity];
            myBag = tempClothingBag;
            numberOfProducts = 0;
            initialized = true;
        }
        else
            throw new IllegalStateException("Attempt to create a bag whose capacity exceeds allowed maximum.");
    }

    //Throws an exception if object is not initialized
    private void checkInitialization()
    {
        if (!initialized)
            throw new SecurityException("ClothingBag object is not initialized properly.");
    }

    // Adds a new product to clothing bag.
    //@param newProduct the object to be added as a new clothing product.
    //@return True if the addition is successful or false if not successful.
    public boolean add(T newProduct)
    {
        checkInitialization();
        boolean result = true;
        if (isFull())
        {
            result = false;
        }
        else
        {
            myBag[numberOfProducts] = newProduct;
            numberOfProducts++;
        }

        return result;
    }

    //Retrieve all clothing bag entries
    public T[] toArray()
    {
        checkInitialization();
        //unchecked cast
        @SuppressWarnings("unchecked")
        T[] result = (T[])new Object[numberOfProducts];
        System.out.println("result array allocated");
        for(int index = 0; index < numberOfProducts; index++)
        {
            result[index] = myBag[index];
        }

        return result;
    }

    // Returns true if the clothingBag is full, or false if not full
    private boolean isFull()
    {
        return numberOfProducts >= myBag.length;
    }
}
