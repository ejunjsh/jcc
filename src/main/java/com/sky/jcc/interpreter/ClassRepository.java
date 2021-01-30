package com.sky.jcc.interpreter;

import com.sky.jcc.compiler.ClassFile;
import com.sky.jcc.compiler.Method;
import com.sky.jcc.misc.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;


/*
 * Read the .jcc and create the ClassFile
 */

public class ClassRepository {

	ClassFile classFile;
	String fileName;
	
	public ClassRepository(String fileName){
		this.fileName = fileName;
		// file to load
		URL location = JccInterpreter.class.getProtectionDomain().getCodeSource().getLocation();
		File temp = new File("");
		String path = temp.getAbsolutePath();
		path.replace("\\", "\\\\");
		
		File file = new File(location.toString()+"\\"+fileName);
		// read the file and create classFile
		classFile = (ClassFile) FileUtils.fileToOject(fileName);
	}
	
	public Method getMethod(String methodName){
		classFile = (ClassFile) FileUtils.fileToOject(fileName);
		Method temp = classFile.getMethod(methodName); 
		temp.restart();
		return temp;
	}
	
	public static void objectToFile(ClassFile object, String fileName) {
		File fileOut = new File(fileName);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileOut))) {
			oos.writeObject(object);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static Object fileToOject(File fileIn) {
		ClassFile ob = null;
		try (ObjectInputStream i = new ObjectInputStream(new FileInputStream(fileIn))) {
			ob = (ClassFile) i.readObject();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return ob;
	}

}
