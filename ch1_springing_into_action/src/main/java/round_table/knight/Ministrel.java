package round_table.knight;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.io.PrintStream;

@Aspect
@RequiredArgsConstructor
public class Ministrel {
    private final PrintStream stream;

    @Pointcut("execution(* *.embarkOnQuest(..))")
    public void embark() {

    }

    @Before("embark()")
    public void signBeforeQuest() {
        stream.println("Knight is going to start his quest");
    }

    @After("embark()")
    public void signAfterQuest() {
        stream.println("Knight has done his quest");
    }
}
