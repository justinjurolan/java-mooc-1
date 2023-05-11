
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        int thisApartment = this.rooms * this.squares;
        int comparedApartment = compared.rooms * compared.squares;
        
        if (thisApartment > comparedApartment) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int thisApartmentPrice = this.pricePerSquare * this.squares;
        int comparedApartmentPrice = compared.pricePerSquare * compared.squares;
        
        return Math.abs(thisApartmentPrice - comparedApartmentPrice);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int thisApartmentPrice = this.pricePerSquare * this.squares;
        int comparedApartmentPrice = compared.pricePerSquare * compared.squares;
        
        return thisApartmentPrice > comparedApartmentPrice;
        
    }
    
    

}
