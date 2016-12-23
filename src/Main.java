import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {


        ArrayList<Account> AccList = new ArrayList<Account>();
        AccList.add(new Account(444,33434));
        AccList.add(new Account(444,33434));
        AccList.add(new Account(444,33434));
        AccList.add(new Account(444,33434));



       Account[] accounts = new Account[10];

        accounts[0] = new Account(123,124512);
        accounts[1] = new Account(124,988);
        accounts[2] = new Account(125,76555);
        accounts[3] = new Account(126,4564);
        accounts[4] = new Account(127,1123);
        accounts[5] = new Account(128,2);
        accounts[6] = new Account(129,231);
        accounts[7] = new Account(130,55);
        accounts[8] = new Account(131,1122);
        accounts[9] = new Account(132,11233);


        try {
            accounts[0].depositMoney(44.3);

        } catch (NegativeAmountException e) {
            e.getMessage();
        }

        try {
            accounts[5].withdrawMoney(750);

        } catch (NegativeAmountException e) {
            e.getMessage();
        } catch (InsufficientFundException e) {
            e.getMessage();
        }


        BankOffice isBank = new BankOffice("İŞ BANKASI","Bornova Şubesi","Mustafa Kemal Caddesi Bornova/İzmir",accounts);


        BankOffice isBank2 = null;

        try{

            isBank2 = (BankOffice) isBank.clone();

        }catch (CloneNotSupportedException e){

            e.getMessage();

        }

        System.out.println(isBank.toString());
        System.out.println(isBank2.toString());

        if (isBank2.equals(isBank)){

            System.out.println("Objeler eşittir");

        }else {
            System.out.println("Objeler eşit degil");
        }

        System.out.println();
        System.out.println();

        try {
            isBank.getAccounts()[1].withdrawMoney(30);
        } catch (NegativeAmountException e) {
            e.printStackTrace();
        } catch (InsufficientFundException e) {
            e.printStackTrace();
        }


        System.out.println();
        System.out.println();


        System.out.println(isBank.toString());
        System.out.println(isBank2.toString());

        if (isBank2.equals(isBank)){

            System.out.println("Objeler eşittir");

        }else {
            System.out.println("Objeler eşit degil");
        }


    }



}
