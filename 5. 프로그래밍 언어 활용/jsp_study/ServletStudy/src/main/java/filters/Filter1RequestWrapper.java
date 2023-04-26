package filters;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.UnsupportedEncodingException;

public class Filter1RequestWrapper extends HttpServletRequestWrapper {

    public Filter1RequestWrapper(ServletRequest request) { // 상속한 인터페이스의 생성자가 기본생성자가 없으면, 상속한 클래스도 같이 매개변수를 넣어줘야 한다
        super((HttpServletRequest) request);

        // 요청 전 공통 기능
        HttpServletRequest req = (HttpServletRequest) request;
        String method = req.getMethod().toUpperCase();
        if (method.equals("POST")) {
            try {
                req.setCharacterEncoding("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public String getParameter(String name) {
        String value = super.getParameter(name);

        if (value != null) {
            value = value.toUpperCase();
        }

        return value;
    }
}
