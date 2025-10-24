package exceptions;

public class RulesWithdraw extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public RulesWithdraw(String msg){
        super(msg);
    }
}
