package com.example.toyproject.boxoffice.service.impl;

import com.example.toyproject.boxoffice.service.APIService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


@Service("APIService")
public class APIServiceImpl implements APIService {

    //"http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=430156241533f1d058c603178cc3ca0e&targetDt=20120101";
    //기본 URL
    //URL 구조 : url + 키 + 날짜

    private final String API_URL = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=";
    //발급받은 키
    private final String REG_KEY = "544bdf736a5e08f4d570a09fcc45ee21";

    @Override
    public void getAPIData() {
        Calendar c1 = new GregorianCalendar();

        c1.add(Calendar.DATE, -1); // 오늘날짜로부터 -1
        SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat( "yyyyMMdd", Locale.KOREA );
        Date currentTime = new Date();
        String targetDt = mSimpleDateFormat.format (c1.getTime());


        StringBuffer sb = new StringBuffer();
        sb.append(API_URL).append(REG_KEY).append("&targetDt=").append(targetDt);
        String urlStr = API_URL + REG_KEY +"&targetDt="+targetDt;

        try {

            RestTemplate template = new RestTemplate();
            String res = template.getForObject(sb.toString(),String.class);
            System.out.println(res);

        } catch (Exception e){

        }
    }
}
