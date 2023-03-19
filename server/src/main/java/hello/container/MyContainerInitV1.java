package hello.container;

import jakarta.servlet.*;

import java.util.Set;

public class MyContainerInitV1 implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        System.out.println(">>> MyContainerInitV1.onStartup");
        System.out.println(">>> MyContainerInitV1 c=" + c);
        System.out.println(">>> MyContainerInitV1 ctx=" + ctx);
    }
}
