package javastudy05;

public class Bulbasaur implements Animalable, Plantable {

	@Override
	public void Grow() {
		System.out.println("등에 새싹이 자랍니다.");
	}

	@Override
	public void Photosynthesis() {
		System.out.println("솔라빔 준비");
	}

	@Override
	public void Move() {
		System.out.println("엉금엉금");
	}

	@Override
	public void Run() {
		System.out.println("폴짝폴짝");
	}

	@Override
	public void Charming() {
		System.out.println("씨씨씨 이상해씨~");
	}

}
