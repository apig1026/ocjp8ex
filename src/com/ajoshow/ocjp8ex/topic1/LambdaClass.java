package com.ajoshow.ocjp8ex.topic1;


public class LambdaClass {

	interface OnWhateverListener {
		void onWhatever();
	}

	public void doStuff(OnWhateverListener listener) {
		listener.onWhatever();
	}

	public static void main(String[] args) {
		new AnonymousClass().doStuff(() -> {
			// do whatever stuff
			});
	}

}
