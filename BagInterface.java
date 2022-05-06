public interface BagInterface<T> {

	/** Add a new entry to the bag
	    input to this method is newEntry; this is the object to be added
	    this method will return true if the addition was successful; false if not */
    public boolean add(T newEntry);

	/** Return all the entries in the bag and store them in an array */
    public T[] toArray();

}