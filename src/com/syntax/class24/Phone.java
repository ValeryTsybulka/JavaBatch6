package com.syntax.class24;

	public abstract class Phone {

		//implemented methods
		public void call() {
			System.out.println("Phone can make a call");
		}

		public void text() {
			System.out.println("Phone can send text");
		}

		//unimplemented methods=undefined methods=abstract methods
		public abstract void takePicture();

		public abstract void playMusic();
	}


