import java.util.ArrayList;

public class Player {
	private String name;//���a�W��
    private int chips;//�{�����w�X
    private int bet;//�U�`���w�X
    private ArrayList<Card> oneRoundCard;
    public Player(String name, int chips){//���a���غc��
    	oneRoundCard = new ArrayList<Card>();
    	this.name = name;
    	this.chips = chips;
    }
    public String getName(){
    	return name;//�^�Ǫ��a�W��
    }
    public int makeBet(){//�U�`
    	if(chips != 0){//���p�٦��w�X
    		bet = 1;
    	}
    	return bet;
    }
    public void setOneRoundCard(ArrayList<Card> cards){
    	oneRoundCard=cards;//�����}���P
    }
    public boolean hitMe(){
    	int total = getTotalValue();//���o�ثe���쪺�I���`�M
    	if(total<=16)
    		{
    			return true;//�p�󵥩�16�N�A�n�P
    		}
    	else
    		{
    			return false;//�[�p�j��16�^��false
    		}
    }
    public int getTotalValue(){//�o��d�P�[�`���I��
    	int sum = 0;
    	for(int i=0;i<oneRoundCard.size();i++)
    	{
    		 int calc = oneRoundCard.get(i).getRank();//�j����o���쪺�P���I��
    		 if(calc == 11||calc == 12||calc == 13)
    		 	{
    			 	calc =10;
    		 	}
    		sum +=calc;//�p��[�`�� 
    	} 
    	return sum;//�^���`�X
    }
    public int getCurrentChips(){
    	return chips;//�^���w�X
    }
    public void increaseChips (int diff){
    	chips += diff;//��쥻���w�X�[�W�o��Ĺ�ο骺��
    }
    public void sayHello(){//�򪱮a���A�n
    	System.out.println("Hello, I am " + name + ".");
    	System.out.println("I have " + chips + " chips.");
    }

}
