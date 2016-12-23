/**
 * Created by Yunus Emre on 25.11.2016.
 */
public class BankOffice implements Cloneable  {

    private String bankName;
    private String branchName;
    private String branchAdress;
    Account[] accounts;

    public BankOffice(String bank_name, String branch_name, String branch_adress,Account[] acc){

        setBankName(bank_name);
        setBranchName(branch_name);
        setBranchAdress(branch_adress);
        setAccounts(acc);

    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchAdress() {
        return branchAdress;
    }

    public void setBranchAdress(String branchAdress) {
        this.branchAdress = branchAdress;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {

         String acc = null;

        for(int i = 0; i < this.accounts.length; i++){

            acc += this.accounts[i].toString();

        }

        return String.format("%s: %s\n" +
                        "%s: %s" +
                        "\n%s %s" +
                        "\n%s: %s\n",
                "Bank Name", getBankName(),
                "Branch Name", getBranchName(),
                "Branch Adress", getBranchAdress(),
        "Accounts",acc) ;

    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }else if(obj == null){
            return false;
        }else if(obj instanceof BankOffice){

            BankOffice checkBank = (BankOffice) obj;
            if (checkBank.getBankName() == this.getBankName() && checkBank.getBranchName() == this.getBranchName() && checkBank.getBranchAdress() == this.getBranchAdress()){

                for (int i = 0; i < this.getAccounts().length; i++ ){

                    if(!accounts[i].equals(checkBank.getAccounts()[i])){

                        return false;
                    }
                }

                return true;

            }

        }

        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        BankOffice bO = (BankOffice) super.clone();
        bO.setAccounts(getCopyAccounts());

        return bO;

    }

    private Account[] getCopyAccounts(){

        Account[] copiedAccounts = accounts.clone();

        for(int i = 0; i < this.accounts.length; i ++){

            try{

                copiedAccounts[i] = (Account) this.accounts[i].clone();

            }catch (CloneNotSupportedException e){

                e.printStackTrace();
            }
        }
        return copiedAccounts;
    }


}
