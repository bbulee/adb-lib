package org.fengzibin.adb;

import java.util.List;

/**
 * @author fengzibin
 */
public interface IADB {

	public IResult version();

	public IResult kill();

	public List<IDevice> devices();

}
