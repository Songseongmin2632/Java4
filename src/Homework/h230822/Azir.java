package Homework.h230822;

import java.util.Scanner;

class Abilities {
		public int[] Stamina=new int[18];//체력
		public double[] StaminaRegeneration=new double[18];//체력 재생
		public int[] Mana=new int[18];//마나
		public double[] ManaRegeneration=new double[18];//마나 재생
		public double[] Damage=new double[18];//공격력
		public double[] AttackSpeed=new double[18];//공격속도
		public double[] Armor=new double[18];//방어력
		public double[] MagicResistance=new double[18];//마법저항력
		public int Range=525;//사거리
		public int MovementSpeed=335;//이동속도
		public int[] Level=new int[18];
		public String Difficulty="상";
		public String DamageAbility="상";
		public String DefenseAbility="하";
		public String CrowdControlAbility="중";
		public String MovementAbility="중";
		public String AssistiveAbility="하";
				
		Abilities() {
			for(int i=0; i<Level.length; i++) {
				Level[i]=i+1;
			}
			for(int i=0; i<18; i++) {				
				if(Level[i]==i+1) {
					Stamina[i]=550+(i*119);
					StaminaRegeneration[i]=7+(i*0.75);
					Mana[i]=320+(i*40);
					ManaRegeneration[i]=8+(i*0.8);
					Damage[i]=52+(i*3.5);
					AttackSpeed[i]=0.625+(i*(0.625*0.06));
					Armor[i]=22+(i*5);
					MagicResistance[i]=30+(i*1.3);										
				}				
			}						
		}				
}
	
	class Skill {
		public String PassiveSkill=
	    "슈리마의 유산(Shurima's Legacy)\r\n"
	   +"아지르는 무너진 포탑 위에 태양 원판을 소환할 수 있습니다.\r\n"
	   +"태양 원판은 마법 피해를 입히고 방어력과 마법 저항력을 가지며 45초에 걸쳐 붕괴됩니다.\r\n"
	   +"이 스킬은 적 넥서스나 억제기 포탑에 사용할 수 없습니다.\r\n"
	   +"아지르가 죽은 상태거나 너무 멀면 태양 원판의 방어력과 마법 저항력이 100 감소합니다.";
		public String FirstSkill=
		"Q-사막의 맹습(Conquering Sands)\r\n"
	   +"아지르가 모든 모래 병사를 지정한 위치로 보냅니다.\r\n"		
	   +"모래 병사는 통과한 적에게 마법 피해를 입히며 1초 동안 25% 둔화시킵니다.\r\n"
	   +"여러 명의 모래 병사가 적을 맞혀도 추가 피해는 입히지 못합니다.";
		public String SecondSkill=
		"W - 일어나라!(Arise!)\r\n"
	   +"아지르가 10초 동안 모래 병사 하나를 소환합니다.\r\n"
	   +"모래 병사 근처에 있는 적을 공격하면 해당 병사에게 공격 명령을 내려 적이 있는 방향에 마법 피해를 입힙니다.\r\n"
	   +"이 스킬은 2회까지 충전됩니다.\r\n"
	   +"모래 병사는 아지르의 공격 대상이 아닌 적에게 일정량의 피해를 입힙니다.\r\n"
	   +"여러 모래 병사가 같은 대상을 공격할 경우, 두 번째로 공격하는 모래 병사부터는 25%의 피해를 입힙니다.\r\n"
	   +"적 포탑 근처에서는 모래 병사가 두 배 빠르게 소멸됩니다.";
		public String ThirdSkill=
		"E - 신기루(Shifting Sands)\r\n"
	   +"아지르가 1.5초 동안 보호막을 얻고 모래 병사 중 하나에게 돌진하여 통과하는 적들에게 마법 피해를 입힙니다.\r\n"
	   +"아지르가 적 챔피언과 부딪히면 그 자리에서 멈추고 모래 병사 중첩을 얻습니다.";		
		public String FourthSkill=
		"R - 황제의 진영(Emperor's Divide)\r\n"
	   +"아지르가 무장한 병사들을 일렬 횡대로 소환하여 돌진시키며, 적들을 밀어내고 마법 피해를 입힙니다.\r\n"
	   +"병사들은 5초 동안 남아 적의 길을 가로막습니다.";
		public int passiveSkillColldown=90;//패시브스킬 쿨타임
		public int passiveSkillRange=400;//패시브스킬 사거리
		
		public int[] FirstSkillManaConsumption=new int[5];//Q스킬 마나 소모량
		public int FirstSkillRange=720/325;//Q스킬 사거리
		public double[] FirstSkillCooldown=new double[5];//Q스킬 쿨타임
		public double[] FirstSkillMagicDamage=new double[5];//Q스킬 마법피해량
		
		public int[] SecondSkillManaConsumption=new int[5];//W스킬 마나소모량
		public int SecondSkillRange=520;//W스킬 사거리
		public double SecondSkillCooldown=1.5;//W스킬 쿨타임
		public double[] SecondSkillDamage=new double[5];//W스킬 피해량
		public int SecondSkillRange2=375;//병사의 공격 사거리
		public int[] SecondSkillCooldown2=new int[5];//병사 충전 시간
		
		public int ThirdSkillManaConsumption=60;//E스킬 마나소모량
		public int ThirdSkillRange=1100;//E스킬 사거리
		public double[] ThirdSkillCooldown=new double[5];//E스킬 쿨타임
		public double[] ThirdSkillDamage=new double[5];//E스킬 피해량
		public double[] ThirdSkillShields=new double[5];//E스킬 피해흡수량
		
		public int FourthSkillManaConsumption=100;//R스킬 마나소모량
		public int FourthSkillRange=250;//R스킬 사거리
		public int[] FourthSkillCooldown=new int[3];//R스킬 쿨타임
		public double[] FourthSkillDamage=new double[3];//R스킬 피해량
		public int[] FourthSkillNumberofsoldiers=new int[3];//R스킬 병사의 수
		
		public int[] SkillLevel=new int[5];//스킬 레벨
		public int CurrentAttackPower=50;//현재 공격력		
		
		Skill() {
			for(int i=0; i<SkillLevel.length; i++) {
				SkillLevel[i]=i+1;
			}
			for(int i=0; i<5; i++) {
				if(SkillLevel[i]==i+1) {
					FirstSkillManaConsumption[i]=70+(i*10);
					FirstSkillCooldown[i]=12-(i*1.5);
					FirstSkillMagicDamage[i]=(60+(i*20))+(0.35*CurrentAttackPower);
					SecondSkillManaConsumption[i]=40-(i*5);
					SecondSkillDamage[i]=(50+(i*17))+(0.6*CurrentAttackPower);
					SecondSkillCooldown2[i]=10-i;
					ThirdSkillCooldown[i]=22-(i*1.5);
					ThirdSkillDamage[i]=(60+(i*40))+(0.4*CurrentAttackPower);
					ThirdSkillShields[i]=(70+(i*40))+(0.6*CurrentAttackPower);			
				}
			}
			for(int j=0; j<3; j++) {
				if(SkillLevel[j]==j+1) {
					FourthSkillCooldown[j]=120-(j*15);
					FourthSkillDamage[j]=(200+(j*200))+(0.75*CurrentAttackPower);
					FourthSkillNumberofsoldiers[j]=6+j;
				}
			}
		}
	}	
	public class Azir {

		public String Job="역할군 : 마법사";
		public String Belong="소속 : 슈리마";
		public String BackGround="배경\r\n"
		"불멸을 꿈꾸던 고대 슈리마의 거만한 황제, 아지르.\r\n"
		"그의 오만은 생애 최전성기에 그를 배반과 죽음으로 몰아넣었다.\r\n"
		"그 후 수천 년이 흘렀고, 아지르는 가공할 힘을 지닌 초월체로 다시 태어났다.\r\n"
		"사막 아래 묻혀 있던 그의 도시가 지표면 위로 솟아오르는 장관을 목도하며 아지르는 슈리마 제국의 옛 영광을 되살리겠노라고 다짐한다.";  
		public String DamageType="공격타입 : 마법(AP)";		
		public String Line="라인 : 미드";	
		
	public static void main(String[] args) {
	    Azir azir=new Azir();
	    System.out.println("아지르(Azir) 사막의 황제(the Emperor of the Sands)");
	    System.out.println(azir.Job);
	    System.out.println(azir.Belong);
	    System.out.println(azir.BackGround);
	    System.out.println();
	    System.out.println(azir.DamageType);	    
	    System.out.println();
	    System.out.println(azir.Line);
	    
	    Scanner sc=new Scanner(System.in);
	    Abilities abilities=new Abilities();
	    System.out.println();
	    System.out.println("능력치");
	    System.out.println("레벨을 입력하세요(1~18)");
	    int num =sc.nextInt();
	    System.out.println("체력 : "+abilities.Stamina[num-1]);
	    System.out.println("체력 재생 : "+abilities.StaminaRegeneration[num-1]);
	    System.out.println("마나 : "+abilities.Mana[num-1]);
	    System.out.println("마나 재생 : "+abilities.ManaRegeneration[num-1]);
	    System.out.println("공격력 : "+abilities.Damage[num-1]);
	    System.out.println("공격속도 : "+abilities.AttackSpeed[num-1]);
        System.out.println("방어력 : "+abilities.Armor[num-1]);
        System.out.println("마법저항력 : "+abilities.MagicResistance[num-1]);
        System.out.println("사거리 : "+abilities.Range);
        System.out.println("이동속도 : "+abilities.MovementSpeed);
        System.out.println("챔피언 난이도 : "+abilities.Difficulty);
        System.out.println("챔피언 공격능력 : "+abilities.DamageAbility);
        System.out.println("챔피언 방어능력 : "+abilities.DefenseAbility);
        System.out.println("군중제어능력 : "+abilities.CrowdControlAbility);
        System.out.println("챔피언 이동능력 : "+abilities.MovementAbility);
        System.out.println("챔피언 보조능력 : "+abilities.AssistiveAbility);
              
        Skill skill=new Skill();
        System.out.println();
        System.out.println("스킬");
        System.out.println();
        System.out.println("스킬 레벨을 입력하세요(1~5)");
        int num1=sc.nextInt();
        System.out.println("패시브스킬\r\n"+skill.PassiveSkill);
        System.out.println("쿨타임 : "+skill.passiveSkillColldown);
        System.out.println("사거리 : "+skill.passiveSkillRange);
        
        System.out.println("첫번째스킬(Q)\r\n"+skill.FirstSkill);
        System.out.println();
        System.out.println("마나소모량 : "+skill.FirstSkillManaConsumption[num1-1]);
        System.out.println("사거리 : "+skill.FirstSkillRange);
        System.out.println("쿨타임 : "+skill.FirstSkillCooldown[num-1]);
        System.out.println("Q스킬 마법피해량 : "+skill.FirstSkillMagicDamage[num1-1]);        
        System.out.println();
        
        System.out.println("두번째스킬(W)\r\n"+skill.SecondSkill);
        System.out.println();
        System.out.println("마나소모량 : "+skill.SecondSkillManaConsumption[num-1]);
        System.out.println("사거리 : "+skill.SecondSkillRange);
        System.out.println("쿨타임 : "+skill.SecondSkillCooldown);
        System.out.println("피해량 : "+skill.SecondSkillDamage[num-1]);
        System.out.println("병사의 공격 사거리 : "+skill.SecondSkillRange2);
        System.out.println("병사 충전 시간 : "+skill.SecondSkillCooldown2[num-1]);
        System.out.println();
        
        System.out.println("세번째스킬(E)\r\n"+skill.ThirdSkill);
        System.out.println();
        System.out.println("마나소모량 : "+skill.ThirdSkillManaConsumption);
        System.out.println("사거리 : "+skill.ThirdSkillRange);
        System.out.println("쿨타임 : "+skill.ThirdSkillCooldown[num1-1]);
        System.out.println("피해량 : "+skill.ThirdSkillDamage[num1-1]);
        System.out.println("피해 흡수량 : "+skill.ThirdSkillShields[num1-1]);        
        System.out.println();
        
        System.out.println("스킬 레벨을 입력하세요(1~3)");
        int num2=sc.nextInt();
        
        System.out.println("네번째스킬(R)\r\n"+skill.FourthSkill);
        System.out.println();
        System.out.println("마나소모량 : "+skill.FourthSkillManaConsumption);
        System.out.println("사거리 : "+skill.FourthSkillRange);
        System.out.println("쿨타임 : "+skill.FourthSkillCooldown[num2-1]);
        System.out.println("피해량 : "+skill.FourthSkillDamage[num2-1]);
        System.out.println("R스킬 병사의 수 : "+skill.FourthSkillNumberofsoldiers[num2-1]);                              	
	}
}


