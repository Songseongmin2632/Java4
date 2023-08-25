package Homework.h230822;

import java.util.Scanner;

public class JiwooAdventure {

	public static void main(String[] args) {
		
		int start=0;
		int temp1=0;
		int back=0;		
		Scanner sc=new Scanner(System.in);
		System.out.println("-JiwooAdventure-");
		System.out.println("    -게임시작-    ");			
		start=sc.nextInt();
		
		while(true) {
		System.out.println("-Main-");
		System.out.println("<상점>(1)");
		System.out.println("<던전 입장>(2)");
		System.out.println("<플레이어 정보>(3)");
		System.out.println("<게임종료>(0)");
		temp1=sc.nextInt();
		
		if(temp1==0) {
			System.out.println("-End-");
			break;
		}
		if(temp1==3) {					
		PlayerInformation playerInformation = new PlayerInformation();
		System.out.println("이름 : "+playerInformation.getPlayerName());
		System.out.println("레벨 : "+playerInformation.getLevel());
		System.out.println("공격력 : "+playerInformation.getPlayerPower());
		System.out.println("공격속도 : "+playerInformation.getPlayerAttackSpeed());
		System.out.println("체력 : "+playerInformation.getPlayerHp());
		System.out.println("마나 : "+playerInformation.getPlayerMp());
		System.out.println("소지금 : "+playerInformation.getPlayerMoney());
		System.out.println();
		System.out.println("메인화면으로 돌아가기");
		back=sc.nextInt();		
			}
		}
	}
}
class Shop {
	
	
}
class MainMenu {
	
}
class PlayerInformation {
	private final String playerName="지우";
	private int level=1;//플레이어 레벨
	private double playerPower=10;//플레이어 공격력
	private int playerAttackSpeed=10;//플레이어 공격속도
	private double playerHp=100;//플레이어 체력	
	private int playerMp=100;//플레이어 마나
	private int playerMoney=100;//플레이어 소지금
	
	public void setPlayerName(String playerName) {
		playerName="지우";		
	}
	    public String getPlayerName() {
	    	return playerName;
	    }
	    
	public void setLevel(int level) {
	    level=1;
	}
	    public int getLevel() {
	    	return level;
	    }
	    
	public void setPlayerPower(double playerPower) {
		playerPower=10;
	}
	    public double getPlayerPower() {
	    	return playerPower;
	    }
	
	public void setPlayerAttackSpeed(int playerAttackSpeed) {
	    playerAttackSpeed=10;
    }
		public int getPlayerAttackSpeed() {
		    return playerAttackSpeed;
		}
		
	public void setPlayerHp(double playerHp) {
		playerHp=100;
	}
	    public double getPlayerHp() {
	    	return playerHp;
	    }
	    		    
	public void setPlayerMp(int playerMp) {
		playerMp=100;
	}
	    public int getPlayerMp() {
	    	return playerMp;
	    }
	    
	public void setPlayerMoney(int playerMoney) {
		playerMoney=100;
	}
	    public int getPlayerMoney() {
	    	return playerMoney;
	    }
}


class Stage {
	
}
class Battle {
	
}