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
		public int Range=550;//사거리
		public int MovementSpeed=330;//이동속도
		public int[] Level=new int[18];
		public String Difficulty="중";
		public String DamageAbility="상";
		public String DefenseAbility="하";
		public String CrowdControlAbility="중";
		public String MovementAbility="상";
		public String AssistiveAbility="하";
				
		Abilities() {
			for(int i=0; i<Level.length; i++) {
				Level[i]=i+1;
			}
			for(int i=0; i<18; i++) {				
				if(Level[i]==i+1) {
					Stamina[i]=590+(i*96);
					StaminaRegeneration[i]=2.5+(i*0.6);
					Mana[i]=418+(i*25);
					ManaRegeneration[i]=8+(i*0.8);
					Damage[i]=53+(i*3);
					AttackSpeed[i]=0.668+(i*(0.668*0.02));
					Armor[i]=21+(i*4.7);
					MagicResistance[i]=30+(i*1.3);										
				}				
			}						
		}				
}
	
	class Skill {
		public String PassiveSkill=
	    "정기 흡수(Essence Theft)\r\n"
	   +"미니언이나 몬스터를 처치하면 아리가 정기 조각을 얻습니다.\r\n"
	   +"조각을 9개 모으면 전부 소모해 체력을 회복합니다.\r\n"
	   +"아리가 적 챔피언에게 피해를 입힌 후 3초 안에 해당 챔피언 처치에 관여하면 그 정기를 삼켜 체력을 회복합니다.\r\n";	   	   
		public String FirstSkill=
		"Q-현혹의 구슬(Orb of Deception)\r\n"
	   +"아리가 구슬을 던진 후 다시 받습니다.\r\n"		
	   +"던질 때는 마법 피해를 입히며 돌아올 때는 고정 피해를 입힙니다."; 
		public String SecondSkill=
		"W - 여우불(Fox-Fire)\r\n"
	   +"아리가 근처 적에게 날아가는 여우불 세 개를 방출하여 마법 피해를 입힙니다.\r\n"
	   +"첫 번째 여우불이 적중한 후에는 마법 피해량이 감소합니다.\r\n"
	   +"또한 이동 속도가 40% 증가했다가 2초에 걸쳐 원래대로 돌아옵니다";
		public String ThirdSkill=
		"E - 매혹(Charm)\r\n"
	   +"아리가 키스를 날려 첫 번째로 맞는 적을 일정 시간 매혹하고 마법 피해를 입힙니다.";  
		public String FourthSkill=
		"R - 혼령 질주(Spirit Rush)\r\n"
	   +"아리가 민첩하게 질주하며 챔피언을 우선으로 근처 적에게\r\n"
	   +"혼령의 정기 3개를 쏘아내 정기 하나당 마법 피해를 입힙니다.\r\n"
	   +"혼령 질주가 활성화되어 있는 동안 정기 흡수로 챔피언의 정기를 흡수하면\r\n"
	   +"스킬 재사용의 지속 시간을 최대 10초 늘리고 혼령 질주 시전을 추가로 1회 부여합니다. (최대 3회까지 중첩)";	   	   
		public int[] FirstSkillManaConsumption=new int[5];//Q스킬 마나 소모량
		public int FirstSkillRange=880;//Q스킬 사거리
		public int FirstSkillCooldown=7;//Q스킬 쿨타임
		public double[] FirstSkillMagicDamage=new double[5];//Q스킬 마법피해량
		public double[] FirstSkillFixedDamage=new double[5];//Q스킬 고정피해량
		public int FirstSkillProjectileVelocity=1700;//Q스킬 투사체 속도
		public int SecondSkillManaConsumption=30;//W스킬 마나소모량
		public int SecondSkillRange=700;//W스킬 사거리
		public int[] SecondSkillCooldown=new int[5];//W스킬 쿨타임
		public double[] SecondSkillDamage=new double[5];//W스킬 피해량
		public double[] SecondSkillDamage2=new double[5];//단일 대상 적중시 피해량
		public int ThirdSkillManaConsumption=60;//E스킬 마나소모량
		public int ThirdSkillRange=975;//E스킬 사거리
		public double ThirdSkillCooldown=14;//E스킬 쿨타임
		public double[] ThirdSkillDamage=new double[5];//E스킬 피해량
		public double[] ThirdSkillCCTime=new double[5];//E스킬 군중제어 지속시간
		public double ThirdSkillProjectileSpeed=1600;//E스킬 투사체속도
		public int FourthSkillManaConsumption=100;//R스킬 마나소모량
		public int FourthSkillRange=450;//R스킬 사거리
		public int[] FourthSkillCooldown=new int[3];//R스킬 쿨타임
		public double[] FourthSkillDamage=new double[3];//R스킬 피해량
		public int FourthSkillCooldown2=1;//R스킬 연속 시전 시 쿨타임
		public int FourthSkillProjectileRange=600;//R스킬 투사체 사거리
		public int[] SkillLevel=new int[5];//스킬 레벨
		public int CurrentAttackPower=50;//현재 공격력		
		
		Skill() {
			for(int i=0; i<SkillLevel.length; i++) {
				SkillLevel[i]=i+1;
			}
			for(int i=0; i<5; i++) {
				if(SkillLevel[i]==i+1) {
					FirstSkillManaConsumption[i]=55+(i*10);
					FirstSkillMagicDamage[i]=(40+(i*25))+(0.45*CurrentAttackPower);
					FirstSkillFixedDamage[i]=(40+(i*25))+(0.45*CurrentAttackPower);
					SecondSkillCooldown[i]=9-(i);
					SecondSkillDamage[i]=(50+(i*25))+(0.3*CurrentAttackPower);
					SecondSkillDamage2[i]=(80+(i*40))+(0.48*CurrentAttackPower);
					ThirdSkillDamage[i]=(80+(i*30))+(0.6*CurrentAttackPower);
					ThirdSkillCCTime[i]=1.2+(i*0.2);
				}
			}
			for(int j=0; j<3; j++) {
				if(SkillLevel[j]==j+1) {
					FourthSkillCooldown[j]=130-(j*25);
					FourthSkillDamage[j]=(60+(j*30))+(0.35*CurrentAttackPower);
				}
			}
		}
	}	
	public class Ahri {

		public String Job="역할군 : 마법사(암살자)";
		public String Belong="소속 : 아이오니아";
		public String BackGround="배경\r\n"
	   +"룬테라가 가진 잠재력과 선천적으로 연결된 아리는 마법을 순수한 에너지의 구체로 변환할 수 있는 바스타야다.\r\n"
	   +"아리는 먹잇감의 감정을 질리도록 조종하며 가지고 놀다가 마지막에 생명의 정수를 흡수하는 것을 즐긴다.\r\n"
	   +"타고난 포식자지만, 먹어치우는 영혼에 담긴 기억의 편린을 받아들일 때마다 거기에 감정 이입하게 된다.";		 	  
		public String DamageType="공격타입 : 마법(AP)";		
		public String Line="라인 : 미드";	
		
	public static void main(String[] args) {
	    Ahri ahri=new Ahri();
	    System.out.println("아리(Ahri) 구미호(the Nine-Tailed Fox)");
	    System.out.println(ahri.Job);
	    System.out.println(ahri.Belong);
	    System.out.println(ahri.BackGround);
	    System.out.println();
	    System.out.println(ahri.DamageType);
	    System.out.println();	    	   	    
	    System.out.println(ahri.Line);
	    
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
        System.out.println();
        
        System.out.println("첫번째스킬(Q)\r\n"+skill.FirstSkill);
        System.out.println();
        System.out.println("마나소모량 : "+skill.FirstSkillManaConsumption[num1-1]);
        System.out.println("사거리 : "+skill.FirstSkillRange);
        System.out.println("쿨타임 : "+skill.FirstSkillCooldown);
        System.out.println("Q스킬 마법피해량 : "+skill.FirstSkillMagicDamage[num1-1]);
        System.out.println("Q스킬 고정피해량 : "+skill.FirstSkillFixedDamage[num1-1]);
        System.out.println("Q스킬 투사체 속도 : "+skill.FirstSkillProjectileVelocity);
        System.out.println();
        
        System.out.println("두번째스킬(W)\r\n"+skill.SecondSkill);
        System.out.println();
        System.out.println("마나소모량 : "+skill.SecondSkillManaConsumption);
        System.out.println("사거리 : "+skill.SecondSkillRange);
        System.out.println("쿨타임 : "+skill.SecondSkillCooldown[num1-1]);
        System.out.println("피해량 : "+skill.SecondSkillDamage[num-1]);
        System.out.println("단일 대상 적중 시 피해량 : "+skill.SecondSkillDamage2[num-1]);
        System.out.println();
        
        System.out.println("세번째스킬(E)\r\n"+skill.ThirdSkill);
        System.out.println();
        System.out.println("마나소모량 : "+skill.ThirdSkillManaConsumption);
        System.out.println("사거리 : "+skill.ThirdSkillRange);
        System.out.println("쿨타임 : "+skill.ThirdSkillCooldown);
        System.out.println("피해량 : "+skill.ThirdSkillDamage[num1-1]);
        System.out.println("군중제어 지속시간 : "+skill.ThirdSkillCCTime[num1-1]);
        System.out.println("투사체 속도 : "+skill.ThirdSkillProjectileSpeed);
        System.out.println();
        
        System.out.println("스킬 레벨을 입력하세요(1~3)");
        int num2=sc.nextInt();
        
        System.out.println("네번째스킬(R)\r\n"+skill.FourthSkill);
        System.out.println();
        System.out.println("마나소모량 : "+skill.FourthSkillManaConsumption);
        System.out.println("사거리 : "+skill.FourthSkillRange);
        System.out.println("쿨타임 : "+skill.FourthSkillCooldown[num2-1]);
        System.out.println("피해량 : "+skill.FourthSkillDamage[num2-1]);
        System.out.println("R스킬 연속 시전 시 쿨타임 : "+skill.FourthSkillCooldown2);
        System.out.println("투사체 사거리 : "+skill.FourthSkillProjectileRange);                       	
	}
}

