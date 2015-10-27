package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;
//7 num from 1-49
/**
 * Created by Aaron Fernandes(300773526) on 10 2015.
 */
public abstract class LottoGame {
	protected ArrayList<Integer> _elementArray;
	protected int _elementNum;//size of set
	protected int _setSize;//max value of set
	protected ArrayList<Integer> _numberArray;
	protected SecureRandom _rnd;

	public LottoGame(int elementNum, int setSize){
		this._elementNum=elementNum;
		this._setSize=setSize;
		this._elementArray=new ArrayList<>();
		this._numberArray=new ArrayList<>();
		this._rnd=new SecureRandom();
	}

	private void _initialize(){
		this._elementArray=new ArrayList<>();
		this._numberArray=new ArrayList<>();
		//String s : arrayList
		for (int i = 1; i < this._setSize; i++) {
			this._numberArray.add(i);
		}
	}

	public void pickElements(){
		this._initialize();
		//this._elementArray.size();
		for (int i = 1; i < this._elementNum; i++) {
			this._elementArray.add(this._numberArray.remove(this._rnd.nextInt(this._numberArray.size())));
		}
	}


}
