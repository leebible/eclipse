package kr.or.ddit.basic.Jan04;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOTest01 {
	public static void main(String[] args) {
		try {
			FileOutputStream fout =
					new FileOutputStream("d:/d_other/test.dat");
			
			//자료형 단위로 출력할 보조 스트림(DataOutputStream)객체 생성
			DataOutputStream dout = new DataOutputStream(fout);
			
			dout.writeInt(200); 	  //정수형 출력
			dout.writeFloat(123.45f); //실수형 출력
			dout.writeBoolean(false); //논리형 출력
			dout.writeUTF("ABCDEabcde"); //문자열 출력
			
			System.out.println("출력 완료");
			
			dout.close();
		}catch(IOException e) {
			
		}
		
		// ----------------------------------------------------------------------
		try {
			// 출력한 자료 읽어오기
			FileInputStream fin = 
					new FileInputStream("d:/d_other/test.dat");
			DataInputStream din = new DataInputStream(fin);
			
			//DataInputStream으로 자료를 읽어올 때는
			//DataOutputStream으로 출력한 순서와 같은 순서로 읽어와야 된다.
			System.out.println("정수형 : "+din.readInt());
			System.out.println("실수형 : "+din.readFloat());
			System.out.println("논리형 : "+din.readBoolean());
			System.out.println("문자열 : "+din.readUTF());
			
			System.out.println("읽기 작업 끝");
			din.close();
		}catch(IOException e) {
			
		}
	}
}
