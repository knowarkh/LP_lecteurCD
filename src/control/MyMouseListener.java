package control;
import ihm.*;
import datas.*;

public class MyMouseListener implements ActionListener{
	private FrameLectCD maF;

	public MyMouseListener(FrameLectCD f){
		this.maF=f;
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==maF.getOnOFF()){
			//TODO
		}
		else if(){
			//TODO
		}
	}
}