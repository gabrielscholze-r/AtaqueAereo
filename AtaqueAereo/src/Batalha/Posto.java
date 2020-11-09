package Batalha;

public class Posto extends Inimigo{

	public Posto(int x, int y) {
		super(x, y);
	}
	
	public boolean levarBomba()
	{
		this.setMsgBatalha("BOOMM! POSTO atingido! Você foi *E L I M I N A D O*");
		this.setEstado('P');
		return true;
		
	}

}
