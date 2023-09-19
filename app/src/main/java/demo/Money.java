package demo;

public class Money {
    //Etoffons la classe Money qui représente un montant amount entier dans une devise currency donnée.
// Ajoutez à l’aide de votre IDE un constructeur ainsi qu’une méthode toString().
// Créez une nouvelle classe Main dans le répertoire src/main/java dans laquelle vous allez créer une
// méthode main avec un instance de la classe Money représentant 42€ (42, ‘’EUR‘’) et l’afficher avec
// System.out.println(). Exécutez votre méthode Main.main.

    private int amount;
    private String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String toString() {
        return amount + " " + currency;
    }


    public Money add(Money that) {
         
        return new Money(this.amount+that.amount,this.currency);
    } 
 
 
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Money)) {
            return false;
        }
        Money money = (Money) obj;
        return amount == money.amount;
    }
 
    


    
}
