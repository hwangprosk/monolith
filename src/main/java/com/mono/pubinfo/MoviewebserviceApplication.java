package com.mono.pubinfo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kobisopenapi.apiservice.server.boxoffice.service.BoxOfficeAPIServiceImplService;
import kr.or.kobis.kobisopenapi.DailyBoxOffice;
import kr.or.kobis.kobisopenapi.DailyBoxOfficeResult;
import kr.or.kobis.kobisopenapi.DailyBoxOfficeResult.DailyBoxOfficeList;

@SpringBootApplication
public class MoviewebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviewebserviceApplication.class, args);
		

		try {
// http://www.kobis.or.kr/kobisopenapi/homepg/main/main.do
			
			System.out.println("11111");
			
		// 회원가입을 하시고 키 값 받으시면
		String key = "430156241533f1d058c603178cc3ca0e";
		
		DailyBoxOfficeResult dailyBoxOfficeResult = new BoxOfficeAPIServiceImplService()
				.getBoxOfficeAPIServiceImplPort().searchDailyBoxOfficeList
				(key, "20200701", "5", "N", "", "");
		
		DailyBoxOfficeList list = dailyBoxOfficeResult.getDailyBoxOfficeList();
		List<DailyBoxOffice> listBox = list.getDailyBoxOffice();
		
		for(DailyBoxOffice boxOffice : listBox ) {
			

			System.out.println("AudiCnt : " + boxOffice.getAudiCnt());
		}
		
		System.out.println("222");
		
		
				//dailyBoxOfficeResult
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
