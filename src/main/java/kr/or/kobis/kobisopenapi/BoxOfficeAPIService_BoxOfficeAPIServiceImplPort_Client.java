
package kr.or.kobis.kobisopenapi;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import kobisopenapi.apiservice.server.boxoffice.service.BoxOfficeAPIServiceImplService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.7
 * 2020-07-04T01:12:58.125+09:00
 * Generated source version: 3.3.7
 *
 */
public final class BoxOfficeAPIService_BoxOfficeAPIServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.boxoffice.server.apiservice.kobisopenapi/", "BoxOfficeAPIServiceImplService");

    private BoxOfficeAPIService_BoxOfficeAPIServiceImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = BoxOfficeAPIServiceImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        BoxOfficeAPIServiceImplService ss = new BoxOfficeAPIServiceImplService(wsdlURL, SERVICE_NAME);
        BoxOfficeAPIService port = ss.getBoxOfficeAPIServiceImplPort();

        {
        System.out.println("Invoking searchWeeklyBoxOfficeList...");
        java.lang.String _searchWeeklyBoxOfficeList_key = "";
        java.lang.String _searchWeeklyBoxOfficeList_targetDt = "";
        java.lang.String _searchWeeklyBoxOfficeList_itemPerPage = "";
        java.lang.String _searchWeeklyBoxOfficeList_weekGb = "";
        java.lang.String _searchWeeklyBoxOfficeList_multiMovieYn = "";
        java.lang.String _searchWeeklyBoxOfficeList_repNationCd = "";
        java.lang.String _searchWeeklyBoxOfficeList_wideAreaCd = "";
        try {
            kr.or.kobis.kobisopenapi.WeeklyBoxOfficeResult _searchWeeklyBoxOfficeList__return = port.searchWeeklyBoxOfficeList(_searchWeeklyBoxOfficeList_key, _searchWeeklyBoxOfficeList_targetDt, _searchWeeklyBoxOfficeList_itemPerPage, _searchWeeklyBoxOfficeList_weekGb, _searchWeeklyBoxOfficeList_multiMovieYn, _searchWeeklyBoxOfficeList_repNationCd, _searchWeeklyBoxOfficeList_wideAreaCd);
            System.out.println("searchWeeklyBoxOfficeList.result=" + _searchWeeklyBoxOfficeList__return);

        } catch (OpenAPIFault e) {
            System.out.println("Expected exception: OpenAPIFault has occurred.");
            System.out.println(e.toString());
        }

            }
        {
        System.out.println("Invoking searchDailyBoxOfficeList...");
        java.lang.String _searchDailyBoxOfficeList_key = "";
        java.lang.String _searchDailyBoxOfficeList_targetDt = "";
        java.lang.String _searchDailyBoxOfficeList_itemPerPage = "";
        java.lang.String _searchDailyBoxOfficeList_multiMovieYn = "";
        java.lang.String _searchDailyBoxOfficeList_repNationCd = "";
        java.lang.String _searchDailyBoxOfficeList_wideAreaCd = "";
        try {
            kr.or.kobis.kobisopenapi.DailyBoxOfficeResult _searchDailyBoxOfficeList__return = port.searchDailyBoxOfficeList(_searchDailyBoxOfficeList_key, _searchDailyBoxOfficeList_targetDt, _searchDailyBoxOfficeList_itemPerPage, _searchDailyBoxOfficeList_multiMovieYn, _searchDailyBoxOfficeList_repNationCd, _searchDailyBoxOfficeList_wideAreaCd);
            System.out.println("searchDailyBoxOfficeList.result=" + _searchDailyBoxOfficeList__return);

        } catch (OpenAPIFault e) {
            System.out.println("Expected exception: OpenAPIFault has occurred.");
            System.out.println(e.toString());
        }

            }

        System.exit(0);
    }

}