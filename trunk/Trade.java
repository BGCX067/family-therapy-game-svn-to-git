package family;

public class Trade {
    private int playerIndex;
    private String tradecard;
    private String mycard;
    
    public int getPlayerIndex() {
        return playerIndex;
    }
    
    public String getTradecard() {
        return tradecard;
    }
    
    public String getCardName() {
        return mycard;
    }
    
    public String makeMessage() {
        String message = GameControl.instance().getCurrentPlayer() + 
        	" wants to trade " +
        	mycard + " with " + 
        	GameControl.instance().getPlayer(playerIndex) +
        	"'s " + tradecard + ".  " + 
        	GameControl.instance().getPlayer(playerIndex) +
        	", do you wants to trade your card?";
        return message;
    }
    
    public void setTradecard(String tradecard) {
        this.tradecard = tradecard;
    }
    
    public void setCardName(String mycard) {
        this.mycard = mycard;
    }
    
    public void setSellerIndex(int playerIndex) {
        this.playerIndex = playerIndex;
    }        
        
}
