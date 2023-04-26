package filters;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class Filter1ResponseWrapper extends HttpServletResponseWrapper {

    public Filter1ResponseWrapper(ServletResponse response) {
        super((HttpServletResponse) response);

        // 응답 후 공통 기능
        System.out.println("응답 후 공통 기능 ...");
    }


}
