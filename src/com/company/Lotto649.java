package com.company;

import com.company.IBonusNumber;
import com.company.LottoGame;

/**
 * Created by Aaron Fernandes(300773526) on 10 2015.
 */
public class Lotto649 extends LottoGame implements IBonusNumber {

	private int _bounusNum;

	public Lotto649(){
		super(6, 49);
	}

	public int bonusNumber(){
		return this._numberArray.remove(this._rnd.nextInt(this._setSize)+1);
	}

	@Override
	public String toString(){
		String out="";
		for (int i = 0; i < 5; i++) {
			super.pickElements();
			out=out+String.format("%d. ", i);
			int size=this._elementArray.size();
/*			for(int j=0;i<size;j++){
				out+=Integer.toString(this._elementArray.get(j))+", ";
			}*/

			for(Integer j: this._elementArray){
				out+=j+", ";
			}
			out+="("+bonusNumber()+")\n";
		}
		return out;
	}

}
