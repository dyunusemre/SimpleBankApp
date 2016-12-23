/**
 * Created by Yunus Emre on 25.11.2016.
 */
public class NegativeAmountException extends AccountException {

    public NegativeAmountException(){

        super("NEGATIVE AMOUNT"); // eğer işlem yapılan miktar negatif bir değere sahip ise

    }

}
