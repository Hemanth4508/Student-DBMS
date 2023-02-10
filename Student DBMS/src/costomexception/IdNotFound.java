package costomexception;

public class IdNotFound extends RuntimeException
{
	private String message;
	public IdNotFound(String message)
	{
		this.message=message;
		
	}
	@Override
	public String getMessage()
	{
		return this.message;
	}

	

}
