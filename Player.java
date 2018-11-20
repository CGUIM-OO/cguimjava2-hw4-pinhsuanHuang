import java.util.ArrayList;

public class Player {
	private String name;//玩家名稱
    private int chips;//現有的籌碼
    private int bet;//下注的籌碼
    private ArrayList<Card> oneRoundCard;
    public Player(String name, int chips){//玩家的建構式
    	oneRoundCard = new ArrayList<Card>();
    	this.name = name;
    	this.chips = chips;
    }
    public String getName(){
    	return name;//回傳玩家名稱
    }
    public int makeBet(){//下注
    	if(chips != 0){//假如還有籌碼
    		bet = 1;
    	}
    	return bet;
    }
    public void setOneRoundCard(ArrayList<Card> cards){
    	oneRoundCard=cards;//拿打開的牌
    }
    public boolean hitMe(){
    	int total = getTotalValue();//取得目前拿到的點數總和
    	if(total<=16)
    		{
    			return true;//小於等於16就再要牌
    		}
    	else
    		{
    			return false;//加如大於16回傳false
    		}
    }
    public int getTotalValue(){//得到卡牌加總的點數
    	int sum = 0;
    	for(int i=0;i<oneRoundCard.size();i++)
    	{
    		 int calc = oneRoundCard.get(i).getRank();//迴圈取得拿到的牌的點數
    		 if(calc == 11||calc == 12||calc == 13)
    		 	{
    			 	calc =10;
    		 	}
    		sum +=calc;//計算加總值 
    	} 
    	return sum;//回傳總合
    }
    public int getCurrentChips(){
    	return chips;//回傳籌碼
    }
    public void increaseChips (int diff){
    	chips += diff;//把原本的籌碼加上這局贏或輸的錢
    }
    public void sayHello(){//跟玩家說你好
    	System.out.println("Hello, I am " + name + ".");
    	System.out.println("I have " + chips + " chips.");
    }

}
