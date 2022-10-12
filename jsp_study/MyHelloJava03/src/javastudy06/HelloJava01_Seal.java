package javastudy06;

import java.util.ArrayList;

import javastudy03.GameCharacter;

public class HelloJava01_Seal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<GameCharacter> gamers = new ArrayList<GameCharacter>();
		gamers.add(new GameCharacter("����", "�ʱ޸�����"));
		gamers.add(new GameCharacter("�޴�", "�ʱ�����"));
		gamers.add(new GameCharacter("��","�����Ҹ�"));
		
		for(int i = 0; i<gamers.size(); i++)
			gamers.get(i).setLevel(1+10*i);
		
		for (GameCharacter gameCharacter : gamers) {
			gameCharacter.attack();
			gameCharacter.printInfo();
		}
		
		ArrayList<Magician> magicians = new ArrayList<Magician>();
		Magician m1 = new Magician();
		m1.set_class("�����簰��������");
		m1.setId("������");
		m1.setLevel(100);
		m1.setMp(50);
		magicians.add(m1);
		
		magicians.add(new Magician());
		magicians.get(1).set_class("�������û������");
		magicians.get(1).setId("������");
		magicians.get(1).setLevel(100);
		magicians.get(1).setMp(50);
		
		Magician m2 = new Magician();
		m2.set_class("�븶���翴������");
		m2.setId("�̵���");
		m2.setLevel(34);
		m2.setMp(3);
		magicians.add(m2);
		
		for (Magician magician : magicians) {
			magician.attack();
			magician.printInfo();
			magician.magicArrow();
		}

		ArrayList<Novice> white_hands = new ArrayList<Novice>();
		Novice n = new Novice();
		n.setHp(30);
		n.setId("����Ÿ����");
		n.setLevel(34);
		n.set_class("���");
		white_hands.add(n);
		white_hands.add(new Novice());
		white_hands.get(white_hands.size()-1).setHp(500);
		white_hands.get(white_hands.size()-1).setId("����Ÿ�̰�");
		white_hands.get(white_hands.size()-1).setLevel(1997);
		white_hands.get(white_hands.size()-1).set_class("���۳��");
		Novice n2 = new Novice();
		n2.setHp(1030);
		n2.setId("���ξ��Ѽ����");
		n2.setLevel(29);
		n2.set_class("���¼հ���");
		white_hands.add(n2);
		
		for (Novice novice : white_hands) {
			novice.attack();
			novice.printInfo();
			novice.sleep();
		}
		
		
		
	}

}
