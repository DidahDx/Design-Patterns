package StructuralPattern.DecoratorPattern;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DecoratorEverydayDemo {

	public static void main(String args []) throws Exception {
		File file = new File("./src/StructuralPattern/DecoratorPattern/output.txt");
		file.createNewFile();
		
		OutputStream oStream = new FileOutputStream(file);
		
		DataOutputStream doStream = new DataOutputStream(oStream);
		doStream.writeChars("Inheritance");
		
		doStream.close();
		oStream.close();
	}
}
