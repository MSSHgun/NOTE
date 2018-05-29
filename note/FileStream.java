package com.hzh.IOstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;
/**
 * 
 * 文件的复制
 * @author Asus
 *
 */
public class FileStream {
	
	@Test
	public void streamDemo() throws IOException{
		//获取源文件的位置,绝对路径
		String  location = "D:\\music\\mv\\山居秋暝(经典咏流传 第五期)-art--霍尊--art-b65ab872a2c15c4e3352e1a6db35cf99.mp4";
		//获取目标文件的name
		String fileName = "山居秋暝.mp4";
		//获取目标文件的路径
		String filePath = "E:/music";
		//存放文件的路径
		File file = new File("E:/music");
		//如果不存在,则创建
		if(!file.exists()){
			file.mkdirs();
		}
		
		//输入流 直接输入路径即可,不用输入File对象,IO流底层会帮我们封装这个路径
		FileInputStream input = new FileInputStream(location);
		//输出流
		FileOutputStream output = new FileOutputStream(filePath + "/" +fileName);
		
		//接受读取的数据
		byte[] bytes = new byte[1024];
		//获取读取数据的长度
		int len = 0;
		
		while( (len = input.read(bytes)) != -1){
			output.write(bytes,0,len);
		}
		//关闭流
		input.close();
		output.close();
		
		
	}
}
