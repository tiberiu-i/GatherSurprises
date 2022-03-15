package surprise;

public interface IBag {

	// adds a surprise in the bag - ca sa pui toate obiectele de tipuri diferite -
	// cookie, candy, toy in acelasi arraylist
	void put(ISurprise newSurprise);

	// adds all the surprises from another IBag
	// -> the 'bagOfSurprises' will be empty() afterwards
	void put(IBag bagOfSurprises);

	// removes a surprise from the bag and returns it
	ISurprise takeOut();

	// Checks if the bag is empty or not
	boolean isEmpty();

	// Returns the number of surprises
	int size();
}