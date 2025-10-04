
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
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int totalCentsThis = this.euros * 100 + this.cents;
        int totalCentsDecreaser = decreaser.euros * 100 + decreaser.cents;

        int resultCents = totalCentsThis - totalCentsDecreaser;

        if (resultCents < 0) {
            resultCents = 0;
        }
        
        int newEuros = resultCents / 100;
        int newCents = resultCents % 100; 

        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
}
