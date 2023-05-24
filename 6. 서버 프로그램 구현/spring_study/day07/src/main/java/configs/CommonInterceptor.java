package configs;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommonInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

<<<<<<< HEAD
        request.setAttribute("commonValue", "공통값!");

        return true;
    }
}
=======
        request.setAttribute("commonValue", "공통값");

        return true;
    }
}
>>>>>>> 61fd14af1414e60d0cd581d87688cf376330dbbb
