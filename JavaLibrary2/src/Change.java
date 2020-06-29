import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@interface Change {
	String change() default "Changes in Student Class";
	String madeBy() default " Student ";
	String madeOn() default " Student Class";
} 


