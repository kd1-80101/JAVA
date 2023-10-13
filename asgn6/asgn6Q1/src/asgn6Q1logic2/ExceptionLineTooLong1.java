package asgn6Q1logic2;
import java.util.Arrays;

public class ExceptionLineTooLong1 extends Exception {

	public ExceptionLineTooLong1(String message) {
		super(message);

	}

	@Override
	public String toString() {
		return "ExceptionLineTooLong1 [" + getMessage() + "]";
	}

}
