package com.hzh.IOstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;
/**
 * 
 * �ļ��ĸ���
 * @author Asus
 *
 */
public class FileStream {
	
	@Test
	public void streamDemo() throws IOException{
		//��ȡԴ�ļ���λ��,����·��
		String  location = "D:\\music\\mv\\ɽ������(����ӽ���� ������)-art--����--art-b65ab872a2c15c4e3352e1a6db35cf99.mp4";
		//��ȡĿ���ļ���name
		String fileName = "ɽ������.mp4";
		//��ȡĿ���ļ���·��
		String filePath = "E:/music";
		//����ļ���·��
		File file = new File("E:/music");
		//���������,�򴴽�
		if(!file.exists()){
			file.mkdirs();
		}
		
		//������ ֱ������·������,��������File����,IO���ײ������Ƿ�װ���·��
		FileInputStream input = new FileInputStream(location);
		//�����
		FileOutputStream output = new FileOutputStream(filePath + "/" +fileName);
		
		//���ܶ�ȡ������
		byte[] bytes = new byte[1024];
		//��ȡ��ȡ���ݵĳ���
		int len = 0;
		
		while( (len = input.read(bytes)) != -1){
			output.write(bytes,0,len);
		}
		//�ر���
		input.close();
		output.close();
		
		
	}
}
