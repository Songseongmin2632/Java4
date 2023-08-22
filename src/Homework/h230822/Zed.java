package Homework.h230822;

import java.util.Scanner;

class Abilities {
		public int[] Stamina=new int[18];
		public double[] StaminaRegeneration=new double[18];
		public int Energy=200;
		public int EnergyRegeneration=50;
		public double[] Damage=new double[18];
		public double[] AttackSpeed=new double[18];
		public double[] Armor=new double[18];
		public double[] MagicResistance=new double[18];
		public int Range=125;
		public int MovementSpeed=345;
		public int[] Level=new int[18];
		public String Difficulty="��";
		public String DamageAbility="��";
		public String DefenseAbility="��";
		public String CrowdControlAbility="��";
		public String MovementAbility="��";
		public String AssistiveAbility="��";
				
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
		public String PickVoice="������ �ʴ� ���� ���� ������ ��";
		public String MovementVoices= 
	    "�Ҹ�����.\r\n"
	   +"�ݱ� ���� ��� �� ��.\r\n"
	   +"�׸��ڴ��̿�, �밨�ϰ� ������ ã�ƶ�.\r\n"
	   +"������ ���̶� �ص� �η��� �� ����.\r\n"
	   +"���� ���� �Ҹ� ���� ��.\r\n"
	   +"����̶��, �Ʋ� �θ� ���� �ҿ��̾�.\r\n"
	   +"�׸��ڰ� ���� �ϱ�����.\r\n"
	   +"������ ������ ���̾�.\r\n"
	   +"������ �ٷ� ��� �ӿ� ����.\r\n"
	   +"������ �ڶ�� ���뿡 �������� �ʾ�.\r\n"
	   +"������ ���� �ֿ����� �� ����.";		
		public String AttackVoices=
	    "��ġ�ִ� �ڸ� ��Ƴ��� �ž�.\r\n"
	   +"���� ��� �ӿ� ���� ���̴�!\r\n"
	   +"������ ���� �ָ�.\r\n"
	   +"�ӹ��� ������ ����.\r\n"
	   +"���� �ӿ� �׸��ڰ� ����.\r\n"		
	   +"���� �������� ��.\r\n"
	   +"������ ������ ������.\r\n"
	   +"�ƹ��� �׸��ڸ� ���� �� ����.\r\n"
	   +"������ ���.";		
	}
	class Skill {
		public String PassiveSkill=
	    "���� ���(Contempt for the Weak)\r\n"
	   +"���尡 ü�� 50% ������ ���� �⺻ �����ϸ� ����� �ִ� ü�¿� ����� ���� ���ظ� �߰��� �����ϴ�.\r\n"
	   +"���� �� è�Ǿ𿡰Դ� �� ȿ���� 10�ʿ� �� ������ ����˴ϴ�.\r\n"
	   +"���� ���� ��� �ִ� ���ط��� 300�Դϴ�.\r\n"
	   +"���� ���Ϳ��� 200%�� ���ظ� �����ϴ�.\r\n"
	   +"�������� ��� �ִ� ü���� 6 / 8 / 10%";
		public String FirstSkill=
		"Q-������ ǥâ(Razor Shuriken)\r\n"
	   +"����� �׸��ڰ� ǥâ�� ����, ���� ó�� �´� ������ ���� ���ظ� ������\r\n"		
	   +"���� �߰��� ������ �����Դ� ���� 60%�� ���� ���ظ� �����ϴ�."; 
		public String SecondSkill=
		"W - ����ִ� �׸���(Living Shadow)\r\n"
	   +"�⺻ ���� ȿ��: ����� �׸��ڰ� ���� ��ų�� ������ ����� ������ ������ ���尡 ����� ����ϴ�.\r\n"
	   +"��� ��: ������ �׸��ڰ� �������� �����Ͽ�, 5�ʰ� �� �ڸ��� �����˴ϴ�.\r\n"
	   +"�� ��ų�� �����ϸ� ���尡 �׸��ڿ� ��ġ�� �ٲߴϴ�.";
		public String ThirdSkill=
		"E - �׸��� ����(Shadow Slash)\r\n"
	   +"����� �׸��ڰ� ���� ���� ���� ���� ���� ���ظ� �����ϴ�.\r\n"
	   +"���尡 �� ��ų�� �� è�Ǿ��� �ϳ� ���� ������ ����ִ� �׸�����\r\n"
	   +"���� ���ð��� 2�ʾ� �����մϴ�.\r\n"
	   +"�׸����� ��ų�� ���� ���� 1.5�� ���� ��ȭ�˴ϴ�.\r\n"
	   +"�׸��� ����� ������ ����� ���� �� ���� ���,\r\n"
	   +"�߰� ���ش� ������ ������ 1.5���� ��ȭ ȿ���� ����˴ϴ�.";
		public String FourthSkill=
		"���尡 ��� ��������Ұ�������� ������ �� ���� ���°� �Ǿ�\r\n"
	   +"�� è�Ǿ𿡰� �����ϸ� ǥ���� ����ϴ�.\r\n"
	   +"3�ʰ� ������ ǥ���� �ߵ��Ǹ� ���� ���ظ� ������ ǥ���� ����� ����\r\n"
	   +"���尡 ��󿡰� ���� ������ �Ϻο� �ش��ϴ� ���ظ� �߰��� �����ϴ�.\r\n"
	   +"���� �� 7.5�� ���� �����Ǵ� �׸��ڰ� �����ϴ�.\r\n"
	   +"�� ��ų�� �����ϸ� ���尡 �� �׸��ڿ� ��ġ�� �ٲߴϴ�.";
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
		public String FourthSkillRange2="���Ѿ���";
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
		"�ٽ� ��-����(����, ���� ��, ����� ��ǥ, �ñ��� ��ɲ�)\r\n"
	   +"���� ��1-����(������, �ֹ��ۿ�)\r\n"	   
	   +"���� ��2-����(ħ��, ������)\r\n"
	   +"���� ��3-����1(����� �ٶ�, �ұ��� ����)\r\n"
	   +"���� ��4-����2(�� ����, �ұ��� ����)";				
		public String PrecisionBuilds=
		"�ٽ� ��-����(������, ħ��, ������, ������ �ϰ�)\r\n"
	   +"���� ��1-����1(���� ����, ������)\r\n"
	   +"���� ��2-����2(���� ����, �ֹ� �ۿ�)"	;
	}
	class Item {
		public String StartItems="�ռҵ�\r\n"+"������ ����+1����";
		public String MythicalItems="����\r\n"+"����縣�� Ȳȥ��\r\n"+"��칫�� ���ɰ�";
		public String AttackItems=
		"�׸��� ��\r\n"
	   +"�ڰ��� ����\r\n"
	   +"���ָ� �����\r\n"
	   +"ĥ���� �糯 ����\r\n"
	   +"�������� ����\r\n"
	   +"������ �۰���\r\n"
	   +"¡���� ��\r\n"
	   +"��Ģ�� ������\r\n"
	   +"������ â";
		public String DefensiveItems=
		"���� ���ڶ�\r\n"
	   +"�ȸ�Ž��� �Ʊ�\r\n"
	   +"��ȣ õ��\r\n"
	   +"���� ����-���� ��Ķ�";
		public String shoes=
		"������ ���̿��Ͼ� ��ȭ\r\n"
	   +"�⵿���� ��ȭ\r\n"
	   +"�Ǳ���ȭ\r\n"
	   +"�츣�޽��� �߰���\r\n"
	   +"�ż��� ��ȭ";				
	}
	public class Zed {

		public String Job="���ұ� : �ϻ���";
		public String Belong="�Ҽ� : ���̿��Ͼ�";
		public String BackGround="���\r\n"
	   +"����� �ص��� ���ں��ϰ� �������� ���� �ι���,\r\n"
	   +"�켭�� ħ������ ���Ƴ��� ���� ���̿��Ͼ��� ���� ������ ������ �����Ų�ٴ� �ǵ��� ������ �׸��ڴ��� �����̴�.\r\n"
	   +"���̿��Ͼ� ���� �� ����� �켭������ �̱�� �ʹٴ� ������ �������� �׸��� ����� ������ ������ ���ȴ�.\r\n"		 
	   +"�� ����� ����� ������ ��ŭ�̳� �����ϰ�, ����ڸ� Ÿ���� ��� ���߸��� ���̾���.\r\n"
	   +"������ ����� �ƶ������� �ʰ� ��� �ݴ��� ����� ������.\r\n"
	   +"�ڽ��� ������, �ƴϸ� �ڽ��� ���� �׸��ڴܿ� ������ �� ���� ���� ������ �ı��ϱ� ����.";
		public String DamageType="����Ÿ�� : ����(AD)";
		public String Merit="����\r\n"
	   +"���ϰ� �������� ������\r\n"
	   +"����� �Ĺ� �� �⵿���� ���� � �ɷ�\r\n"
	   +"�������� ���� ��� ��ŷ �ɷ�\r\n"
	   +"Ȯ�����̰� ����ũ�� ���� ����\r\n"
	   +"�׸��ڸ� Ȱ���� ��׷� ������ ���� �ɷ�\r\n"
	   +"���ø� Ǫ�ÿ� ����캼�� ������ ����";
		public String Disadvantages="����\r\n"
	   +"���� ����ִ� �׸���(W) ������\r\n"
	   +"����� ������ �� ���� ���ӷ�\r\n"
	   +"���� �ñر� �������� ��Ŀ������ �Ѱ�\r\n"
	   +"������ �� �⿩���� ����� ��ġ������ ���� ���� ��Ÿ �⿩��\r\n"
	   +"��ٷο� � �� ���� ���̵��� ���� ���Ϸ� �� ����1";
		public String Line="���� : �̵�";	
		
	public static void main(String[] args) {
	    Zed zed=new Zed();
	    System.out.println("����(Zed) �׸����� ����(the Master of Shadows)");
	    System.out.println(zed.Job);
	    System.out.println(zed.Belong);
	    System.out.println(zed.BackGround);
	    System.out.println();
	    System.out.println(zed.DamageType);
	    System.out.println();
	    System.out.println(zed.Merit);
	    System.out.println();
	    System.out.println(zed.Disadvantages);
	    System.out.println();
	    System.out.println(zed.Line);
	    
	    Scanner sc=new Scanner(System.in);
	    Abilities abilities=new Abilities();
	    System.out.println();
	    System.out.println("�ɷ�ġ");
	    System.out.println("������ �Է��ϼ���(1~18)");
	    int num =sc.nextInt();
	    System.out.println("ü�� : "+abilities.Stamina[num-1]);
	    System.out.println("ü�� ��� : "+abilities.StaminaRegeneration[num-1]);
	    System.out.println("��� : "+abilities.Energy);
	    System.out.println("��� ��� : "+abilities.EnergyRegeneration);
	    System.out.println("���ݷ� : "+abilities.Damage[num-1]);
	    System.out.println("���ݼӵ� : "+abilities.AttackSpeed[num-1]);
        System.out.println("���� : "+abilities.Armor[num-1]);
        System.out.println("�������׷� : "+abilities.MagicResistance[num-1]);
        System.out.println("��Ÿ� : "+abilities.Range);
        System.out.println("�̵��ӵ� : "+abilities.MovementSpeed);
        System.out.println("è�Ǿ� ���̵� : "+abilities.Difficulty);
        System.out.println("è�Ǿ� ���ݴɷ� : "+abilities.DamageAbility);
        System.out.println("è�Ǿ� ���ɷ� : "+abilities.DefenseAbility);
        System.out.println("��������ɷ� : "+abilities.CrowdControlAbility);
        System.out.println("è�Ǿ� �̵��ɷ� : "+abilities.MovementAbility);
        System.out.println("è�Ǿ� �����ɷ� : "+abilities.AssistiveAbility);
        
        Voice voice=new Voice();
        System.out.println();
        System.out.println("���");
        System.out.println();
        System.out.println("���� �� ���\r\n"+voice.PickVoice);
        System.out.println();
        System.out.println("�̵� ���\r\n"+voice.MovementVoices);
        System.out.println();
        System.out.println("���� ���\r\n"+voice.AttackVoices);
       
        Skill skill=new Skill();
        System.out.println();
        System.out.println("��ų");
        System.out.println();
        System.out.println("��ų ������ �Է��ϼ���(1~5)");
        int num1=sc.nextInt();
        System.out.println("�нú꽺ų\r\n"+skill.PassiveSkill);
        System.out.println();
        System.out.println("ù��°��ų(Q)\r\n"+skill.FirstSkill);
        System.out.println();
        System.out.println("��¼Ҹ� : "+skill.FirstSkillEnergyConsumption[num1-1]);
        System.out.println("��Ÿ� : "+skill.FirstSkillRange);
        System.out.println("��Ÿ�� : "+skill.FirstSkillCooldown);
        System.out.println("ǥâ ���� ���ط� : "+skill.FirstSkillInitialDamage[num1-1]);
        System.out.println("ǥâ ���� ���ط� : "+skill.FirstSkillPenetratingdamage[num1-1]);
        System.out.println();
        System.out.println("�ι�°��ų(W)\r\n"+skill.SecondSkill);
        System.out.println();
        System.out.println("��¼Ҹ� : "+skill.SecondSkillEnergyConsumption[num1-1]);
        System.out.println("��Ÿ� : "+skill.SecondSkillRange);
        System.out.println("��Ÿ�� : "+skill.SecondSkillCooldown[num1-1]);
        System.out.println("�׸��ڿ� ��ġ�� �ٲ� �� �ִ� ��Ÿ� : "+skill.SecondSkillRange2);
        System.out.println("�׸��� ���� �ӵ� : "+skill.SecondSkillProjectionspeed);
        System.out.println();
        System.out.println("����°��ų(E)\r\n"+skill.ThirdSkill);
        System.out.println();
        System.out.println("��¼Ҹ� : "+skill.ThirdSkillEnergyConsumption);
        System.out.println("��Ÿ� : "+skill.ThirdSkillRange);
        System.out.println("��Ÿ�� : "+skill.ThirdSkillCooldown[num1-1]);
        System.out.println("���ݷ� : "+skill.ThirdSkillDamage[num1-1]);
        System.out.println();
        System.out.println("��ų ������ �Է��ϼ���(1~3)");
        int num2=sc.nextInt();
        System.out.println("�׹�°��ų(R)\r\n"+skill.FourthSkill);
        System.out.println();
        System.out.println("��Ÿ� : "+skill.FourthSkillRange);
        System.out.println("��Ÿ�� : "+skill.FourthSkillCooldown[num2-1]);
        System.out.println("R�⺻+�߰� ���ط� : "+skill.FourthSkillDamage);
        System.out.println("R2�� ���ط� : "+skill.FourthSkillDamage2[num2-1]);
        System.out.println("R�׸����� ��ġ ���� ���� ���� : "+skill.FourthSkillRange2);
        System.out.println("R�⺻+�߰� ���ط� : "+skill.FourthSkillDamage);
        
        Rune rune=new Rune();
        System.out.println();
        System.out.println("��");
        System.out.println();
        System.out.println("�������\r\n"+rune.DominationBuilds);
        System.out.println();
        System.out.println("���к���\r\n"+rune.PrecisionBuilds);
        
        Item item=new Item();
        System.out.println();
        System.out.println("������");
        System.out.println();
        System.out.println("���� ������\r\n"+item.StartItems);
        System.out.println();
        System.out.println("��ȭ�� ������\r\n"+item.MythicalItems);
        System.out.println();
        System.out.println("���� ������\r\n"+item.AttackItems);
        System.out.println();
        System.out.println("��� ������\r\n"+item.DefensiveItems);
        System.out.println();
        System.out.println("�Ź�\r\n"+item.shoes);
        
	
	}
}
