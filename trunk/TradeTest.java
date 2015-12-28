package family;

import family.GameControl;
import family.Trade;

public class TradeTest{
    
    public void setUp() {
    	GameControl gamePlayer = GameControl.instance();
        gamePlayer.reset();
        gamePlayer.setNumberOfPlayers(2);
        gamePlayer.getPlayer(0).setName("Player");
        gamePlayer.getPlayer(1).setName("Trader");
    }

    public void testMakeMessage() {
        Trade deal = new Trade();
        deal.setTradecard("Tool card");
        deal.setCardName("Help card");
        deal.setSellerIndex(1);
        GameControl.instance().getPlayer(0);
        String message = "Player wants to trade Help card with Trader" +
        		"'s Tool card.  Trader, do you want to trade your card?";
    }

}
