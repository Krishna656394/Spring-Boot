package in.strikes;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//@Component
public class UserService implements BeanNameAware, ApplicationContextAware {
    public UserService(){
        System.out.println("User Constructor Called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name Is "+name);
    }

    public String getBean(){
        return "userBean";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext name is "+applicationContext.getDisplayName());
    }
}

//Jin Method ko Spring Call karta hai usko callback Method bolte hai