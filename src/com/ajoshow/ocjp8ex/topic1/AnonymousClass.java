package com.ajoshow.ocjp8ex.topic1;


public class AnonymousClass {
	
	interface OnWhateverListener{ void onWhatever(); }
	
	public void doStuff(OnWhateverListener listener){
		listener.onWhatever();
	}
	
	public static void main(String[] args){
		new AnonymousClass().doStuff(new OnWhateverListener() {
			
			@Override
			public void onWhatever() {
				// do whatever sutff
			}
		});
	}
}
