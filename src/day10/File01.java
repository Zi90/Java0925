package day10;

import java.io.IOException;

public class File01 {

	public static void main(String[] args) {
		// file : java.io.* 에서 제공하는 클래ㅑ스들은 try~catch / throws를 해줘야함
		// Input / OutputStream (IOStream) : 단방향으로 데이터가 흘러가는 형태
		/* java는 입력스트림, 출력스트림을 통해 데이터를 입출력함.
		 * 다양한  장치에 독립적으로 운영, 일관성있게 입출력을 유지하기 위해
		 * 입출력 스트림을 통해 일관성, 독립성 제고
		 * 
		 * 두 가지 형태의 스트림
		 * - 바이트 형태의 스트림 : 기본(문자, 그림, 멀티미디어)
		 * - 문자 형태의 스트림 : 문자만 입쳑할 때 사용
		 * 
		 * 1. 바이트 스트림
		 * - 입력(InputSteam) : FileInputStream, BufferedInputStram, DataInputStream...
		 * - 출력(OutputSream) : FileOLutputStream, BufferedOutputSteam, DataOutputStream...
		 * 2. 문자 스트림
		 * - 입력(Reader) : FileReader, BufferedReader, InputStramReader...
		 * - 출력(Writer) : FileWriter, BufferedWriter, PrintWriter...
		 * 
		 * 기반스트림 / 보조스트림
		 * 기반스트림 : 직접 자료를 읽고 쓰는 기능이 있는 스트림
		 * - FileINputStream, FileOutputStream, FileReader, FileWriter
		 * 보조스트림 : 직접 읽고 쓰는 기능은 없지만, 추가적인 기능을 더해주기위한 스트림
		 * - Buffered~
		 */
		
		// 표준 출력(모니터=콘솔) 스트림
		System.out.println("print");
		
		// 표준 입력(키보드) 스트림
		try {
			// 바이트 단위 스트림
			int b = System.in.read();
			System.out.println("Read() > " + (char)b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 표준 에러 출력 스트림
		System.err.println("error");
		
	}

}
