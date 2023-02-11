package Framework;

public class AppException extends Exception  {

    public AppException(Throwable cause, Object className, String message) {
        super(className +":"+message, cause);
        setDebuggingLog();
    }

    public AppException(Throwable cause, Object className) {
        super(className +":" + APP.GLOBAL.getExceptionUndefined(), cause);
        setDebuggingLog();
    }

    public AppException(String message) {
        super(APP.GLOBAL.getExceptionUndefinedClass()+":"+message);
        setDebuggingLog();
    }

    void setDebuggingLog(){
        System.out.println("{AppException}");
        System.out.println(getMessage());
        System.out.println(getCause());
    }
}
