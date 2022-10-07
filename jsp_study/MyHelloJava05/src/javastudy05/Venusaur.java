package javastudy05;

public class Venusaur extends Ivysaur {

	//이상해꽃은 기본이동 자체도 폴짝폴짝....
	@Override
	public void Move() {
		// TODO Auto-generated method stub
		System.out.println("어딘가 징그럽다.");
		super.Run();
	}
	
	@Override
	public void Grow() {
		// TODO Auto-generated method stub
		System.out.println("등따리 꽃 자람");
	}
	
	@Override
	public void Charming() {
		// TODO Auto-generated method stub
		System.out.println("꽃꽃꽃~ 이상해꽃~");
	}
}
