package finaltest;

import java.util.List;

public interface MobileManager {
	void addMobile(Mobile m) throws Exception;
	void delMobile(Mobile m) throws Exception;
	List<Mobile> searchMobile(String name) throws Exception;
	double getTotalStorage() throws Exception;
}
