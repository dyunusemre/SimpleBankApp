/**
 * Created by Yunus Emre on 25.11.2016.
 */
public class InsufficientFundException extends AccountException {

    public InsufficientFundException(){

        super("INSUFFICIENT FUND "); //Eğer hesapta yeterli miktarda para yoksa

    }

}
