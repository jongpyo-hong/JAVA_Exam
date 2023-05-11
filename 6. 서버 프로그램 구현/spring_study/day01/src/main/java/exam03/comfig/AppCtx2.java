package exam03.comfig;

import exam03.models.member.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "exam03.models")
//@ComponentScan(basePackages = "exam03.models", excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes = ManualBean.class))
//@ComponentScan(basePackages = "exam03.models", excludeFilters = @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, classes = {MemberDao.class, JoinService.class}))
//@ComponentScan(basePackages = "exam03.models", excludeFilters = @ComponentScan.Filter(type=FilterType.ASPECTJ, pattern="exam03.models..*Dao"))
public class AppCtx2 {

}