/**
 * Created by blstream on 3/2/2016.
 */
public class MakKwak {
    private int customersNumber;

    public MakKwak(int customersNumber) {
        this.customersNumber = customersNumber;
    }

    public void simualate(){
        for(int i = 0; i < customersNumber; i++){
            System.out.print("Customer " + (i + 1) + " ");
            if((i + 1) % 15 == 0)
                System.out.println("MakKwak");
            else if((i + 1) % 3 == 0)
                System.out.println("Mak");
            else if((i + 1) % 5 == 0)
                System.out.println("Kwak");
            else
                System.out.println();



        }
    }
}
