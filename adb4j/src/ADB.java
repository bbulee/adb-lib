import java.util.List;

/**
 * @author fengzibin
 */
public interface ADB {
	
	public Result version();

	public Result kill();

	public List<Device> devices();
	
}
