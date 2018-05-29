package com.basis.three;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * File类
 * 		方法:  boolean delete() 删除此抽象路径名表示的文件或目录。
 *  			boolean exists()  测试此抽象路径名表示的文件或目录是否存在。 
         
           	String getName()   返回由此抽象路径名表示的文件或目录的名称。 
           	boolean isDirectory()    测试此抽象路径名表示的文件是否是一个目录。
        
 			boolean isFile()      测试此抽象路径名表示的文件是否是一个标准文件。
      
			 String[] list() 返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录
          。 
         	boolean mkdir()  创建此抽象路径名指定的目录。 
         
 			boolean mkdirs()   创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。 
        

           
 *
 */
public class Test04 {
	public static void main(String[] args) throws IOException {
		
		String d = "D:/aa/bb";
		File file = new File(d);
		//如果目录不存在,则创建
		if(!file.exists()){
			file.mkdirs();
		}
		
		
		String fileName = "asd.mp4";
		//读取数据
		FileInputStream fis = new FileInputStream(new File("D:\\music\\mv\\登鹳雀楼(经典咏流传 第一期)-art--果敢Duplessy疯马乐队--art-cf3b858b02dea16bfe2e8a06e67b77c6.mp4"));
		FileOutputStream fs = new FileOutputStream(d+"/"+fileName);
		byte[] bys = new byte[1024];
		
		int len = 0;
		
		while( (len = fis.read(bys)) != -1){
			fs.write(bys, 0, len);
		}
		
		fis.close();
		fs.close();
		
		
	}	
}
