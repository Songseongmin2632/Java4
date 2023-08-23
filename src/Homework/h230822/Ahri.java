package Homework.h230822;

import java.util.Scanner;

class Abilities {
		public int[] Stamina=new int[18];
		public double[] StaminaRegeneration=new double[18];
		public int[] Mana=new int[18];
		public double[] ManaRegeneration=new double[18];
		public double[] Damage=new double[18];
		public double[] AttackSpeed=new double[18];
		public double[] Armor=new double[18];
		public double[] MagicResistance=new double[18];
		public int Range=550;
		public int MovementSpeed=330;
		public int[] Level=new int[18];
		public String Difficulty="상";
		public String DamageAbility="상";
		public String DefenseAbility="하";
		public String CrowdControlAbility="하";
		public String MovementAbility="상";
		public String AssistiveAbility="하";
				
		Abilities() {
			for(int i=0; i<Level.length; i++) {
				Level[i]=i+1;
			}
			for(int i=0; i<18; i++) {				
				if(Level[i]==i+1) {
					Stamina[i]=654+(i*99);
					StaminaRegeneration[i]=7+(i*0.65);
					Damage[i]=63+(i*3.4);
					AttackSpeed[i]=0.651+(i*(0.651*0.033));
					Armor[i]=32+(i*4.7);
					MagicResistance[i]=29+(i*2.05);										
				}				
			}						
		}				
}

	class Voice {
		public String PickVoice="보이지 않는 검이 가장 무서운 법";
		public String MovementVoices= 
	    "소리없이.\r\n"
	   +"금기 따윈 상관 안 해.\r\n"
	   +"그림자단이여, 용감하게 진실을 찾아라.\r\n"
	   +"가려진 길이라 해도 두려울 건 없어.\r\n"
	   +"균형 같은 소리 하지 마.\r\n"
	   +"비급이라니, 아껴 두면 무슨 소용이야.\r\n"
	   +"그림자가 나를 일깨웠다.\r\n"
	   +"균형은 약점일 뿐이야.\r\n"
	   +"진실은 바로 어둠 속에 있지.\r\n"
	   +"현명한 자라면 전통에 연연하지 않아.\r\n"
	   +"엎지른 물은 주워담을 수 없어.";		
		public String AttackVoices=
	    "가치있는 자만 살아남는 거야.\r\n"
	   +"나는 어둠 속에 숨은 검이다!\r\n"
	   +"숨통을 끊어 주마.\r\n"
	   +"속박의 굴레를 벗어.\r\n"
	   +"가슴 속에 그림자가 있지.\r\n"		
	   +"나를 부정하지 마.\r\n"
	   +"엉뚱한 스승을 따랐군.\r\n"
	   +"아무도 그림자를 피할 수 없다.\r\n"
	   +"무지한 놈들.";		
	}
	class Skill {
		public String PassiveSkill=
	    "약자 멸시(Contempt for the Weak)\r\n"
	   +"제드가 체력 50% 이하인 적을 기본 공격하면 대상의 최대 체력에 비례한 마법 피해를 추가로 입힙니다.\r\n"
	   +"같은 적 챔피언에게는 이 효과가 10초에 한 번씩만 적용됩니다.\r\n"
	   +"에픽 몬스터 상대 최대 피해량은 300입니다.\r\n"
	   +"정글 몬스터에게 200%의 피해를 입힙니다.\r\n"
	   +"마법피해 대상 최대 체력의 6 / 8 / 10%";
		public String FirstSkill=
		"Q-예리한 표창(Razor Shuriken)\r\n"
	   +"제드와 그림자가 표창을 던져, 각각 처음 맞는 적에게 물리 피해를 입히고\r\n"		
	   +"이후 추가로 맞히는 적에게는 각각 60%의 물리 피해를 입힙니다."; 
		public String SecondSkill=
		"W - 살아있는 그림자(Living Shadow)\r\n"
	   +"기본 지속 효과: 제드와 그림자가 같은 스킬로 동일한 대상을 공격할 때마다 제드가 기력을 얻습니다.\r\n"
	   +"사용 시: 제드의 그림자가 전방으로 질주하여, 5초간 그 자리에 유지됩니다.\r\n"
	   +"이 스킬을 재사용하면 제드가 그림자와 위치를 바꿉니다.";
		public String ThirdSkill=
		"E - 그림자 베기(Shadow Slash)\r\n"
	   +"제드와 그림자가 각각 주위 적을 베어 물리 피해를 입힙니다.\r\n"
	   +"제드가 이 스킬로 적 챔피언을 하나 맞힐 때마다 살아있는 그림자의\r\n"
	   +"재사용 대기시간이 2초씩 감소합니다.\r\n"
	   +"그림자의 스킬에 맞은 적은 1.5초 동안 둔화됩니다.\r\n"
	   +"그림자 베기로 동일한 대상을 여러 번 맞힐 경우,\r\n"
	   +"추가 피해는 입히지 않지만 1.5배의 둔화 효과가 적용됩니다.";
		public String FourthSkill=
		"제드가 잠시 대상지정불가대상으로 지정할 수 없는 상태가 되어\r\n"
	   +"적 챔피언에게 돌진하며 표식을 남깁니다.\r\n"
	   +"3초가 지나면 표식이 발동되며 물리 피해를 입히고 표식이 적용된 동안\r\n"
	   +"제드가 대상에게 가한 피해의 일부에 해당하는 피해를 추가로 입힙니다.\r\n"
	   +"돌진 시 7.5초 동안 유지되는 그림자가 남습니다.\r\n"
	   +"이 스킬을 재사용하면 제드가 이 그림자와 위치를 바꿉니다.";
		public int[] FirstSkillEnergyConsumption=new int[5];
		public int FirstSkillRange=900;
		public int FirstSkillCooldown=6;
		public double[] FirstSkillInitialDamage=new double[5];
		public double[] FirstSkillPenetratingdamage=new double[5];
		public int[] SecondSkillEnergyConsumption=new int[5];
		public int SecondSkillRange=650;
		public double[] SecondSkillCooldown=new double[5];
		public int SecondSkillRange2=1950;
		public int SecondSkillProjectionspeed=2500;
		public int ThirdSkillEnergyConsumption=40;
		public int ThirdSkillRange=290;
		public double[] ThirdSkillCooldown=new double[5];
		public double[] ThirdSkillDamage=new double[5];
		public int FourthSkillRange=625;
		public int[] FourthSkillCooldown=new int[3];
		public double FourthSkillDamage=300;
		public double[] FourthSkillDamage2=new double[3];
		public String FourthSkillRange2="제한없음";
		public int[] SkillLevel=new int[5];
		public int AdditionalAttackDamage=100;
		public int TotalAttackDamage=150;
		
		Skill() {
			for(int i=0; i<SkillLevel.length; i++) {
				SkillLevel[i]=i+1;
			}
			for(int i=0; i<5; i++) {
				if(SkillLevel[i]==i+1) {
					FirstSkillEnergyConsumption[i]=75-(i*5);
					FirstSkillInitialDamage[i]=70+(i*35)+(1.1*AdditionalAttackDamage);
					FirstSkillPenetratingdamage[i]=42+(i*21)+(0.66*AdditionalAttackDamage);
					SecondSkillEnergyConsumption[i]=40-(i*5);
					SecondSkillCooldown[i]=20-(i*1.5);
					ThirdSkillCooldown[i]=5-(i*0.5);
					ThirdSkillDamage[i]=65+(i*20);			
				}
			}
			for(int j=0; j<3; j++) {
				if(SkillLevel[j]==j+1) {
					FourthSkillCooldown[j]=120-(j*20);
					FourthSkillDamage2[j]=FourthSkillDamage*(0.25+(j*0.15))+(TotalAttackDamage*0.65);
				}
			}
		}
	}
	class Rune {
		public String DominationBuilds=
		"핵심 룬-지배(감전, 피의 맛, 사냥의 증표, 궁극의 사냥꾼)\r\n"
	   +"보조 룬1-마법(깨달음, 주문작열)\r\n"	   
	   +"보조 룬2-정밀(침착, 강인함)\r\n"
	   +"보조 룬3-결의1(재생의 바람, 불굴의 의지)\r\n"
	   +"보조 룬4-결의2(뼈 방패, 불굴의 의지)";				
		public String PrecisionBuilds=
		"핵심 룬-정밀(정복자, 침착, 강인함, 최후의 일격)\r\n"
	   +"보조 룬1-마법1(빛의 망토, 깨달음)\r\n"
	   +"보조 룬2-마법2(빛의 망토, 주문 작열)"	;
	}
	class Item {
		public String StartItems="롱소드\r\n"+"도란의 방패+1포션";
		public String MythicalItems="월식\r\n"+"드락사르의 황혼검\r\n"+"요우무의 유령검";
		public String AttackItems=
		"그림자 검\r\n"
	   +"자객의 발톱\r\n"
	   +"굶주린 히드라\r\n"
	   +"칠흑의 양날 도끼\r\n"
	   +"세릴다의 원한\r\n"
	   +"독사의 송곳니\r\n"
	   +"징수의 총\r\n"
	   +"원칙의 원형낫\r\n"
	   +"쇼진의 창";
		public String DefensiveItems=
		"밤의 끝자락\r\n"
	   +"맬모셔스의 아귀\r\n"
	   +"수호 천사\r\n"
	   +"은빛 여명-수은 장식띠";
		public String shoes=
		"명석함의 아이오니아 장화\r\n"
	   +"기동력의 장화\r\n"
	   +"판금장화\r\n"
	   +"헤르메스의 발걸음\r\n"
	   +"신속의 장화";				
	}
	public class Ahri {

		public String Job="역할군 : 마법사(암살자)";
		public String Belong="소속 : 아이오니아";
		public String BackGround="배경\r\n"
	   +"룬테라가 가진 잠재력과 선천적으로 연결된 아리는 마법을 순수한 에너지의 구체로 변환할 수 있는 바스타야다.\r\n"
	   +"아리는 먹잇감의 감정을 질리도록 조종하며 가지고 놀다가 마지막에 생명의 정수를 흡수하는 것을 즐긴다.\r\n"
	   +"타고난 포식자지만, 먹어치우는 영혼에 담긴 기억의 편린을 받아들일 때마다 거기에 감정 이입하게 된다.";		 	  
		public String DamageType="공격타입 : 마법(AP)";
		public String Merit="장점\r\n"
	   +"스킬셋의 뛰어난 유틸성\r\n"
	   +"뛰어난 기동력 및 합류 능력\r\n"
	   +"라인전에서 극상성인 챔피언이 적음\r\n"
	   +"로우리스크 하이리턴\r\n"
	   +"유리한 상황에서 초중후반 내내 강함";	   
		public String Disadvantages="단점\r\n"
	   +"떨어지는 딜링 능력\r\n"
	   +"높은 매혹 의존도\r\n"
	   +"강제되는 팀플레이와 높은 아군 의존도로 인한 불리한 상황에서의 무기력함\r\n"
	   +"리보다 교전 능력이 뛰어난 상대에 대한 취약성\r\n"
	   +"매우 높은 궁극기 의존도";
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
	    System.out.println(ahri.Merit);
	    System.out.println();
	    System.out.println(ahri.Disadvantages);
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
	    System.out.println("기력 : "+abilities.Energy);
	    System.out.println("기력 재생 : "+abilities.EnergyRegeneration);
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
        
        Voice voice=new Voice();
        System.out.println();
        System.out.println("대사");
        System.out.println();
        System.out.println("선택 시 대사\r\n"+voice.PickVoice);
        System.out.println();
        System.out.println("이동 대사\r\n"+voice.MovementVoices);
        System.out.println();
        System.out.println("공격 대사\r\n"+voice.AttackVoices);
       
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
        System.out.println("기력소모량 : "+skill.FirstSkillEnergyConsumption[num1-1]);
        System.out.println("사거리 : "+skill.FirstSkillRange);
        System.out.println("쿨타임 : "+skill.FirstSkillCooldown);
        System.out.println("표창 최초 피해량 : "+skill.FirstSkillInitialDamage[num1-1]);
        System.out.println("표창 관통 피해량 : "+skill.FirstSkillPenetratingdamage[num1-1]);
        System.out.println();
        System.out.println("두번째스킬(W)\r\n"+skill.SecondSkill);
        System.out.println();
        System.out.println("기력소모량 : "+skill.SecondSkillEnergyConsumption[num1-1]);
        System.out.println("사거리 : "+skill.SecondSkillRange);
        System.out.println("쿨타임 : "+skill.SecondSkillCooldown[num1-1]);
        System.out.println("그림자와 위치를 바꿀 수 있는 사거리 : "+skill.SecondSkillRange2);
        System.out.println("그림자 투사 속도 : "+skill.SecondSkillProjectionspeed);
        System.out.println();
        System.out.println("세번째스킬(E)\r\n"+skill.ThirdSkill);
        System.out.println();
        System.out.println("기력소모량 : "+skill.ThirdSkillEnergyConsumption);
        System.out.println("사거리 : "+skill.ThirdSkillRange);
        System.out.println("쿨타임 : "+skill.ThirdSkillCooldown[num1-1]);
        System.out.println("공격력 : "+skill.ThirdSkillDamage[num1-1]);
        System.out.println();
        System.out.println("스킬 레벨을 입력하세요(1~3)");
        int num2=sc.nextInt();
        System.out.println("네번째스킬(R)\r\n"+skill.FourthSkill);
        System.out.println();
        System.out.println("사거리 : "+skill.FourthSkillRange);
        System.out.println("쿨타임 : "+skill.FourthSkillCooldown[num2-1]);
        System.out.println("R기본+추가 피해량 : "+skill.FourthSkillDamage);
        System.out.println("R2차 피해량 : "+skill.FourthSkillDamage2[num2-1]);
        System.out.println("R그림자의 위치 변경 가능 범위 : "+skill.FourthSkillRange2);
        System.out.println("R기본+추가 피해량 : "+skill.FourthSkillDamage);
        
        Rune rune=new Rune();
        System.out.println();
        System.out.println("룬");
        System.out.println();
        System.out.println("지배빌드\r\n"+rune.DominationBuilds);
        System.out.println();
        System.out.println("정밀빌드\r\n"+rune.PrecisionBuilds);
        
        Item item=new Item();
        System.out.println();
        System.out.println("아이템");
        System.out.println();
        System.out.println("시작 아이템\r\n"+item.StartItems);
        System.out.println();
        System.out.println("신화급 아이템\r\n"+item.MythicalItems);
        System.out.println();
        System.out.println("공격 아이템\r\n"+item.AttackItems);
        System.out.println();
        System.out.println("방어 아이템\r\n"+item.DefensiveItems);
        System.out.println();
        System.out.println("신발\r\n"+item.shoes);
        
	
	}
}
