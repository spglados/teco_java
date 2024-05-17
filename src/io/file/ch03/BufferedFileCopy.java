package io.file.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy {
	
	public static void main(String[] args) {
		// 기반 스트림 + 보조 스트림을 활용해서
		// 파일 복사 기능을 만들고
		// 소요 시간을 측정하시오
		
		// String sourceFilePath = "C:\\Users\\KDP\\Desktop\\logo_daum1.png";
		
		// String destinationFilePath = "daum_Copy.png";
		
		long startTime = System.nanoTime();
		
		try (FileOutputStream in = new FileOutputStream("daum_Copy2.png");
				BufferedOutputStream out = new BufferedOutputStream(in);){
			
		}
		
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("복사의 소요시간은 : " + duration);
		
		double seconds = duration / 1_000_000_000.0;
		String resultFormat = String.format("소요 시간은 : %.6f초 입니다", seconds);
		System.out.println(resultFormat);
		
	}

}
