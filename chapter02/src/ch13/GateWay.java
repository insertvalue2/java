package ch13;

public class GateWay {
	
	public static int zealotCount; 
	private int gateWayId;
	private String name;

	public GateWay(int id) {
		this.gateWayId = id;
		name = "게이트웨이";
	}

	// 메서드 리턴 타입으로 객체를 생성
	//질럿 생산하기 
	public Zealot createZealot() {
		System.out.println("질럿을 생산합니다.");
		zealotCount++;
		return new Zealot("질럿" + zealotCount);
	}

}
