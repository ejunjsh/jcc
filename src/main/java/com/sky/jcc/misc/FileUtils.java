package com.sky.jcc.misc;

import com.sky.jcc.compiler.ClassFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/*
 * Helper class to load and store classFile in disk
 */

public class FileUtils {

	// store object by serialyzing into file (root dir of execution)
	public static void objectToFile(ClassFile object, String fileName) {
		File fileOut = new File(fileName);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileOut))) {
			oos.writeObject(object);
			System.out.println("\nProgram compiled into: " + fileName);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static Object fileToOject(String fileName) {
		ClassFile ob = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			ob = (ClassFile) ois.readObject();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return ob;
	}

}
