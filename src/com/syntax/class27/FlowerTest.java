package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;
//import com.syntax.class27.Tulip.Rose;

public class FlowerTest {
public static void main(String[] args) {
	// store flowers into array
		Flower[] flowerArray={new Rose("Rose"), new Tulip("Tulip"), new Sunflower("SunFflower")};
	//store flowers into ArrayList
		ArrayList<Flower> flowers=new ArrayList<>();
		flowers.add(new Rose("Rose"));
		flowers.add(new Tulip("Tulip"));
		flowers.add(new Sunflower("Sunflower"));
		for(int i=0; i<flowers.size(); i++) {
			flowers.get(i).bloom();
		}System.out.println("===== Advanced for loop=====");
		for(Flower a:flowers) {
			a.bloom();
		}System.out.println("======Iterator=====");
		Iterator<Flower> it=flowers.iterator();
		while(it.hasNext()) {
			it.next().bloom();
		}
		
		
		
		
}
}
