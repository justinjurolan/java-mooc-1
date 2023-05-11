
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        int euroThis = this.euros(); 
        int euroCompared = compared.euros(); 
        int thisCent = this.cents();
        int comparedCent = compared.cents();
        if (euroThis < euroCompared) {
            return true;
        }
        if (euroThis == euroCompared && thisCent < comparedCent) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
       
        int euroDiff = this.euros - decreaser.euros();
        int centsDiff = this.cents - decreaser.cents();
        int totalDiff = euroDiff * 100 + centsDiff;
        
        if (totalDiff <= 0) {
            return new Money(0,0);
        } 
        
        int euro = totalDiff / 100;
        int cents = totalDiff % 100;
        return new Money(euro, cents);
    }

}
